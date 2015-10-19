package com.familykitchen.mapper;

import java.util.HashMap;

import com.familykitchen.bean.UserVO;

public interface UserMapper {
	
	
	/**
	 * 保存用户
	 * @param user
	 */
	public void addUser(UserVO uservo);
	
	/**
	 * 查询指定手机号码用户个数
	 * @param telphone
	 * @return
	 */
	public int getUserByTelphone(String telphone);
	
	/**
	 * 修改用户密码
	 * @param user
	 */
	public void updateUserPwd(UserVO uservo);
	
	/**
	 * 根据手机号和密码查找用户
	 * @param telphone
	 * @param pwd
	 * @return
	 */
	public UserVO getUserByTelAndPwd(HashMap<String, Object> map);
	
	/**
	 * 删除用户
	 * @param pk_user
	 */
	public void deleteUser(int pk_user);
	
	/**
	 * 根据userID查询uservo
	 * @param pk_user
	 * @return 
	 */
	public UserVO getUserVOByID(int pk_user);
}
