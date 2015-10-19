package com.familykitchen.service.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.familykitchen.bean.OrderVO;
import com.familykitchen.bean.UserVO;
import com.familykitchen.mapper.DishMapper;
import com.familykitchen.mapper.OrderMapper;
import com.familykitchen.mapper.UserMapper;
import com.familykitchen.mapper.VegetableMapper;
import com.familykitchen.service.OrderService;
import com.familykitchen.utils.IDefConst;
import com.familykitchen.utils.MybatisUtil;
import com.familykitchen.utils.RandomGUIDUtil;
import com.familykitchen.utils.SMSSendUtil;

public class OrderServiceImpl implements OrderService {
	
	private static Logger log = Logger.getLogger(OrderServiceImpl.class);  
	
	private SqlSessionFactory sessionFactory = MybatisUtil.getInstance();
	
	@Override
	public int addDishOrder(OrderVO ordervo) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			
			String orderguid = RandomGUIDUtil.newGuid(); 
			//设置订单类型为成品菜
			ordervo.setOrdertype(IDefConst.ORDERTYPE_FINISHED);
			//设置处理状态为待处理
			ordervo.setDealstatus(IDefConst.DEALSTATUS_TODO);
			//设置支付状态为未支付
			ordervo.setPaystatus(IDefConst.PAYSTATUS_NOPAY);
			ordervo.setOrderguid(orderguid);
			mapper.addOrder(ordervo);
			
			int pk_order = mapper.getOrderIDByGUID(orderguid);
			
			DishMapper dishmapper = session.getMapper(DishMapper.class);
			
			//增加订单后修改菜品数量
			HashMap<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("pk_dish", ordervo.getPk_dish().getPk_dish());
			paramMap.put("dishcount", ordervo.getOrdercount());
			dishmapper.updateDishCount(paramMap);
			
			//增加订单后修改菜品销量
			HashMap<String, Object> saleParamMap = new HashMap<String, Object>();
			saleParamMap.put("pk_dish", ordervo.getPk_dish().getPk_dish());
			saleParamMap.put("salecount", ordervo.getOrdercount());
			dishmapper.updateDishTotalSaleCount(saleParamMap);
			
			//给卖家发送订购信息
			UserMapper usermapper = session.getMapper(UserMapper.class);
			UserVO salervo = usermapper.getUserVOByID(ordervo.getPk_saler().getPk_user());
			String msgcontent = "您的菜品已卖出，请查看.";
			new SMSSendUtil().sendMsg(salervo.getTelphone(), msgcontent);
			
			session.commit();
			
			return pk_order;
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public void addVegetableOrder(OrderVO ordervo) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			//设置订单类型为蔬菜
			ordervo.setOrdertype(IDefConst.ORDERTYPE_VEGETABLE);
			ordervo.setDealstatus(IDefConst.DEALSTATUS_TODO);
			mapper.addOrder(ordervo);
			
			VegetableMapper vmapper = session.getMapper(VegetableMapper.class);
			
			//增加订单后修改蔬菜数量
			HashMap<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("pk_vegetable", ordervo.getPk_vegetable().getPk_vegetable());
			paramMap.put("vegetablecount", ordervo.getOrdercount());
			vmapper.updateVegetableCount(paramMap);
			
			//增加订单后修改蔬菜销量
			HashMap<String, Object> saleParamMap = new HashMap<String, Object>();
			saleParamMap.put("pk_vegetable", ordervo.getPk_vegetable().getPk_vegetable());
			saleParamMap.put("salecount", ordervo.getOrdercount());
			vmapper.updateVegetableTotalSaleCount(saleParamMap);
			
