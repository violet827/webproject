package com.familykitchen.service;

import com.familykitchen.bean.UserVO;

public interface UserService {
	/**
	 * 保存用户
	 * @param user
	 */
	public void addUser(UserVO uservo) throws Exception;
	
	/**
	 * 修改用户密码
	 * @param user
	 */
	public void updateUserPwd(int pk_user, String pwd) throws Exception;
	
	/**
	 * 根据手机号和密码查找用户
	 * @param telphone
	 * @param pwd
	 * @return
	 */
	public UserVO getUserByTelAndPwd(String telphone, String password) throws Exception;
	
	/**
	 * 查询指定手机号码用户个数
	 * @param telphone
	 * @return
	 */
	public int getUserByTelphone(String telphone) throws Exception;
	
	/**
	 * 删除用户
	 * @param pk_user
	 */
	public void deleteUser(int pk_user) throws Exception;
	
	/**
	 * 根据userID查询uservo
	 * @param pk_user
	 * @return 
	 */
	public UserVO getUserVOByID(int pk_user) throws Exception;
}
