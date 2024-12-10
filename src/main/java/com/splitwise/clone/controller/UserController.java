package com.splitwise.clone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.splitwise.clone.model.UserVo;
import com.splitwise.clone.service.UserService;
import com.splitwise.clone.vo.UserRequestVo;

@RestController
@RequestMapping("/splitiwise_clone")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/signup")
	public void createUser(@RequestBody UserRequestVo userRequest) {
		userService.registerUser(userRequest);
	}

	@GetMapping("/login")
	public UserVo loginUser(@RequestBody UserRequestVo userRequest) {
		return userService.loginUser(userRequest);
	}

}
