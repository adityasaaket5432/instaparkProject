package com.park.instapark.mapper;

import org.springframework.stereotype.Component;

import com.park.instapark.dto.userdto;
import com.park.instapark.model.user;
@Component
public class mapper {
	
	public user udtotoUser(userdto udto) {
		user u=null;
		
		if(udto!=null) {
			u=new user();
			
			u.setUserid(udto.getUserid());
			u.setPhoneNumber(udto.getPhoneNumber());
			u.setPassword(udto.getPassword());
			u.setFullname(udto.getFullname());
			u.setEmail(udto.getEmail());
			u.setAddress(udto.getAddress());
			u.setHostflag(udto.isHostflag());
			
			return u;
		}
		else return u;
		
	}
	
	
	public userdto utoUserdto(user u) {
		userdto udto=null;
		
		if(u!=null) {
			udto=new userdto();
			
			udto.setUserid(u.getUserid());
			udto.setPhoneNumber(u.getPhoneNumber());
			udto.setPassword(u.getPassword());
			udto.setFullname(u.getFullname());
			udto.setEmail(u.getEmail());
			udto.setAddress(u.getAddress());
			udto.setHostflag(u.isHostflag());
			return udto;
		}
		else return udto;
		
	}
	
	
	

}
