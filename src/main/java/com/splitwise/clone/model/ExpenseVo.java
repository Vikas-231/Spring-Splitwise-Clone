package com.splitwise.clone.model;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseVo {
	
	private Long amount;
	
	private String expenseName;
	
	private boolean isEquallyDivided;
	
	private String paidByUserName;
	
	private LocalDateTime expenseDate;
	
	private List<PeopleVo> involvedPeople;

}
