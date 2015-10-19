package com.familykitchen.mapper;

import java.util.HashMap;
import java.util.List;

import com.familykitchen.bean.VegetableVO;

public interface VegetableMapper {

	/**
	 * 查询所有蔬菜列表
	 */
	public List<VegetableVO> getAllVegetableInfo();
	
	/**
	 * 查询指定蔬菜信息
	 * @param pk_vegetable
	 * @return
	 */
	public VegetableVO getVegetableByID(int pk_vegetable);
	
	/**
	 * 更新蔬菜数量
	 * @param map
	 */
	public void updateVegetableCount(HashMap<String, Object> map);
	
	/**
	 * 更新蔬菜销量
	 * @param map
	 */
	public void updateVegetableTotalSaleCount(HashMap<String, Object> map);
	
}
