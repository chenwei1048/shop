package com.zheng.shop.redis;

public interface KeyPrefix {
		
	int expireSeconds();
	
	String getPrefix();
	
}
