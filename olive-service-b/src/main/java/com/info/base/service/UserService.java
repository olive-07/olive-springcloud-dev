package com.info.base.service;

import java.util.List;

import com.info.base.model.User;

/**
 * @author olive
 * @date 2017-08-01
 */
public interface UserService {

	public User getUserById(int id);

	public List<User> getAllUsers();
}
