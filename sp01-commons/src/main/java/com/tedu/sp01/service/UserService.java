package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;
import com.tedu.sp01.pojo.User;

public interface UserService {
	/**
	 * ��ȡ�û�id
	 * @param id
	 * @return
	 */
	User getUser(Integer id);
	/**
	 * ���ӻ���
	 * @param id
	 * @param score
	 */
	void addScore(Integer id, Integer score);
}
