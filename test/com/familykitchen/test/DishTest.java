package com.familykitchen.test;


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.familykitchen.bean.DishVO;
import com.familykitchen.bean.UserVO;
import com.familykitchen.mapper.DishMapper;
import com.familykitchen.utils.MybatisUtil;

public class DishTest {
	private SqlSessionFactory sessionFactory= MybatisUtil.getInstance();
	
	@Test
	public void save() {
		SqlSession session = sessionFactory.openSession();
		try {
			DishMapper dishMapper = session.getMapper(DishMapper.class);
			
			DishVO dish = new DishVO();
			dish.setDishname("0522dish");
			
			UserVO uservo = new UserVO();
			uservo.setPk_user(4);
			
			dish.setPk_user(uservo);
			dish.setDishcount(8);
			BigDecimal price = new BigDecimal(12.0);
			dish.setUnitprice(price);
			dish.setKitchenaddress("ÏîÄ¿");
			dish.setLatitude("Latitude");
			
			dishMapper.addDishBaseInfo(dish);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	@Test
	public void getAllTodayApproveDishVOsByID(){
		SqlSession session = sessionFactory.openSession();
        try {
            DishMapper dishOperation=session.getMapper(DishMapper.class);           
            List<DishVO> list = dishOperation.getAllTodayApproveDishVOsByID(3);
            if (list == null)
            	return;
            System.out.println("getAllTodayApproveDishVOsByID3-count:" + list.size());
            for(DishVO vo : list){
                System.out.println(vo.getDishname() + ":" + vo.getUnitprice());
                System.out.println(vo.getPk_user().getName());
                System.out.println(vo.getPk_user().getTelphone());
                System.out.println(vo.getKitchenaddress());
            }
        } finally {
            session.close();
        }
    }
	
	@Test
	public void getAllDishBaseInfoByID(){
		SqlSession session = sessionFactory.openSession();
        try {
            DishMapper dishOperation=session.getMapper(DishMapper.class);           
            List<DishVO> list = dishOperation.getAllDishBaseInfoByID(3);
            if (list == null)
            	return;
            System.out.println("getAllDishBaseInfoByID3-count:" + list.size());
            for(DishVO vo : list){
                System.out.println(vo.getDishname() + ":" + vo.getUnitprice());
                System.out.println(vo.getPk_user().getName());
                System.out.println(vo.getPk_user().getTelphone());
                System.out.println(vo.getKitchenaddress());
            }
        } finally {
            session.close();
        }
    }
	
	@Test
	public void getTodayApprovedDishListByOrder(){
		SqlSession session = sessionFactory.openSession();
        try {
            DishMapper dishOperation=session.getMapper(DishMapper.class);   
            HashMap<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("sort", "unitprice");
			paramMap.put("dir", "DESC");
			
            List<DishVO> list = dishOperation.getTodayApprovedDishListByOrder(paramMap);
            if (list == null)
            	return;
            System.out.println("getTodayApprovedDishListByOrder-count:" + list.size());
            for(DishVO vo : list){
                System.out.println(vo.getDishname() + ":" + vo.getUnitprice());
                System.out.println(vo.getPk_user().getName());
                System.out.println(vo.getPk_user().getTelphone());
                System.out.println(vo.getKitchenaddress());
            }
        } finally {
            session.close();
        }
    }
	
	@Test
	public void getAllTodayPublishDishVOsByID(){
		SqlSession session = sessionFactory.openSession();
        try {
            DishMapper dishOperation=session.getMapper(DishMapper.class);   
			
            List<DishVO> list = dishOperation.getAllTodayPublishDishVOsByID(3);
            if (list == null)
            	return;
            System.out.println("getAllTodayPublishDishVOsByID3-count:" + list.size());
            for(DishVO vo : list){
                System.out.println(vo.getDishname() + ":" + vo.getUnitprice());
                System.out.println(vo.getPk_user().getName());
                System.out.println(vo.getPk_user().getTelphone());
                System.out.println(vo.getKitchenaddress());
            }
        } finally {
            session.close();
        }
    }
	
//	@Test
//	public void getDishVOByID(){
//		SqlSession session = sessionFactory.openSession();
//        try {
//            DishMapper dishOperation=session.getMapper(DishMapper.class);   
//            DishVO vo = dishOperation.getDishVOByID(11);
//            if (vo != null)
//                System.out.println(vo.getDishname() + ":" + vo.getUnitprice() + ":" + vo.getPublishdate());
//        } finally {
//            session.close();
//        }
//    }
	
//	@Test
//	public void update() {
//		SqlSession session = sessionFactory.openSession();
//		try {
//			DishMapper dishMapper = session.getMapper(DishMapper.class);
//			
//			HashMap<String, Object> paramMap = new HashMap<String, Object>();
//			paramMap.put("pk_dish", 8);
//			paramMap.put("dishstatus", IDefConst.DISHSTATUS_APPROVED);
//			
//			dishMapper.updateDishStatus(paramMap);
//			
//			session.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			session.close();
//		}
//	}
	
	
//	@Test
//	public void publish() {
//		SqlSession session = sessionFactory.openSession();
//		try {
//			DishMapper dishMapper = session.getMapper(DishMapper.class);
//			
//			HashMap<String, Object> paramMap = new HashMap<String, Object>();
//			paramMap.put("pk_dish", 5);
//			paramMap.put("dishstatus", IDefConst.DISHSTATUS_PUBLISHED);
//			
//			dishMapper.publishDish(paramMap);
//			
//			session.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			session.close();
//		}
//	}
	
//	@Test
//	public void find() {
//		SqlSession session = sessionFactory.openSession();
//		try {
//			DishMapper dishMapper = session.getMapper(DishMapper.class);
//			
//			DishVO dish = dishMapper.find("1");
//			
//			if (dish != null) {
//				System.out.println("id : " + dish.getId() + ", name : " + dish.getName() + ", password : " + dish.getPassword());
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			session.close();
//		}
//	}
	
//	@Test
//	public void delete() {
//		SqlSession session = sessionFactory.openSession();
//		try {
//			DishMapper dishMapper = session.getMapper(DishMapper.class);
//			
//			dishMapper.delete("1");
//			session.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			session.close();
//		}
//	}
}
