package com.familykitchen.test;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.familykitchen.bean.UserAddressVO;
import com.familykitchen.mapper.UserAddressMapper;
import com.familykitchen.service.impl.UserAddressServiceImpl;
import com.familykitchen.utils.MybatisUtil;

public class UserAddressTest {
	private SqlSessionFactory sessionFactory= MybatisUtil.getInstance();
	
//	
//	@Test
//	public void addUserAddress() {
//		SqlSession session = sessionFactory.openSession();
//		try {
//			UserAddressMapper mapper = session.getMapper(UserAddressMapper.class);
//			for (int i = 0; i < 3; i++) {
//				UserAddressVO address = new UserAddressVO();
//				UserVO user = new UserVO();
//				user.setPk_user(5);
//				address.setPk_user(user);
//				address.setDetailaddress("0513address" + i);
//				if (i == 1)
//					address.setDefaultflag(Boolean.TRUE);
//				mapper.addUserAddress(address);
//			}
//			session.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			session.close();
//		}
//	}
	
	@Test
	public void getAddressList(){
		SqlSession session = sessionFactory.openSession();
        try {
            UserAddressMapper userOperation=session.getMapper(UserAddressMapper.class);           
            List<UserAddressVO> list = userOperation.getAllUserAddressInfoByID(4);
            for(UserAddressVO addressvo : list){
                System.out.println("address:" + addressvo.getDetailaddress() + "username:" + addressvo.getPk_user().getName() + "usertelphone:" + addressvo.getPk_user().getTelphone());
            }
        } finally {
            session.close();
        }
    }
	
//	@Test
//	public void update() {
//		SqlSession session = sessionFactory.openSession();
//		try {
//			UserAddressMapper mapper = session.getMapper(UserAddressMapper.class);
//			
//			UserAddressVO address = new UserAddressVO();
//			address.setPk_address(17);
//			UserVO user = new UserVO();
//			user.setPk_user(5);
//			address.setPk_user(user);
//			address.setDetailaddress("œÍœ∏µÿ÷∑222");
//			address.setKitchenflag(Boolean.TRUE);
//			
//			mapper.updateUserAddress(address);
//			session.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			session.close();
//		}
//	}
	
//	@Test
//	public void updateAddressDefaultFlag() {
//		SqlSession session = sessionFactory.openSession();
//		try {
//			UserAddressMapper mapper = session.getMapper(UserAddressMapper.class);
//			mapper.updateAddressDefaultFlag();
//			session.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			session.close();
//		}
//	}
	
	@Test
	public void setUserDefaultAddressByID() {
		UserAddressServiceImpl service = new UserAddressServiceImpl();
		try {
			service.setUserDefaultAddressByID(5, 17);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
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
