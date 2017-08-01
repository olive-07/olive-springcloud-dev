package com.info.base.model;

/**
 * @author olive
 * @date 2017-08-01
 */
public class User {

	/**
	 * 编号
	 */
	private Long id;

	/**
	 * 名称
	 */
	private String userName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}