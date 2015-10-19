package com.familykitchen.service;

import java.util.List;

import com.familykitchen.bean.VegetableVO;

public interface VegetableService {

	/**
	 * 查询所有蔬菜列表
	 */
	public List<VegetableVO> getAllVegetableInfo() throws Exception;
	
	/**
	 * 查询指定蔬菜信息
	 * @param pk_vegetable
	 * @return
	 */
	public VegetableVO getVegetableByID(int pk_vegetable) throws Exception;
	
	/**
	 * 更新蔬菜数量
	 * @param map
	 */
	public void updateVegetableCount(int pk_vegetable, int vegetablecount) throws Exception;
	
	/**
	 * 更新蔬菜销量
	 * @param map
	 */
	public void updateVegetableTotalSaleCount(int pk_vegetable, int salecount) throws Exception;
	
}
