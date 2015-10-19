package com.familykitchen.test;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.familykitchen.bean.DishVO;
import com.familykitchen.bean.OrderVO;
import com.familykitchen.bean.UserVO;
import com.familykitchen.mapper.OrderMapper;
import com.familykitchen.service.impl.OrderServiceImpl;
import com.familykitchen.utils.MybatisUtil;

public class OrderTest {
	private SqlSessionFactory sessionFactory= MybatisUtil.getInstance();
	
//	@Test
//	public void saveDish() {
//			OrderServiceImpl service = new OrderServiceImpl();
//			
//			OrderVO order = new OrderVO();
//			
//			DishVO d = new DishVO();
//			d.setPk_dish(10);
//			
//			UserVO u1 = new UserVO();
//			u1.setPk_user(5);
//			UserVO u2 = new UserVO();
//			u2.setPk_user(6);
//			
//			order.setPk_dish(d);
//			order.setPk_orderuser(u1);
//			order.setOrdercount(3);
//			order.setPk_saler(u2);
//			order.setReceiveaddress("00000");
//			order.setKitchenaddress("00000");
//			
//			try {
//				int pk_order = service.addDishOrder(order);
//				System.out.println("pk_order" + pk_order);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//	}
	
//	@Test
//	public void saveVegetable() {
//		OrderServiceImpl service = new OrderServiceImpl();
//			OrderVO order = new OrderVO();
//			
//			VegetableVO d = new VegetableVO();
//			d.setPk_vegetable(1);
//			
//			UserVO u1 = new UserVO();
//			u1.setPk_user(5);
//			UserVO u2 = new UserVO();
//			u2.setPk_user(6);
//			
//			order.setPk_vegetable(d);
//			order.setPk_orderuser(u1);
//			order.setPk_saler(u2);
//			order.setReceiveaddress("55555");
//			order.setKitchenaddress("66666");
//			order.setOrdercount(22);
//			
//			service.addVegetableOrder(order);
//	}
	
//	@Test
//	public void getAllOrderBySalerID() {
//		SqlSession session = sessionFactory.openSession();
//		try {
//			OrderMapper OrderMapper = session.getMapper(OrderMapper.class);
//			
//			List<OrderVO> allOrderBySalerID = OrderMapper.getAllOrderBySalerID(4);
//			System.out.println("allOrderBySalerID");
//			if (allOrderBySalerID != null) {
//				for(OrderVO order : allOrderBySalerID) {
//					System.out.println("orderuser : " + order.getPk_orderuser().getName());
//					System.out.println("saleruser : " + order.getPk_saler().getName());
//					System.out.println("receiveaddress : " + order.getReceiveaddress());
//					System.out.println("kitchenaddress : " + order.getKitchenaddress());
//					System.out.println("image : " + order.getPk_dish().getPreviewimagedir());
//					System.out.println("image : " + order.getPk_vegetable().getVimage());
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			session.close();
//		}
//	}
//	
//	@Test
//	public void getOrderVOByID() {
//		SqlSession session = sessionFactory.openSession();
//		try {
//			OrderMapper orderMapper = session.getMapper(OrderMapper.class);
//			
//			OrderVO order = orderMapper.getOrderVOByID(15);
//			System.out.println("getOrderVOByID15");
//			if (order != null) {
//				System.out.println("orderuser : " + order.getPk_orderuser().getName());
//				System.out.println("saleruser : " + order.getPk_saler().getName());
//				System.out.println("receiveaddress : " + order.getReceiveaddress());
//				System.out.println("kitchenaddress : " + order.getKitchenaddress());
//				if (order.getPk_dish() != null)
//					System.out.println("image : " + order.getPk_dish().getPreviewimagedir());
//				
//				if (order.getPk_vegetable() != null)
//					System.out.println("image : " + order.getPk_vegetable().getVimage());
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			session.close();
//		}
//	}
	
	@Test
	public void getAllPayedOrder() {
		SqlSession session = sessionFactory.openSession();
		try {
			OrderMapper orderMapper = session.getMapper(OrderMapper.class);
			
			List<OrderVO> list = orderMapper.getAllPayedOrder();
			if (list != null && list.size() > 0) {
				System.out.println("getAllPayedOrder:" + list.size());
				for(OrderVO order : list) {
					System.out.println("orderuser : " + order.getPk_orderuser().getName());
					System.out.println("saleruser : " + order.getPk_saler().getName());
					System.out.println("receiveaddress : " + order.getReceiveaddress());
					System.out.println("kitchenaddress : " + order.getKitchenaddress());
					if (order.getPk_dish() != null)
						System.out.println("image : " + order.getPk_dish().getPreviewimagedir());
					
					if (order.getPk_vegetable() != null)
						System.out.println("image : " + order.getPk_vegetable().getVimage());
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	
	@Test
	public void getOrderByCondition() {
		try {
			OrderServiceImpl service = new OrderServiceImpl();
			
			List<OrderVO> list = service.getOrderByCondition(1);
			if (list != null && list.size() > 0) {
				System.out.println("getOrderByCondition:" + list.size());
				for(OrderVO order : list) {
					System.out.println("orderuser : " + order.getPk_orderuser().getName());
					System.out.println("saleruser : " + order.getPk_saler().getName());
					System.out.println("receiveaddress : " + order.getReceiveaddress());
					System.out.println("kitchenaddress : " + order.getKitchenaddress());
					if (order.getPk_dish() != null)
						System.out.println("image : " + order.getPk_dish().getPreviewimagedir());
					
					if (order.getPk_vegetable() != null)
						System.out.println("image : " + order.getPk_vegetable().getVimage());
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
//	@Test
//	public void getAllOrderByID() {
//		SqlSession session = sessionFactory.openSession();
//		try {
//			OrderMapper OrderMapper = session.getMapper(OrderMapper.class);
//			
//			List<OrderVO> allOrderBySalerID = OrderMapper.getAllOrderByID(5);
//			System.out.println("getAllOrderByID");
//			if (allOrderBySalerID != null) {
//				for(OrderVO order : allOrderBySalerID) {
//					
//					System.out.println("orderuser : " + order.getPk_orderuser().getName());
//					System.out.println("saleruser : " + order.getPk_saler().getName());
//					System.out.println("receiveaddress : " + order.getReceiveaddress());
//					System.out.println("kitchenaddress : " + order.getKitchenaddress());
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			session.close();
//		}
//	}
	
}
