package com.splitwise.clone.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserVo {

	private String username;

	private String firstName;

	private String lastName;

	private String email;

	private Long mobileNumber;

}
