package com.familykitchen.test;


import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.familykitchen.bean.VegetableVO;
import com.familykitchen.mapper.VegetableMapper;
import com.familykitchen.utils.MybatisUtil;

public class VegetableTest {
	private SqlSessionFactory sessionFactory= MybatisUtil.getInstance();
	
//	@Test
//	public void getVegetableByID() {
//		SqlSession session = sessionFactory.openSession();
//		try {
//			VegetableMapper VegetableMapper = session.getMapper(VegetableMapper.class);
//			
//			VegetableVO vo = VegetableMapper.getVegetableByID(1);
//			System.out.println("getVegetableByID");
//			if (vo != null) {
//				System.out.println("vname : " + vo.getVname());
//				System.out.println("suppliername : " + vo.getPk_supplier().getSuppliername());
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			session.close();
//		}
//	}
//	
//	
	@Test
	public void getAllVegetableInfo() {
		SqlSession session = sessionFactory.openSession();
		try {
			VegetableMapper VegetableMapper = session.getMapper(VegetableMapper.class);
			
			List<VegetableVO> vos = VegetableMapper.getAllVegetableInfo();
			System.out.println("allOrderBySalerID");
			if (vos != null) {
				for(VegetableVO vo : vos) {
					System.out.println("vname : " + vo.getVname());
					System.out.println("suppliername : " + vo.getPk_supplier().getSuppliername());
					System.out.println("supplierlocation : " + vo.getPk_supplier().getSupplierlocation());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
//	
//	@Test
//	public void update() {
//		SqlSession session = sessionFactory.openSession();
//		try {
//			VegetableMapper dishMapper = session.getMapper(VegetableMapper.class);
//			
//			HashMap<String, Object> paramMap = new HashMap<String, Object>();
//			paramMap.put("pk_vegetable", 1);
//			paramMap.put("vegetablecount", 5);
//			
//			dishMapper.updateVegetableCount(paramMap);
//			
//			session.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			session.close();
//		}
//	}
	
//	@Test
//	public void update2() {
//		SqlSession session = sessionFactory.openSession();
//		try {
//			VegetableMapper vMapper = session.getMapper(VegetableMapper.class);
//			
//			HashMap<String, Object> paramMap = new HashMap<String, Object>();
//			paramMap.put("pk_vegetable", 1);
//			paramMap.put("salecount", 5);
//			
//			vMapper.updateVegetableTotalSaleCount(paramMap);
//			
//			session.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			session.close();
//		}
//	}
}
