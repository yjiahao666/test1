package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	/**
	 * 
	 * @param orderId
	 * @return
	 */
	List<Item> getItems(String orderId);
	/**
	 * �ڱ��涩��ʱ������Ʒ���
	 * @param list
	 */
	void decreaseNumbers(List<Item> list);
}
