package com.familykitchen.service.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.familykitchen.bean.UserAddressVO;
import com.familykitchen.mapper.UserAddressMapper;
import com.familykitchen.service.UserAddressService;
import com.familykitchen.utils.MybatisUtil;

public class UserAddressServiceImpl implements UserAddressService {
	
	private static Logger log = Logger.getLogger(UserAddressServiceImpl.class);  
	
	private SqlSessionFactory sessionFactory = MybatisUtil.getInstance();
	
	@Override
	public void addUserAddress(UserAddressVO vo) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			UserAddressMapper mapper = session.getMapper(UserAddressMapper.class);
			mapper.addUserAddress(vo);
			session.commit();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public void updateUserAddress(UserAddressVO vo) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			UserAddressMapper mapper = session.getMapper(UserAddressMapper.class);
			mapper.updateUserAddress(vo);
			session.commit();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public UserAddressVO getAddressByID(int pk_address) throws Exception {
		UserAddressVO vo = null;
		SqlSession session = sessionFactory.openSession();
		try {
			UserAddressMapper mapper = session.getMapper(UserAddressMapper.class);
			vo = mapper.getAddressByID(pk_address);
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
		return vo;
	}
	
	@Override
	public UserAddressVO getUserDefaultAddressByID(int pk_user) throws Exception {
		UserAddressVO vo = null;
		SqlSession session = sessionFactory.openSession();
		try {
			UserAddressMapper mapper = session.getMapper(UserAddressMapper.class);
			vo = mapper.getUserDefaultAddressByID(pk_user);
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
		return vo;
	}

	@Override
	public UserAddressVO getUserKitchenAddressByID(int pk_user) throws Exception {
		UserAddressVO vo = null;
		SqlSession session = sessionFactory.openSession();
		try {
			UserAddressMapper mapper = session.getMapper(UserAddressMapper.class);
			vo = mapper.getUserKitchenAddressByID(pk_user);
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
		return vo;
	}
	
	@Override
	public void deleteUserAddress(int pk_useraddress) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			UserAddressMapper mapper = session.getMapper(UserAddressMapper.class);
			mapper.deleteUserAddress(pk_useraddress);
			session.commit();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public void setUserDefaultAddressByID(int pk_user, int pk_address) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			UserAddressMapper mapper = session.getMapper(UserAddressMapper.class);
			//查询指定用户之前的默认地址
			UserAddressVO defaultaddvo = mapper.getUserDefaultAddressByID(pk_user);
			
			if(!defaultaddvo.getPk_address().equals(pk_address)) {
				//更新原始默认地址为非默认
				this.updateAddressDefaultFlag(defaultaddvo.getPk_address(), 0);
				//更新新地址为默认
				this.updateAddressDefaultFlag(pk_address, 1);
			}
			session.commit();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}
	
	@Override
	public void updateAddressDefaultFlag(int pk_address, int defaultflag) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			UserAddressMapper mapper = session.getMapper(UserAddressMapper.class);
			HashMap<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("pk_address", pk_address);
			paramMap.put("defaultflag", defaultflag);
			
			mapper.updateAddressDefaultFlag(paramMap);
			session.commit();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public List<UserAddressVO> getAllUserAddressInfoByID(int pk_user) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			UserAddressMapper mapper = session.getMapper(UserAddressMapper.class);
			List<UserAddressVO> vos = mapper.getAllUserAddressInfoByID(pk_user);
			return vos;
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public List<UserAddressVO> getAllUserReceiveAddressInfoByID(int pk_user) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			UserAddressMapper mapper = session.getMapper(UserAddressMapper.class);
			List<UserAddressVO> vos = mapper.getAllUserReceiveAddressInfoByID(pk_user);
			return vos;
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}
	
}
