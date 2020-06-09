package com.woniu.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.mapper.UsersMapper;
import com.woniu.pojo.Users;
import com.woniu.pojo.UsersExample;
import com.woniu.pojo.UsersExample.Criteria;
import com.woniu.service.UsersService;
@Service
public class UsersServiceImpl implements UsersService{
@Autowired
UsersMapper usersMapper;
	@Override
	public Users login(Users user) {
		UsersExample example = new UsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andUnameEqualTo(user.getUname());
		criteria.andUpwdEqualTo(user.getUpwd());
		List<Users> list = usersMapper.selectByExample(example);
		return list.size()==0?null:list.get(0);
	}

}
