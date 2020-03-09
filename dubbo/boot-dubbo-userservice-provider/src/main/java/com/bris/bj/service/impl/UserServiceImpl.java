package com.bris.bj.service.impl;

import java.util.Arrays;
import java.util.List;

import com.bris.bj.service.UserService;
import com.bris.bj.service.entity.UserAddress;
import com.bris.bj.utils.DateUtils;

//@Service(ServiceNameDefinition.USERSERVICE_BEAN)
public class UserServiceImpl implements UserService {

	@Override
	public List<UserAddress> getUserAddr(String uid) {
		System.out.println(DateUtils.dateToStrCurrent() + " 调用的是springboot版本 getUserAddr 20880......");
		//为了测试超时时间
		try {
//			Thread.sleep(3000);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		UserAddress user1 = new UserAddress("京东", "jingdong@qq.com", 10, "北京市大兴区京东大厦");
		UserAddress user2 = new UserAddress("天猫", "tianmao@qq.com", 11, "北京市大兴区天猫大厦");
				
		return Arrays.asList(user1,user2);
	}

	@Override
	public UserAddress getUserAddrById(String userId) {
		System.out.println("调用的是springboot版本 getUserAddrById......");
		//为了测试超时时间
		try {
			//测试方法与接口配置的优先级
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(10/0 > 0){
			
		}
		UserAddress user1 = new UserAddress("网易", "wangyi@qq.com", 12, "北京市大兴区网易大厦");
		return user1;
	}

}
