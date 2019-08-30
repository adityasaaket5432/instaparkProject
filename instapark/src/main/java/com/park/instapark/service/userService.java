package com.park.instapark.service;

import java.util.List;

import javax.transaction.Transactional;

import com.park.instapark.dto.userdto;

@Transactional
public interface userService {
	
	
	public List<userdto> getUsers();
	
	public userdto userlogin(String email,String password);
	public userdto registerUser(userdto udto);
	

}
