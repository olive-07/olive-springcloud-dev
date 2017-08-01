package com.info.base.dao;

import java.util.List;

import com.info.base.model.User;
/**
 * @author olive
 * @date 2017-08-01
 */
public interface UserDao {

	User selectByPrimaryKey(Integer id);

	List<User> getAllUsers();
}
