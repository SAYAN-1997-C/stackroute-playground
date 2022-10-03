package com.stackroute.authorizationapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.authorizationapp.model.Userprofile;
import com.stackroute.authorizationapp.repo.UserRepo;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo urepo;
	
	@Override
	public Userprofile registerUser(Userprofile userobj) {
		 
	Userprofile result=	urepo.save(userobj);
	return result;
		
	}

	@Override
	public boolean validateUser(String mailid, String password) {
		Userprofile obj=urepo.findByMailidAndPassword(mailid, password);
		
		if(obj==null)
			return false;
		else
			return true;
	}

}
