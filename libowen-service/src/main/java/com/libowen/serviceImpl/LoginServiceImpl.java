package com.libowen.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.libowen.dao.UserMapper;
import com.libowen.model.UserDTO;
import com.libowen.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Resource
	private UserMapper userMapper;
	
	@Override
	public UserDTO joinLogin(UserDTO dto) {
		return userMapper.joinLogin(dto);
	}

}