			session.commit();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}
	
	@Override
	public void updateOrderDealStatus(int pk_order, int dealstatus) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			
			HashMap<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("pk_order", pk_order);
			paramMap.put("dealstatus", dealstatus);
			
			mapper.updateOrderDealStatus(paramMap);
			session.commit();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public void updateOrderPayStatus(int pk_order, int paystatus) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			
			HashMap<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("pk_order", pk_order);
			paramMap.put("paystatus", paystatus);
			
			mapper.updateOrderPayStatus(paramMap);
			session.commit();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}
	
	@Override
	public void updateOrderBalanceFlag(int pk_order) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			mapper.updateOrderBalanceFlag(pk_order);
			session.commit();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}
	
	@Override
	public List<OrderVO> getAllOrderByID(int pk_user) throws Exception {
		List<OrderVO> list = null;
		SqlSession session = sessionFactory.openSession();
		try {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			list = mapper.getAllOrderByID(pk_user);
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public List<OrderVO> getAllOrderBySalerID(int pk_saler) throws Exception {
		List<OrderVO> list = null;
		SqlSession session = sessionFactory.openSession();
		try {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			list = mapper.getAllOrderBySalerID(pk_saler);
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
		return list;
	}
	
	@Override
	public void deleteOrderByID(int pk_user, int pk_order) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			
			OrderVO ordervo = mapper.getOrderVOByID(pk_order);
			if (ordervo.getPk_orderuser().getPk_user() == pk_user) {
				mapper.updateOrderBuyerDeleteFlag(pk_order);
			} else if (ordervo.getPk_saler().getPk_user() == pk_user) {
				mapper.updateOrderSalerDeleteFlag(pk_order);
			}
//			mapper.deleteOrderByID(pk_order);
			session.commit();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}

	/**
	 * 查询所有订单中指定菜品出现次数
	 * @param pk_dish
	 * @return
	 */
	public int getAllOrderByDishID(int pk_dish) throws Exception {
		int count = 0;
		SqlSession session = sessionFactory.openSession();
		try {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			count = mapper.getAllOrderByDishID(pk_dish);
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
		return count;
	}

	@Override
	public OrderVO getOrderVOByID(int pk_order) throws Exception {
		OrderVO ordervo = null;
		SqlSession session = sessionFactory.openSession();
		try {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			ordervo = mapper.getOrderVOByID(pk_order);
			return ordervo;
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}
	
	@Override
	public List<OrderVO> getAllPayedOrderByUserID(int pk_user) throws Exception {
		List<OrderVO> list = null;
		SqlSession session = sessionFactory.openSession();
		try {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			list = mapper.getAllPayedOrderByUserID(pk_user);
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
		return list;
	}
	
	@Override
	public List<OrderVO> getAllNoPayOrderByUserID(int pk_user) throws Exception {
		List<OrderVO> list = null;
		SqlSession session = sessionFactory.openSession();
		try {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			list = mapper.getAllNoPayOrderByUserID(pk_user);
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
		return list;
	}
	
	@Override
	public List<OrderVO> getAllPayedOrder() throws Exception {
		List<OrderVO> list = null;
		SqlSession session = sessionFactory.openSession();
		try {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			list = mapper.getAllPayedOrder();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
		return list;
	}
	
	@Override
	public List<OrderVO> getAllNoPayOrder() throws Exception {
		List<OrderVO> list = null;
		SqlSession session = sessionFactory.openSession();
		try {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			list = mapper.getAllNoPayOrder();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
		return list;
	}
	
	@Override
	public int getOrderIDByGUID(String orderguid) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			return mapper.getOrderIDByGUID(orderguid);
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}
	
	public List<OrderVO> getAllTodayPayedOrderByUserID(int pk_orderuser) throws Exception{
		List<OrderVO> list = null;
		SqlSession session = sessionFactory.openSession();
		try {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			list = mapper.getAllTodayPayedOrderByUserID(pk_orderuser);
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
		return list;
	}
	 
	public List<OrderVO> getAllBeforeTodayPayedOrderByUserID(int pk_orderuser) throws Exception{
		List<OrderVO> list = null;
		SqlSession session = sessionFactory.openSession();
		try {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			list = mapper.getAllBeforeTodayPayedOrderByUserID(pk_orderuser);
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
		return list;
	}
	
	@Override
	public List<OrderVO> getOrderByCondition(int dealstatus) throws Exception {
		List<OrderVO> list = null;
		SqlSession session = sessionFactory.openSession();
		try {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			String condition = "1 = 1";
			if (dealstatus >= 0) 
				condition = " o.dealstatus = " + dealstatus;
			
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			list = mapper.getOrderByCondition(map);
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
		return list;
	}
	
}
