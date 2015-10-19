package com.familykitchen.service;

import java.util.List;

import com.familykitchen.bean.UserAddressVO;

public interface UserAddressService {

	/**
	 * ������ַ
	 * @param UserAddress
	 */
	public void addUserAddress(UserAddressVO vo) throws Exception;
	
	/**
	 * ���µ�ַ
	 * @param UserAddress
	 */
	public void updateUserAddress(UserAddressVO vo) throws Exception;
	
	/**
	 * ɾ����ַ
	 * @param pk_UserAddress
	 */
	public void deleteUserAddress(int pk_useraddress) throws Exception;
	
	/**
	 * ��ѯָ����ַ
	 * @param pk_address
	 * @return
	 */
	public UserAddressVO getAddressByID(int pk_address) throws Exception;
	
	/**
	 * ��ȡ�û�Ĭ�ϵ�ַ
	 * @param pk_user
	 * @return
	 */
	public UserAddressVO getUserDefaultAddressByID(int pk_user) throws Exception;
	
	/**
	 * ��ȡ�û�������ַ
	 * @param pk_user
	 * @return
	 */
	public UserAddressVO getUserKitchenAddressByID(int pk_user) throws Exception;
	
	/**
	 * �����û�Ĭ�ϵ�ַ
	 * @param pk_user
	 * @param pk_address
	 */
	public void setUserDefaultAddressByID(int pk_user, int pk_address) throws Exception;
	
	/**
	 * ����ָ����ַ��Ĭ�ϱ��
	 * @param map
	 */
	public void updateAddressDefaultFlag(int pk_address, int defaultflag) throws Exception;
	
	/**
	 * ��ȡ�û����е�ַ��Ϣ
	 * @param pk_user
	 * @return
	 */
	public List<UserAddressVO> getAllUserAddressInfoByID(int pk_user) throws Exception;
	
	/**
	 * ��ȡ�û������ջ���ַ��Ϣ���޳�������ַ��
	 * @param pk_user
	 * @return
	 */
	public List<UserAddressVO> getAllUserReceiveAddressInfoByID(int pk_user) throws Exception;
	
}
