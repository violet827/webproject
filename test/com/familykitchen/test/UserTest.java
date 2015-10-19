package com.familykitchen.test;


import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.familykitchen.bean.UserAddressVO;
import com.familykitchen.bean.UserVO;
import com.familykitchen.mapper.UserAddressMapper;
import com.familykitchen.mapper.UserMapper;
import com.familykitchen.utils.MybatisUtil;

public class UserTest {
	private SqlSessionFactory sessionFactory= MybatisUtil.getInstance();
	
//	@Test
//	public void save() {
//		SqlSession session = sessionFactory.openSession();
//		try {
//			UserMapper userMapper = session.getMapper(UserMapper.class);
//			
//			UserVO user = new UserVO();
////			user.setId("1");
//			user.setName("aa");
//			user.setPassword("2");
//			user.setTelphone("2");
//			
////			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
////			java.util.Date date = sdf.parse("2012-05-04");
////			user.setBirthday(date);
////			user.setBirthday("2012-05-04");
//			
////			user.setIntro("ΩÈ…‹");
//			userMapper.addUser(user);
//			session.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			session.close();
//		}
//	}
	
	@Test
	public void getUserByTelAndPwd() {
		SqlSession session = sessionFactory.openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("telphone", "13521844691");
			map.put("password", "guoting");
			UserVO user = userMapper.getUserByTelAndPwd(map);
			
			if (user != null) {
				System.out.println(" name : " + user.getName() + ", password : " + user.getPassword());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
//	@Test
//	public void addUserAddress() {
//		SqlSession session = sessionFactory.openSession();
//		try {
//			UserAddressMapper mapper = session.getMapper(UserAddressMapper.class);
//			for (int i = 0; i < 10; i++) {
//				UserAddressVO address = new UserAddressVO();
//				address.setPk_user(1);
//				address.setDetailaddress("address" + i);
//				mapper.addUserAddress(address);
//			}
//			session.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			session.close();
//		}
//	}
	
//	@Test
//	public void getAddressList(){
//		SqlSession session = sessionFactory.openSession();
//        try {
//            UserAddressMapper userOperation=session.getMapper(UserAddressMapper.class);           
//            List<UserAddressVO> list = userOperation.getAllUserAddressInfoByID(1);
//            for(UserAddressVO addressvo : list){
//                System.out.println(addressvo.getPk_address() + ":" + addressvo.getDetailaddress());
//            }
//        } finally {
//            session.close();
//        }
//    }
	
//	@Test
//	public void update() {
//		SqlSession session = sessionFactory.openSession();
//		try {
//			UserMapper userMapper = session.getMapper(UserMapper.class);
//			
//			UserVO user = userMapper.find("1");
//			if (user != null) {
//				user.setName("bear");
//				userMapper.update(user);
//			}
//			session.commit();
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
//			UserMapper userMapper = session.getMapper(UserMapper.class);
//			
//			userMapper.delete("1");
//			session.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			session.close();
//		}
//	}
}
