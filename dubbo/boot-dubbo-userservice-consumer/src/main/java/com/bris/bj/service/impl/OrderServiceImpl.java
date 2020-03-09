package com.bris.bj.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bris.bj.service.OrderService;
import com.bris.bj.service.UserService;
import com.bris.bj.service.entity.UserAddress;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private UserService userService;
	
	@Override
	public List<UserAddress> queryUserAddress(String userId) {
		Date date = new Date();
		long start = date.getTime();
		List<UserAddress> userAddr = userService.getUserAddr(userId);
		Date dateEnd = new Date();
		long end = dateEnd.getTime();
		long diff = end-start;
		System.out.println("queryUserAddress调用服务时间：" + diff + "毫秒");
		return userAddr;
	}
	
	
	@Override
	public UserAddress queryUserAddressById(String userId) {
		Date date = new Date();
		long start = date.getTime();
		UserAddress userAddr = userService.getUserAddrById(userId);
		Date dateEnd = new Date();
		long end = dateEnd.getTime();
		long diff = end-start;
		System.out.println("queryUserAddressById调用服务时间：" + diff + "毫秒");
		return userAddr;
	}

}
