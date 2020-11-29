package com.hhx.bookshelf.user.dao;

import org.apache.catalina.User;

/**
 * user dao
 *
 * @author huanghuaxin
 * 2020/11/27
 */
public interface IUserDao {
	/**
	 * 新增用户
	 * @param user 用户信息
	 * @return 用户id
	 */
	int addUser (User user);
}
