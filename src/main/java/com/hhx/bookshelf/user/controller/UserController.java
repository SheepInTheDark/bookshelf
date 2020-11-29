package com.hhx.bookshelf.user.controller;

import com.hhx.bookshelf.user.service.IUserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * user controller
 *
 * @author huanghuaxin
 * 2020/11/27
 */
@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	private IUserService userService;

	/**
	 * 用户注册
	 * @param user 用户信息
	 * @return 注册结果
	 */
	@PostMapping("register")
	public String register(User user){
		int id = userService.register(user);
		return "success";
	}
}



