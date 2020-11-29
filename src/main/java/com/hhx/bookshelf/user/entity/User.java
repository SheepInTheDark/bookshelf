package com.hhx.bookshelf.user.entity;

/**
 * user
 *
 * @author huanghuaxin
 * 2020/11/27
 */
public class User {
	/**
	 * id
	 */
	private Integer id;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 密码
	 */
	private String passWord;
	/**
	 * 性别
	 */
	private Character gender;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 电话号码
	 */
	private Integer phone;

	public Integer getId () {
		return id;
	}

	public void setId (Integer id) {
		this.id=id;
	}

	public String getUserName () {
		return userName;
	}

	public void setUserName (String userName) {
		this.userName=userName;
	}

	public String getPassWord () {
		return passWord;
	}

	public void setPassWord (String passWord) {
		this.passWord=passWord;
	}

	public Character getGender () {
		return gender;
	}

	public void setGender (Character gender) {
		this.gender=gender;
	}

	public String getEmail () {
		return email;
	}

	public void setEmail (String email) {
		this.email=email;
	}

	public Integer getPhone () {
		return phone;
	}

	public void setPhone (Integer phone) {
		this.phone=phone;
	}
}



