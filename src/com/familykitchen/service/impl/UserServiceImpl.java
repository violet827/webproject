package com.familykitchen.service.impl;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.familykitchen.bean.UserVO;
import com.familykitchen.mapper.UserMapper;
import com.familykitchen.service.UserService;
import com.familykitchen.utils.MybatisUtil;

public class UserServiceImpl implements UserService {
	
	private static Logger log = Logger.getLogger(UserServiceImpl.class);  
	
	private SqlSessionFactory sessionFactory = MybatisUtil.getInstance();
	
	@Override
	public void addUser(UserVO user) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			mapper.addUser(user);
			session.commit();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public void updateUserPwd(int pk_user, String pwd) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			UserVO paramuservo = new UserVO();
			paramuservo.setPk_user(pk_user);
			paramuservo.setPassword(pwd);
			mapper.updateUserPwd(paramuservo);
			session.commit();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public UserVO getUserByTelAndPwd(String telphone, String password) throws Exception {
		UserVO user = null;
		SqlSession session = sessionFactory.openSession();
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			
			HashMap<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("telphone", telphone);
			paramMap.put("password", password);
			
			user = mapper.getUserByTelAndPwd(paramMap);
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
		return user;
	}

	@Override
	public void deleteUser(int pk_user) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			mapper.deleteUser(pk_user);
			session.commit();
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public int getUserByTelphone(String telphone) throws Exception {
		SqlSession session = sessionFactory.openSession();
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			int usercount = mapper.getUserByTelphone(telphone);
			return usercount;
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public UserVO getUserVOByID(int pk_user) throws Exception {
		UserVO uservo = null;
		SqlSession session = sessionFactory.openSession();
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			uservo = mapper.getUserVOByID(pk_user);
			return uservo;
		} catch (Exception e)  {
			log.error(e.getMessage());
			throw e;
		} finally {
			session.close();
		}
	}
}
