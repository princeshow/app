package com.ssm.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.UserMapper;
import com.ssm.pojo.User;

@Service("userService")
public class UserService implements IUserService {
	@Resource
	private UserMapper userDao;
	
	@Override
	public User getUserById(int userId) {
		
		return this.userDao.selectByPrimaryKey(userId);
	}

}
