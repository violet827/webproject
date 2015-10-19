package com.familykitchen.service.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.familykitchen.bean.DishVO;
import com.familykitchen.mapper.DishMapper;
import com.familykitchen.service.DishService;
import com.familykitchen.utils.IDefConst;
import com.familykitchen.utils.MybatisUtil;

public class DishServiceImpl implements DishService {
	
	private static Logger log = Logger.getLogger(DishServiceImpl.class);  
	 
	private SqlSessionFactory sessionFactory = MybatisUtil.getInstance();
	
	@Override
	public void addDishBaseInfo(DishVO dishvo) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			DishMapper mapper = session.getMapper(DishMapper.class);
			dishvo.setDishstatus(IDefConst.DISHSTATUS_ADD);
			mapper.addDishBaseInfo(dishvo);
			session.commit();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public void updateDishBaseInfo(DishVO dishvo) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			DishMapper mapper = session.getMapper(DishMapper.class);
			mapper.updateDishBaseInfo(dishvo);
			session.commit();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}
	
	@Override
	public void publishDish(int pk_dish) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			DishMapper mapper = session.getMapper(DishMapper.class);
			
			HashMap<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("pk_dish", pk_dish);
			paramMap.put("dishstatus", IDefConst.DISHSTATUS_PUBLISHED);
			
			mapper.publishDish(paramMap);
			
			session.commit();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}
	
	@Override
	public void updateDishStatus(int pk_dish, int dishstatus) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			DishMapper mapper = session.getMapper(DishMapper.class);
			
			HashMap<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("pk_dish", pk_dish);
			paramMap.put("dishstatus", dishstatus);
			
			mapper.updateDishStatus(paramMap);
			session.commit();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public void updateDishCount(int pk_dish, int dishcount) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			DishMapper mapper = session.getMapper(DishMapper.class);
			
			HashMap<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("pk_dish", pk_dish);
			paramMap.put("dishcount", dishcount);
			
			mapper.updateDishCount(paramMap);
			session.commit();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}
	
	@Override
	public List<DishVO> getTodayApprovedDishListByOrder(String orderby, String dir) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			DishMapper mapper = session.getMapper(DishMapper.class);
			
			HashMap<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("sort", orderby);
			paramMap.put("dir", dir);
			
			List<DishVO> vos = mapper.getTodayApprovedDishListByOrder(paramMap);
			
			return vos;
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}
	
	@Override
	public List<DishVO> getTomorrowApprovedDishListByOrder(String orderby, String dir) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			DishMapper mapper = session.getMapper(DishMapper.class);
			
			HashMap<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("sort", orderby);
			paramMap.put("dir", dir);
			
			List<DishVO> vos = mapper.getTomorrowApprovedDishListByOrder(paramMap);
			
			return vos;
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}
	
	@Override
	public List<DishVO> getAllDishBaseInfoByID(int userid) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			DishMapper mapper = session.getMapper(DishMapper.class);
			List<DishVO> vos = mapper.getAllDishBaseInfoByID(userid);
			return vos;
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}
	
	@Override
	public List<DishVO> getAllTodayApproveDishVOsByID(int userid) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			DishMapper mapper = session.getMapper(DishMapper.class);
			List<DishVO> vos = mapper.getAllTodayApproveDishVOsByID(userid);
			return vos;
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}
	
	@Override
	public List<DishVO> getAllTodayPublishDishVOsByID(int userid) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			DishMapper mapper = session.getMapper(DishMapper.class);
			List<DishVO> vos = mapper.getAllTodayPublishDishVOsByID(userid);
			return vos;
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}
	
	@Override
	public void deleteDish(int pk_dish) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
//			// 查询order中无该菜品则可删除，状态改为3
//			OrderMapper ordermapper = session.getMapper(OrderMapper.class);
//			int dishcount = ordermapper.getAllOrderByDishID(pk_dish);
//			if (dishcount == 0) throws Exception {
//				DishMapper mapper = session.getMapper(DishMapper.class);
//				
//				HashMap<String, Object> paramMap = new HashMap<String, Object>();
//				paramMap.put("pk_dish", pk_dish);
//				paramMap.put("dishstatus", IDefConst.DISHTYPE_DELETED);
//				
//				mapper.updateDishStatus(paramMap);
//			}
			DishMapper mapper = session.getMapper(DishMapper.class);
			mapper.deleteDish(pk_dish);
			session.commit();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public void updateDishTotalSaleCount(int pk_dish, int salecount) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			DishMapper mapper = session.getMapper(DishMapper.class);
			
			HashMap<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("pk_dish", pk_dish);
			paramMap.put("salecount", salecount);
			
			mapper.updateDishTotalSaleCount(paramMap);
			session.commit();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public void updateDishLikeCount(int pk_dish) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			DishMapper mapper = session.getMapper(DishMapper.class);
			mapper.updateDishLikeCount(pk_dish);
			session.commit();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public DishVO getDishVOByID(int pk_dish) throws Exception {
		DishVO dishvo = null;
		SqlSession session = sessionFactory.openSession();
		try {
			DishMapper mapper = session.getMapper(DishMapper.class);
			dishvo = mapper.getDishVOByID(pk_dish);
			return dishvo;
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public List<DishVO> getDishByCondition(int dishstatus) throws Exception {
		List<DishVO> list = null;
		SqlSession session = sessionFactory.openSession();
		try {
			DishMapper mapper = session.getMapper(DishMapper.class);
			String condition = "1 = 1";
			if (dishstatus >= 0) 
				condition = " d.dishstatus = " + dishstatus;
			
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			list = mapper.getDishByCondition(map);
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
		return list;
	}
}
