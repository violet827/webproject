package com.familykitchen.service;

import java.util.HashMap;
import java.util.List;

import com.familykitchen.bean.DishVO;
import com.familykitchen.bean.OrderVO;


public interface DishService {

	/**
	 * ������Ʒ������Ϣ
	 * @param Dish
	 */
	public void addDishBaseInfo(DishVO dishvo) throws Exception;
	
	/**
	 * ���²�Ʒ������Ϣ
	 * @param Dish
	 */
	public void updateDishBaseInfo(DishVO dishvo) throws Exception;
	
	/**
	 * ������Ʒ��Ϣ
	 * @param pk_dish
	 */
	public void publishDish(int pk_dish) throws Exception;
	
	/**
	 * ���ݲ�ƷID��ѯ��Ʒ
	 * @param pk_dish
	 */
	public DishVO getDishVOByID(int pk_dish) throws Exception;
	
	/**
	 * �����ѯ�����û������ѷ������в�Ʒ
	 * @param orderby �����ֶ���
	 * @param dir ASC ˳�� DESC ����
	 */
	public List<DishVO> getTodayApprovedDishListByOrder(String orderby, String dir) throws Exception;
	
	/**
	 * �����ѯ�����û������ѷ������в�Ʒ
	 * @param orderby �����ֶ���
	 * @param dir ASC ˳�� DESC ����
	 */
	public List<DishVO> getTomorrowApprovedDishListByOrder(String orderby, String dir) throws Exception;
	
	/**
	 * ��ѯָ���û����ӵ����в�Ʒ
	 * @param pk_user
	 */
	public List<DishVO> getAllDishBaseInfoByID(int pk_user) throws Exception;
	
	/**
	 * ��ѯָ���û�������������˵Ĳ�Ʒ
	 * @param pk_user
	 */
	public List<DishVO> getAllTodayApproveDishVOsByID(int pk_user) throws Exception;
	
	/**
	 * ��ѯָ���û����������ѷ����Ĳ�Ʒ
	 * @param pk_user
	 */
	public List<DishVO> getAllTodayPublishDishVOsByID(int pk_user) throws Exception;
	
	/**
	 * ���²�Ʒ״̬
	 * @param pk_dish
	 * @param dishstatus
	 */
	public void updateDishStatus(int pk_dish, int dishstatus) throws Exception;
	
	/**
	 * ���²�Ʒ����
	 * @param pk_dish
	 * @param dishcount
	 */
	public void updateDishCount(int pk_dish, int dishcount) throws Exception;
	
	/**
	 * ���²�Ʒ����
	 * @param pk_dish
	 * @param salecount
	 */
	public void updateDishTotalSaleCount(int pk_dish, int salecount) throws Exception;
	
	/**
	 * ���²�Ʒ������
	 * @param pk_dish
	 * @param likecount
	 */
	public void updateDishLikeCount(int pk_dish) throws Exception;
	
	/**
	 * ɾ����Ʒ   ��ѯorder���޸ò�Ʒ���ɾ����״̬��Ϊ3
	 * @param pk_dish
	 */
	public void deleteDish(int pk_dish) throws Exception;
	
	/**
	 * ����������ѯ����
	 * @return
	 */
	public List<DishVO> getDishByCondition(int dishstatus) throws Exception;
}
