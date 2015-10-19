package com.familykitchen.mapper;

import java.util.HashMap;
import java.util.List;

import com.familykitchen.bean.DishVO;


public interface DishMapper {

	/**
	 * ������Ʒ������Ϣ
	 * @param Dish
	 */
	public void addDishBaseInfo(DishVO dishvo);
	
	/**
	 * ���²�Ʒ������Ϣ
	 * @param Dish
	 */
	public void updateDishBaseInfo(DishVO dishvo);
	
	/**
	 * ������Ʒ��Ϣ
	 * @param pk_dish
	 */
	public void publishDish(HashMap<String, Object> map);
	
	/**
	 * ���ݲ�ƷID��ѯ��Ʒ
	 * @param pk_dish
	 * @return 
	 */
	public DishVO getDishVOByID(int pk_dish);
	
	/**
	 * �����ѯ�����û������ѷ������в�Ʒ(����Ϊ�����ֶκ�����ʽ)
	 * @param orderby
	 */
	public List<DishVO> getTodayApprovedDishListByOrder(HashMap<String, Object> map);
	
	/**
	 * �����ѯ�����û������ѷ������в�Ʒ(����Ϊ�����ֶκ�����ʽ)
	 * @param orderby
	 */
	public List<DishVO> getTomorrowApprovedDishListByOrder(HashMap<String, Object> map);
	
	/**
	 * ��ѯָ���û����ӵ����в�Ʒ
	 * @param pk_user
	 */
	public List<DishVO> getAllDishBaseInfoByID(int pk_user);
	
	/**
	 * ��ѯָ���û�������������˵Ĳ�Ʒ
	 * @param pk_user
	 */
	public List<DishVO> getAllTodayApproveDishVOsByID(int pk_user);
	
	/**
	 * ��ѯָ���û����������ѷ����Ĳ�Ʒ
	 * @param pk_user
	 */
	public List<DishVO> getAllTodayPublishDishVOsByID(int pk_user);
	
	/**
	 * ���²�Ʒ״̬
	 * @param map
	 */
	public void updateDishStatus(HashMap<String, Object> map);
	
	/**
	 * ���²�Ʒ����
	 * @param map
	 */
	public void updateDishCount(HashMap<String, Object> map);
	
	/**
	 * ���²�Ʒ����
	 * @param map
	 */
	public void updateDishTotalSaleCount(HashMap<String, Object> map);
	
	/**
	 * ���²�Ʒ������
	 * @param int
	 */
	public void updateDishLikeCount(int pk_dish);
	
	/**
	 * ɾ����Ʒ   ��ѯorder���޸ò�Ʒ���ɾ����״̬��Ϊ3
	 * @param pk_dish
	 */
	public void deleteDish(int pk_dish);
	
	/**
	 * ����������ѯ��Ʒ
	 * @return
	 */
	public List<DishVO> getDishByCondition(HashMap<String, Object> map);
}
