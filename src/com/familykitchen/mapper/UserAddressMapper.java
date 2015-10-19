package com.familykitchen.mapper;

import java.util.HashMap;
import java.util.List;

import com.familykitchen.bean.UserAddressVO;

public interface UserAddressMapper {

	/**
	 * 新增地址
	 * @param UserAddress
	 */
	public void addUserAddress(UserAddressVO vo);
	
	/**
	 * 更新地址
	 * @param UserAddress
	 */
	public void updateUserAddress(UserAddressVO vo);
	
	/**
	 * 删除地址
	 * @param pk_UserAddress
	 */
	public void deleteUserAddress(int pk_useraddress);
	
	/**
	 * 查询指定地址
	 * @param pk_address
	 * @return
	 */
	public UserAddressVO getAddressByID(int pk_address);
	
	/**
	 * 获取用户默认地址
	 * @param pk_user
	 * @return
	 */
	public UserAddressVO getUserDefaultAddressByID(int pk_user);
	
	/**
	 * 获取用户厨房地址
	 * @param pk_user
	 * @return
	 */
	public UserAddressVO getUserKitchenAddressByID(int pk_user);
	
	/**
	 * 设置用户默认地址(更新pk_user的地址pk_address对应defaultflag为1，之前的默认地址defaultflag清空)
	 * @param pk_user
	 * @param pk_address
	 */
	public void setUserDefaultAddressByID(HashMap<String, Object> map);
	
	/**
	 * 更新指定地址的默认标记
	 * @param pk_address
	 * @param defaultflag
	 */
	public void updateAddressDefaultFlag(HashMap<String, Object> map);
	
	/**
	 * 获取用户所有地址信息
	 * @param pk_user
	 * @return
	 */
	public List<UserAddressVO> getAllUserAddressInfoByID(int pk_user);
	
	/**
	 * 获取用户所有收货地址信息（剔除厨房地址）
	 * @param pk_user
	 * @return
	 */
	public List<UserAddressVO> getAllUserReceiveAddressInfoByID(int pk_user);
}
