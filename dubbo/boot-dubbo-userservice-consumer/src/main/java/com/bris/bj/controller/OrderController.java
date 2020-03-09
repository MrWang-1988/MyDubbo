package com.bris.bj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bris.bj.service.OrderService;
import com.bris.bj.service.entity.UserAddress;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/userAddr/{uid}")
	public List<UserAddress> userAddress(@PathVariable(name="uid") String userId){
		List<UserAddress> list = orderService.queryUserAddress(userId);
		return list;
	}
	
	@GetMapping("/orderCon/{uid}")
	public UserAddress hello(@PathVariable("uid") String mess){
		return orderService.queryUserAddressById(mess);
	}
}
