package com.familykitchen.service.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.familykitchen.bean.VegetableVO;
import com.familykitchen.mapper.VegetableMapper;
import com.familykitchen.service.VegetableService;
import com.familykitchen.utils.MybatisUtil;

public class VegetableServiceImpl implements VegetableService {
	
	private static Logger log = Logger.getLogger(VegetableServiceImpl.class);
	
	private SqlSessionFactory sessionFactory = MybatisUtil.getInstance();
	
	@Override
	public VegetableVO getVegetableByID(int pk_vegetable) throws Exception {
		VegetableVO vo = null;
		SqlSession session = sessionFactory.openSession();
		try {
			VegetableMapper mapper = session.getMapper(VegetableMapper.class);
			vo = mapper.getVegetableByID(pk_vegetable);
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
		return vo;
	}

	@Override
	public List<VegetableVO> getAllVegetableInfo() throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			VegetableMapper mapper = session.getMapper(VegetableMapper.class);
			List<VegetableVO> vos = mapper.getAllVegetableInfo();
			return vos;
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}

	
	@Override
	public void updateVegetableCount(int pk_vegetable, int vegetablecount) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			VegetableMapper mapper = session.getMapper(VegetableMapper.class);
			
			HashMap<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("pk_vegetable", pk_vegetable);
			paramMap.put("vegetablecount", vegetablecount);
			
			mapper.updateVegetableCount(paramMap);
			session.commit();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}
	
	@Override
	public void updateVegetableTotalSaleCount(int pk_vegetable, int salecount) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			VegetableMapper mapper = session.getMapper(VegetableMapper.class);
			
			HashMap<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("pk_vegetable", pk_vegetable);
			paramMap.put("salecount", salecount);
			
			mapper.updateVegetableTotalSaleCount(paramMap);
			session.commit();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}

}
