package com.familykitchen.service;

import com.familykitchen.bean.UserVO;

public interface UserService {
	/**
	 * �����û�
	 * @param user
	 */
	public void addUser(UserVO uservo) throws Exception;
	
	/**
	 * �޸��û�����
	 * @param user
	 */
	public void updateUserPwd(int pk_user, String pwd) throws Exception;
	
	/**
	 * �����ֻ��ź���������û�
	 * @param telphone
	 * @param pwd
	 * @return
	 */
	public UserVO getUserByTelAndPwd(String telphone, String password) throws Exception;
	
	/**
	 * ��ѯָ���ֻ������û�����
	 * @param telphone
	 * @return
	 */
	public int getUserByTelphone(String telphone) throws Exception;
	
	/**
	 * ɾ���û�
	 * @param pk_user
	 */
	public void deleteUser(int pk_user) throws Exception;
	
	/**
	 * ����userID��ѯuservo
	 * @param pk_user
	 * @return 
	 */
	public UserVO getUserVOByID(int pk_user) throws Exception;
}
