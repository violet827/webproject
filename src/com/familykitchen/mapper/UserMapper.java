package com.familykitchen.mapper;

import java.util.HashMap;

import com.familykitchen.bean.UserVO;

public interface UserMapper {
	
	
	/**
	 * �����û�
	 * @param user
	 */
	public void addUser(UserVO uservo);
	
	/**
	 * ��ѯָ���ֻ������û�����
	 * @param telphone
	 * @return
	 */
	public int getUserByTelphone(String telphone);
	
	/**
	 * �޸��û�����
	 * @param user
	 */
	public void updateUserPwd(UserVO uservo);
	
	/**
	 * �����ֻ��ź���������û�
	 * @param telphone
	 * @param pwd
	 * @return
	 */
	public UserVO getUserByTelAndPwd(HashMap<String, Object> map);
	
	/**
	 * ɾ���û�
	 * @param pk_user
	 */
	public void deleteUser(int pk_user);
	
	/**
	 * ����userID��ѯuservo
	 * @param pk_user
	 * @return 
	 */
	public UserVO getUserVOByID(int pk_user);
}
