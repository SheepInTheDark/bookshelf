package com.hhx.bookshelf.user.service;

import org.apache.catalina.User;

/**
 * user service interface
 *
 * @author huanghuaxin
 * 2020/11/27
 */
public interface IUserService {
	/**
	 * 用户注册
	 * @param user 用户信息
	 * @return 注册结果
	 */
	int register (User user);
}
