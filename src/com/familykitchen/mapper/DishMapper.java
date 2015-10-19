package com.familykitchen.mapper;

import java.util.HashMap;
import java.util.List;

import com.familykitchen.bean.DishVO;


public interface DishMapper {

	/**
	 * 新增菜品基本信息
	 * @param Dish
	 */
	public void addDishBaseInfo(DishVO dishvo);
	
	/**
	 * 更新菜品基本信息
	 * @param Dish
	 */
	public void updateDishBaseInfo(DishVO dishvo);
	
	/**
	 * 发布菜品信息
	 * @param pk_dish
	 */
	public void publishDish(HashMap<String, Object> map);
	
	/**
	 * 根据菜品ID查询菜品
	 * @param pk_dish
	 * @return 
	 */
	public DishVO getDishVOByID(int pk_dish);
	
	/**
	 * 排序查询所有用户今天已发布所有菜品(参数为排序字段和排序方式)
	 * @param orderby
	 */
	public List<DishVO> getTodayApprovedDishListByOrder(HashMap<String, Object> map);
	
	/**
	 * 排序查询所有用户明天已发布所有菜品(参数为排序字段和排序方式)
	 * @param orderby
	 */
	public List<DishVO> getTomorrowApprovedDishListByOrder(HashMap<String, Object> map);
	
	/**
	 * 查询指定用户增加的所有菜品
	 * @param pk_user
	 */
	public List<DishVO> getAllDishBaseInfoByID(int pk_user);
	
	/**
	 * 查询指定用户今日所有已审核的菜品
	 * @param pk_user
	 */
	public List<DishVO> getAllTodayApproveDishVOsByID(int pk_user);
	
	/**
	 * 查询指定用户今日所有已发布的菜品
	 * @param pk_user
	 */
	public List<DishVO> getAllTodayPublishDishVOsByID(int pk_user);
	
	/**
	 * 更新菜品状态
	 * @param map
	 */
	public void updateDishStatus(HashMap<String, Object> map);
	
	/**
	 * 更新菜品数量
	 * @param map
	 */
	public void updateDishCount(HashMap<String, Object> map);
	
	/**
	 * 更新菜品销量
	 * @param map
	 */
	public void updateDishTotalSaleCount(HashMap<String, Object> map);
	
	/**
	 * 更新菜品点赞量
	 * @param int
	 */
	public void updateDishLikeCount(int pk_dish);
	
	/**
	 * 删除菜品   查询order中无该菜品则可删除，状态改为3
	 * @param pk_dish
	 */
	public void deleteDish(int pk_dish);
	
	/**
	 * 根据条件查询菜品
	 * @return
	 */
	public List<DishVO> getDishByCondition(HashMap<String, Object> map);
}
