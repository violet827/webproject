package com.familykitchen.service;

import java.util.List;

import com.familykitchen.bean.VegetableVO;

public interface VegetableService {

	/**
	 * ��ѯ�����߲��б�
	 */
	public List<VegetableVO> getAllVegetableInfo() throws Exception;
	
	/**
	 * ��ѯָ���߲���Ϣ
	 * @param pk_vegetable
	 * @return
	 */
	public VegetableVO getVegetableByID(int pk_vegetable) throws Exception;
	
	/**
	 * �����߲�����
	 * @param map
	 */
	public void updateVegetableCount(int pk_vegetable, int vegetablecount) throws Exception;
	
	/**
	 * �����߲�����
	 * @param map
	 */
	public void updateVegetableTotalSaleCount(int pk_vegetable, int salecount) throws Exception;
	
}
