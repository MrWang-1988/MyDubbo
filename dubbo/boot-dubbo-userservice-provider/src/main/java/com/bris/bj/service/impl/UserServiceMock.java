package com.bris.bj.service.impl;

import java.util.List;

import com.bris.bj.exception.BusinessException;
import com.bris.bj.service.UserService;
import com.bris.bj.service.entity.UserAddress;

public class UserServiceMock implements UserService {

	@Override
	public List<UserAddress> getUserAddr(String uid) throws BusinessException {
		System.out.println("调用getUserAddr服务异常了...");
		return null;
	}

	@Override
	public UserAddress getUserAddrById(String userId) throws BusinessException {
		System.out.println("调用getUserAddrById服务异常了...");
		return null;
	}
	
	public UserServiceMock() {
	}
	
	

}
