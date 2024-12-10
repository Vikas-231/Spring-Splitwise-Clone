package com.splitwise.clone.service;

import com.splitwise.clone.model.UserVo;
import com.splitwise.clone.vo.UserRequestVo;

public interface UserService {

	public void registerUser(UserRequestVo userRequestVo);

	public UserVo loginUser(UserRequestVo userRequest);
}
