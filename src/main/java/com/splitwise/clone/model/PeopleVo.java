package com.splitwise.clone.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PeopleVo {

	private String email;
	
	private Double splitPercent;
	
	private Long mobileNumber;
	
	private Long individualAmount;
	
}
