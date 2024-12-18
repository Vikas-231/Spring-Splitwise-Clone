package com.splitwise.clone.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRequestVo {

	private String username;

	private String password;

	private String firstName;

	private String lastName;

	private String email;

	private Long mobileNumber;

}
