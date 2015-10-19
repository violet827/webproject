package com.familykitchen.service;

import java.util.List;

import com.familykitchen.bean.OrderVO;

public interface OrderService {
	/**
	 * ������Ʒ�˶��������ض�������
	 * @param Order
	 */
	public int addDishOrder(OrderVO ordervo) throws Exception;
	
	/**
	 * �����߲˶���
	 * @param Order
	 */
	public void addVegetableOrder(OrderVO ordervo) throws Exception;
	
	/**
	 * ���¶�������״̬
	 * @param Order
	 */
	public void updateOrderDealStatus(int pk_order, int dealstatus) throws Exception;
	
	/**
	 * ���¶���֧��״̬
	 * @param Order
	 */
	public void updateOrderPayStatus(int pk_order, int paystatus) throws Exception;
	
	/**
	 * ���¶�������״̬
	 * @param Order
	 */
	public void updateOrderBalanceFlag(int pk_order) throws Exception;
	
	/**
	 * �����򷽶���
	 * @param pk_user
	 * @return
	 */
	public List<OrderVO> getAllOrderByID(int pk_user) throws Exception;
	
	/**
	 * ������������
	 * @param pk_saler
	 * @return
	 */
	public List<OrderVO> getAllOrderBySalerID(int pk_saler) throws Exception;
	
	/**
	 * ɾ������
	 * @param pk_user
	 * @param pk_order
	 */
	public void deleteOrderByID(int pk_user, int pk_order) throws Exception;
	
	/**
	 * ��ѯ���ж�����ָ����Ʒ���ִ���
	 * @param pk_dish
	 * @return
	 */
	public int getAllOrderByDishID(int pk_dish) throws Exception;
	
	/**
	 * ���ݶ���ID��ѯ����VO
	 * @param pk_order
	 * @return
	 */
	public OrderVO getOrderVOByID(int pk_order) throws Exception;
	
	/**
	 * ��������δ֧������
	 * @return
	 */
	public List<OrderVO> getAllNoPayOrder() throws Exception;
	
	/**
	 * ����������֧������
	 * @return
	 */
	public List<OrderVO> getAllPayedOrder() throws Exception;
	
	/**
	 * ����ָ���û�δ֧������
	 * @param pk_user
	 * @return
	 */
	public List<OrderVO> getAllNoPayOrderByUserID(int pk_user) throws Exception;
	
	/**
	 * ����ָ���û���֧������
	 * @param pk_user
	 * @return
	 */
	public List<OrderVO> getAllPayedOrderByUserID(int pk_user) throws Exception;
	
	/**
	 * ���ݶ���GUID��ѯ����ID
	 * @param orderguid
	 * @return
	 */
	public int getOrderIDByGUID(String orderguid) throws Exception;
	
	 /**
	 * ����ָ���û�������֧������
	 * @param pk_orderuser
	 * @return
	 */
	public List<OrderVO> getAllTodayPayedOrderByUserID(int pk_orderuser) throws Exception;
	 
	 /**
	 * ����ָ���û�������֧������
	 * @param pk_orderuser
	 * @return
	 */
	public List<OrderVO> getAllBeforeTodayPayedOrderByUserID(int pk_orderuser) throws Exception;

	/**
	 * ����������ѯ����
	 * @param pk_orderuser
	 * @return
	 */
	public List<OrderVO> getOrderByCondition(int dealstatus) throws Exception;
}
