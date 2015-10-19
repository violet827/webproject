package com.familykitchen.mapper;

import java.util.HashMap;
import java.util.List;

import com.familykitchen.bean.OrderVO;


public interface OrderMapper {
	/**
	 * 新增订单，返回订单主键
	 * @param Order
	 */
	public void addOrder(OrderVO ordervo);
	
	/**
	 * 更新订单处理状态
	 * @param Order
	 */
	public void updateOrderDealStatus(HashMap<String, Object> map);
	
	/**
	 * 买家删除，更新订单处理状态
	 * @param Order
	 */
	public void updateOrderBuyerDeleteFlag(int pk_order);
	
	/**
	 * 卖家删除，更新订单处理状态
	 * @param Order
	 */
	public void updateOrderSalerDeleteFlag(int pk_order);
	
	/**
	 * 更新订单结算状态
	 * @param Order
	 */
	public void updateOrderBalanceFlag(int pk_order);
	
	/**
	 * 更新订单支付状态
	 * @param Order
	 */
	public void updateOrderPayStatus(HashMap<String, Object> map);
	
	/**
	 * 查找买方订单
	 * @param pk_user
	 * @return
	 */
	public List<OrderVO> getAllOrderByID(int pk_user);
	
	/**
	 * 查找卖方订单
	 * @param pk_saler
	 * @return
	 */
	public List<OrderVO> getAllOrderBySalerID(int pk_saler);
	
	/**
	 * 删除订单
	 * @param id
	 */
	public void deleteOrderByID(int pk_order);
	
	/**
	 * 查询所有订单中指定菜品出现次数
	 * @param pk_dish
	 * @return
	 */
	public int getAllOrderByDishID(int pk_dish);
	
	/**
	 * 根据订单ID查询订单VO
	 * @param pk_order
	 * @return
	 */
	public OrderVO getOrderVOByID(int pk_order);
	
	/**
	 * 查找所有未支付订单
	 * @return
	 */
	public List<OrderVO> getAllNoPayOrder();
	
	/**
	 * 查找所有已支付订单
	 * @return
	 */
	public List<OrderVO> getAllPayedOrder();
	
	/**
	 * 查找指定用户未支付订单
	 * @param pk_orderuser
	 * @return
	 */
	public List<OrderVO> getAllNoPayOrderByUserID(int pk_orderuser);
	
	/**
	 * 查找指定用户已支付订单
	 * @param pk_orderuser
	 * @return
	 */
	public List<OrderVO> getAllPayedOrderByUserID(int pk_orderuser);
	
	/**
	 * 根据订单GUID查询订单ID
	 * @param orderguid
	 * @return
	 */
	public int getOrderIDByGUID(String orderguid);
	
	 /**
	 * 查找指定用户今日已支付订单
	 * @param pk_orderuser
	 * @return
	 */
	public List<OrderVO> getAllTodayPayedOrderByUserID(int pk_orderuser);
	 
	 /**
	 * 查找指定用户以往已支付订单
	 * @param pk_orderuser
	 * @return
	 */
	public List<OrderVO> getAllBeforeTodayPayedOrderByUserID(int pk_orderuser);
	 
	/**
	 * 根据条件查询订单
	 * @param pk_orderuser
	 * @return
	 */
	public List<OrderVO> getOrderByCondition(HashMap<String, Object> map);
}
