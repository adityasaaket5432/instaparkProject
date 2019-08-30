package com.park.instapark.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.park.instapark.dto.userdto;
import com.park.instapark.mapper.mapper;
import com.park.instapark.model.user;
import com.park.instapark.repo.userrepo;
@Service

public class usererviceImpl implements userService {
	@Autowired
	userrepo ur;
	@Autowired
	EntityManager em;
	
	@Autowired
	mapper mapp;

	@Override
	public userdto registerUser(userdto udto)  {
		user u=mapp.udtotoUser(udto);
		user urr=null;
		
		if(udto.getAddress()!=null) {
			udto.setHostflag(true);
			urr=ur.save(u);
		}
		else {
			urr=ur.save(u);
		}
		
		 return mapp.utoUserdto(urr);
     }

	@Override
	public List<userdto> getUsers() {
		List<userdto> udtolist=new ArrayList<userdto>();
		
		
		List<user> users=ur.findAll();
		if(users!=null) {
		for(user u:users) {
			udtolist.add(mapp.utoUserdto(u));
		}}
			return udtolist;
	}

	@Override
	public userdto userlogin(String email, String password) {

		try {
		System.out.println(email+password);
		Query q=em.createQuery("SELECT u FROM user u WHERE u.email = :email and u.password = :password ");
		q.setParameter("email", email);
		q.setParameter("password", password);
		user u=(user) q.getSingleResult();
		System.out.println(u);
		
		return mapp.utoUserdto(u);
		
		}catch(javax.persistence.NoResultException e) {
			return null;
		}
	}

}
