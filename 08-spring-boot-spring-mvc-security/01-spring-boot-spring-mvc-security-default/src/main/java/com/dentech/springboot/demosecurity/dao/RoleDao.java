package com.dentech.springboot.demosecurity.dao;

import com.dentech.springboot.demosecurity.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
