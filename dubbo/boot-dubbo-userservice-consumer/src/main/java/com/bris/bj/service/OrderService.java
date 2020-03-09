package com.bris.bj.service;

import java.util.List;

import com.bris.bj.service.entity.UserAddress;

public interface OrderService {

	public List<UserAddress> queryUserAddress(String userId);
	
	public UserAddress queryUserAddressById(String userId);
}
