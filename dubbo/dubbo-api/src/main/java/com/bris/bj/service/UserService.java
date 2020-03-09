package com.bris.bj.service;

import java.util.List;

import com.bris.bj.exception.BusinessException;
import com.bris.bj.service.entity.UserAddress;

public interface UserService {

	/**
	 * 根据用户ID查询用户地址
	 * @return
	 */
	public List<UserAddress> getUserAddr(String uid) throws BusinessException;
	
	
	public UserAddress getUserAddrById(String userId) throws BusinessException;
}
