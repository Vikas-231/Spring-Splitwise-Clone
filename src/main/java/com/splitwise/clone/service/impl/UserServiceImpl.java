package com.splitwise.clone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.splitwise.clone.entity.UserEntity;
import com.splitwise.clone.mapper.UserMapper;
import com.splitwise.clone.model.UserVo;
import com.splitwise.clone.repository.jpa.UserRepository;
import com.splitwise.clone.service.UserService;
import com.splitwise.clone.vo.UserRequestVo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserMapper userMapper;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void registerUser(UserRequestVo userRequestVo) {
		UserEntity userEntity = userMapper.toUserEntity(userRequestVo);
		userRepository.save(userEntity);
	}

	@Override
	public UserVo loginUser(UserRequestVo userRequest) {
		UserEntity userEntity = userRepository.findByEmail(userRequest.getEmail());
		UserVo userVo = userMapper.toUserVo(userEntity);
		return userVo;
	}

}
