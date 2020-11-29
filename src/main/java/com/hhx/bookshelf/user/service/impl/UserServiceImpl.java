package com.hhx.bookshelf.user.service.impl;

import com.hhx.bookshelf.user.dao.IUserDao;
import com.hhx.bookshelf.user.service.IUserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * user service
 *
 * @author huanghuaxin
 * 2020/11/27
 */
@Service
public class UserServiceImpl implements IUserService {
@Autowired
private IUserDao userDao;
	@Override
	public int register (User user) {
		return userDao.addUser(user);
	}
}



