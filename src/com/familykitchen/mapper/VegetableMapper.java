package com.familykitchen.mapper;

import java.util.HashMap;
import java.util.List;

import com.familykitchen.bean.VegetableVO;

public interface VegetableMapper {

	/**
	 * ��ѯ�����߲��б�
	 */
	public List<VegetableVO> getAllVegetableInfo();
	
	/**
	 * ��ѯָ���߲���Ϣ
	 * @param pk_vegetable
	 * @return
	 */
	public VegetableVO getVegetableByID(int pk_vegetable);
	
	/**
	 * �����߲�����
	 * @param map
	 */
	public void updateVegetableCount(HashMap<String, Object> map);
	
	/**
	 * �����߲�����
	 * @param map
	 */
	public void updateVegetableTotalSaleCount(HashMap<String, Object> map);
	
}
