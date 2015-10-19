package com.familykitchen.service;

import java.util.List;

import com.familykitchen.bean.UserAddressVO;

public interface UserAddressService {

	/**
	 * 新增地址
	 * @param UserAddress
	 */
	public void addUserAddress(UserAddressVO vo) throws Exception;
	
	/**
	 * 更新地址
	 * @param UserAddress
	 */
	public void updateUserAddress(UserAddressVO vo) throws Exception;
	
	/**
	 * 删除地址
	 * @param pk_UserAddress
	 */
	public void deleteUserAddress(int pk_useraddress) throws Exception;
	
	/**
	 * 查询指定地址
	 * @param pk_address
	 * @return
	 */
	public UserAddressVO getAddressByID(int pk_address) throws Exception;
	
	/**
	 * 获取用户默认地址
	 * @param pk_user
	 * @return
	 */
	public UserAddressVO getUserDefaultAddressByID(int pk_user) throws Exception;
	
	/**
	 * 获取用户厨房地址
	 * @param pk_user
	 * @return
	 */
	public UserAddressVO getUserKitchenAddressByID(int pk_user) throws Exception;
	
	/**
	 * 设置用户默认地址
	 * @param pk_user
	 * @param pk_address
	 */
	public void setUserDefaultAddressByID(int pk_user, int pk_address) throws Exception;
	
	/**
	 * 更新指定地址的默认标记
	 * @param map
	 */
	public void updateAddressDefaultFlag(int pk_address, int defaultflag) throws Exception;
	
	/**
	 * 获取用户所有地址信息
	 * @param pk_user
	 * @return
	 */
	public List<UserAddressVO> getAllUserAddressInfoByID(int pk_user) throws Exception;
	
	/**
	 * 获取用户所有收货地址信息（剔除厨房地址）
	 * @param pk_user
	 * @return
	 */
	public List<UserAddressVO> getAllUserReceiveAddressInfoByID(int pk_user) throws Exception;
	
}
