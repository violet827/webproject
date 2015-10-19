package com.familykitchen.service;

import java.util.HashMap;
import java.util.List;

import com.familykitchen.bean.DishVO;
import com.familykitchen.bean.OrderVO;


public interface DishService {

	/**
	 * 新增菜品基本信息
	 * @param Dish
	 */
	public void addDishBaseInfo(DishVO dishvo) throws Exception;
	
	/**
	 * 更新菜品基本信息
	 * @param Dish
	 */
	public void updateDishBaseInfo(DishVO dishvo) throws Exception;
	
	/**
	 * 发布菜品信息
	 * @param pk_dish
	 */
	public void publishDish(int pk_dish) throws Exception;
	
	/**
	 * 根据菜品ID查询菜品
	 * @param pk_dish
	 */
	public DishVO getDishVOByID(int pk_dish) throws Exception;
	
	/**
	 * 排序查询所有用户今天已发布所有菜品
	 * @param orderby 排序字段名
	 * @param dir ASC 顺序 DESC 逆序
	 */
	public List<DishVO> getTodayApprovedDishListByOrder(String orderby, String dir) throws Exception;
	
	/**
	 * 排序查询所有用户明天已发布所有菜品
	 * @param orderby 排序字段名
	 * @param dir ASC 顺序 DESC 逆序
	 */
	public List<DishVO> getTomorrowApprovedDishListByOrder(String orderby, String dir) throws Exception;
	
	/**
	 * 查询指定用户增加的所有菜品
	 * @param pk_user
	 */
	public List<DishVO> getAllDishBaseInfoByID(int pk_user) throws Exception;
	
	/**
	 * 查询指定用户今日所有已审核的菜品
	 * @param pk_user
	 */
	public List<DishVO> getAllTodayApproveDishVOsByID(int pk_user) throws Exception;
	
	/**
	 * 查询指定用户今日所有已发布的菜品
	 * @param pk_user
	 */
	public List<DishVO> getAllTodayPublishDishVOsByID(int pk_user) throws Exception;
	
	/**
	 * 更新菜品状态
	 * @param pk_dish
	 * @param dishstatus
	 */
	public void updateDishStatus(int pk_dish, int dishstatus) throws Exception;
	
	/**
	 * 更新菜品数量
	 * @param pk_dish
	 * @param dishcount
	 */
	public void updateDishCount(int pk_dish, int dishcount) throws Exception;
	
	/**
	 * 更新菜品销量
	 * @param pk_dish
	 * @param salecount
	 */
	public void updateDishTotalSaleCount(int pk_dish, int salecount) throws Exception;
	
	/**
	 * 更新菜品点赞量
	 * @param pk_dish
	 * @param likecount
	 */
	public void updateDishLikeCount(int pk_dish) throws Exception;
	
	/**
	 * 删除菜品   查询order中无该菜品则可删除，状态改为3
	 * @param pk_dish
	 */
	public void deleteDish(int pk_dish) throws Exception;
	
	/**
	 * 根据条件查询订单
	 * @return
	 */
	public List<DishVO> getDishByCondition(int dishstatus) throws Exception;
}
