package com.familykitchen.service;

import java.util.List;

import com.familykitchen.bean.OrderVO;

public interface OrderService {
	/**
	 * 新增成品菜订单，返回订单主键
	 * @param Order
	 */
	public int addDishOrder(OrderVO ordervo) throws Exception;
	
	/**
	 * 新增蔬菜订单
	 * @param Order
	 */
	public void addVegetableOrder(OrderVO ordervo) throws Exception;
	
	/**
	 * 更新订单处理状态
	 * @param Order
	 */
	public void updateOrderDealStatus(int pk_order, int dealstatus) throws Exception;
	
	/**
	 * 更新订单支付状态
	 * @param Order
	 */
	public void updateOrderPayStatus(int pk_order, int paystatus) throws Exception;
	
	/**
	 * 更新订单结算状态
	 * @param Order
	 */
	public void updateOrderBalanceFlag(int pk_order) throws Exception;
	
	/**
	 * 查找买方订单
	 * @param pk_user
	 * @return
	 */
	public List<OrderVO> getAllOrderByID(int pk_user) throws Exception;
	
	/**
	 * 查找卖方订单
	 * @param pk_saler
	 * @return
	 */
	public List<OrderVO> getAllOrderBySalerID(int pk_saler) throws Exception;
	
	/**
	 * 删除订单
	 * @param pk_user
	 * @param pk_order
	 */
	public void deleteOrderByID(int pk_user, int pk_order) throws Exception;
	
	/**
	 * 查询所有订单中指定菜品出现次数
	 * @param pk_dish
	 * @return
	 */
	public int getAllOrderByDishID(int pk_dish) throws Exception;
	
	/**
	 * 根据订单ID查询订单VO
	 * @param pk_order
	 * @return
	 */
	public OrderVO getOrderVOByID(int pk_order) throws Exception;
	
	/**
	 * 查找所有未支付订单
	 * @return
	 */
	public List<OrderVO> getAllNoPayOrder() throws Exception;
	
	/**
	 * 查找所有已支付订单
	 * @return
	 */
	public List<OrderVO> getAllPayedOrder() throws Exception;
	
	/**
	 * 查找指定用户未支付订单
	 * @param pk_user
	 * @return
	 */
	public List<OrderVO> getAllNoPayOrderByUserID(int pk_user) throws Exception;
	
	/**
	 * 查找指定用户已支付订单
	 * @param pk_user
	 * @return
	 */
	public List<OrderVO> getAllPayedOrderByUserID(int pk_user) throws Exception;
	
	/**
	 * 根据订单GUID查询订单ID
	 * @param orderguid
	 * @return
	 */
	public int getOrderIDByGUID(String orderguid) throws Exception;
	
	 /**
	 * 查找指定用户今日已支付订单
	 * @param pk_orderuser
	 * @return
	 */
	public List<OrderVO> getAllTodayPayedOrderByUserID(int pk_orderuser) throws Exception;
	 
	 /**
	 * 查找指定用户以往已支付订单
	 * @param pk_orderuser
	 * @return
	 */
	public List<OrderVO> getAllBeforeTodayPayedOrderByUserID(int pk_orderuser) throws Exception;

	/**
	 * 根据条件查询订单
	 * @param pk_orderuser
	 * @return
	 */
	public List<OrderVO> getOrderByCondition(int dealstatus) throws Exception;
}
