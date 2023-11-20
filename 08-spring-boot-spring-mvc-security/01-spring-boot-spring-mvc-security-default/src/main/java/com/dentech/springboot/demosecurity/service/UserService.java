package com.dentech.springboot.demosecurity.service;

import com.dentech.springboot.demosecurity.entity.User;
import com.dentech.springboot.demosecurity.user.WebUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	void save(WebUser webUser);

}
