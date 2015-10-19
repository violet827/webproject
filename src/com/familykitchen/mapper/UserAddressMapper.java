package com.familykitchen.mapper;

import java.util.HashMap;
import java.util.List;

import com.familykitchen.bean.UserAddressVO;

public interface UserAddressMapper {

	/**
	 * ������ַ
	 * @param UserAddress
	 */
	public void addUserAddress(UserAddressVO vo);
	
	/**
	 * ���µ�ַ
	 * @param UserAddress
	 */
	public void updateUserAddress(UserAddressVO vo);
	
	/**
	 * ɾ����ַ
	 * @param pk_UserAddress
	 */
	public void deleteUserAddress(int pk_useraddress);
	
	/**
	 * ��ѯָ����ַ
	 * @param pk_address
	 * @return
	 */
	public UserAddressVO getAddressByID(int pk_address);
	
	/**
	 * ��ȡ�û�Ĭ�ϵ�ַ
	 * @param pk_user
	 * @return
	 */
	public UserAddressVO getUserDefaultAddressByID(int pk_user);
	
	/**
	 * ��ȡ�û�������ַ
	 * @param pk_user
	 * @return
	 */
	public UserAddressVO getUserKitchenAddressByID(int pk_user);
	
	/**
	 * �����û�Ĭ�ϵ�ַ(����pk_user�ĵ�ַpk_address��ӦdefaultflagΪ1��֮ǰ��Ĭ�ϵ�ַdefaultflag���)
	 * @param pk_user
	 * @param pk_address
	 */
	public void setUserDefaultAddressByID(HashMap<String, Object> map);
	
	/**
	 * ����ָ����ַ��Ĭ�ϱ��
	 * @param pk_address
	 * @param defaultflag
	 */
	public void updateAddressDefaultFlag(HashMap<String, Object> map);
	
	/**
	 * ��ȡ�û����е�ַ��Ϣ
	 * @param pk_user
	 * @return
	 */
	public List<UserAddressVO> getAllUserAddressInfoByID(int pk_user);
	
	/**
	 * ��ȡ�û������ջ���ַ��Ϣ���޳�������ַ��
	 * @param pk_user
	 * @return
	 */
	public List<UserAddressVO> getAllUserReceiveAddressInfoByID(int pk_user);
}
