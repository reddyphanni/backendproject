package com.niit.dao;

import java.util.List;

import com.niit.models.UserDetails;

public interface UserDetailsDAO {


	public List<UserDetails> list();

	public UserDetails get(String id);

	public void saveOrUpdate(UserDetails user);

	public void delete(String id);

}
