package com.info.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.base.dao.UserDao;
import com.info.base.model.User;
import com.info.base.service.UserService;

/**
 * @author olive
 * @date 2017-08-01
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User getUserById(int id) {
		return userDao.selectByPrimaryKey(id);
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}
}
