package com.familykitchen.mapper;

import java.util.HashMap;
import java.util.List;

import com.familykitchen.bean.OrderVO;


public interface OrderMapper {
	/**
	 * �������������ض�������
	 * @param Order
	 */
	public void addOrder(OrderVO ordervo);
	
	/**
	 * ���¶�������״̬
	 * @param Order
	 */
	public void updateOrderDealStatus(HashMap<String, Object> map);
	
	/**
	 * ���ɾ�������¶�������״̬
	 * @param Order
	 */
	public void updateOrderBuyerDeleteFlag(int pk_order);
	
	/**
	 * ����ɾ�������¶�������״̬
	 * @param Order
	 */
	public void updateOrderSalerDeleteFlag(int pk_order);
	
	/**
	 * ���¶�������״̬
	 * @param Order
	 */
	public void updateOrderBalanceFlag(int pk_order);
	
	/**
	 * ���¶���֧��״̬
	 * @param Order
	 */
	public void updateOrderPayStatus(HashMap<String, Object> map);
	
	/**
	 * �����򷽶���
	 * @param pk_user
	 * @return
	 */
	public List<OrderVO> getAllOrderByID(int pk_user);
	
	/**
	 * ������������
	 * @param pk_saler
	 * @return
	 */
	public List<OrderVO> getAllOrderBySalerID(int pk_saler);
	
	/**
	 * ɾ������
	 * @param id
	 */
	public void deleteOrderByID(int pk_order);
	
	/**
	 * ��ѯ���ж�����ָ����Ʒ���ִ���
	 * @param pk_dish
	 * @return
	 */
	public int getAllOrderByDishID(int pk_dish);
	
	/**
	 * ���ݶ���ID��ѯ����VO
	 * @param pk_order
	 * @return
	 */
	public OrderVO getOrderVOByID(int pk_order);
	
	/**
	 * ��������δ֧������
	 * @return
	 */
	public List<OrderVO> getAllNoPayOrder();
	
	/**
	 * ����������֧������
	 * @return
	 */
	public List<OrderVO> getAllPayedOrder();
	
	/**
	 * ����ָ���û�δ֧������
	 * @param pk_orderuser
	 * @return
	 */
	public List<OrderVO> getAllNoPayOrderByUserID(int pk_orderuser);
	
	/**
	 * ����ָ���û���֧������
	 * @param pk_orderuser
	 * @return
	 */
	public List<OrderVO> getAllPayedOrderByUserID(int pk_orderuser);
	
	/**
	 * ���ݶ���GUID��ѯ����ID
	 * @param orderguid
	 * @return
	 */
	public int getOrderIDByGUID(String orderguid);
	
	 /**
	 * ����ָ���û�������֧������
	 * @param pk_orderuser
	 * @return
	 */
	public List<OrderVO> getAllTodayPayedOrderByUserID(int pk_orderuser);
	 
	 /**
	 * ����ָ���û�������֧������
	 * @param pk_orderuser
	 * @return
	 */
	public List<OrderVO> getAllBeforeTodayPayedOrderByUserID(int pk_orderuser);
	 
	/**
	 * ����������ѯ����
	 * @param pk_orderuser
	 * @return
	 */
	public List<OrderVO> getOrderByCondition(HashMap<String, Object> map);
}
