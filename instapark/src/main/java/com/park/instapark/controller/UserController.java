package com.park.instapark.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.park.instapark.dto.commonDto;
import com.park.instapark.dto.userdto;
import com.park.instapark.model.user;
import com.park.instapark.service.userService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
	@Autowired
	userService us;
	
	
	@RequestMapping("/")
	public String getTest() {
		return "Aditya";
	}
	
	@GetMapping("/getUser")
	public commonDto getUser() {
		commonDto response=new commonDto();
		List<userdto> users=us.getUsers();
		if(users!=null) {
		response.setResultList(users);
		response.setStatus(HttpStatus.OK);
		return response;
		}
		else
		{
			response.setResultList(null);
			response.setStatus(HttpStatus.NOT_FOUND);
			return response;
		}
		
	}
	
	@PostMapping("/registerUser")
	public commonDto registerUser(@RequestBody userdto udto)
	{
		commonDto response=new commonDto();
		
		
		response.setSingleResult(us.registerUser(udto));
		response.setStatus(HttpStatus.OK);
		return response;
	
	}
	
	
	@PostMapping("/userlogin")
	public commonDto userlogin(@RequestBody userdto udto) {
		commonDto response=new commonDto();
		
		if(udto.getEmail()!=null && udto.getPassword()!=null) {
			userdto res=us.userlogin(udto.getEmail(), udto.getPassword());
			if(res!=null) {
			response.setSingleResult(res);
			response.setStatus(HttpStatus.OK);
					return response;
		     }
			else {
				response.setSingleResult(null);
				response.setStatus(HttpStatus.NOT_FOUND);
				response.setMessege("Wrong Credentials!!");
				return response;
				
			}
		}
		else {
			
			response.setSingleResult(null);
			response.setStatus(HttpStatus.NOT_FOUND);
			response.setMessege("Empty UserName or Password");
			return response;
		}
		
		
	}
	
	
	
		
	
	}
	

