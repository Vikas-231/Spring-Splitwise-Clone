package com.splitwise.clone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	@Override
	public void registerUser(UserRequestVo userRequestVo) {
		UserEntity userEntity = UserMapper.INSTANCE.toUserEntity(userRequestVo);
		userRepository.save(userEntity);
	}

	@Override
	public UserVo loginUser(UserRequestVo userRequest) {
		UserEntity userEntity = userRepository.findByEmail(userRequest.getEmail());
		UserVo userVo = UserMapper.INSTANCE.toUserVo(userEntity);
		return userVo;
	}

}
