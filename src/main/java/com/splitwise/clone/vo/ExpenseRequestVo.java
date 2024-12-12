package com.splitwise.clone.vo;

import java.time.LocalDateTime;
import java.util.List;

import com.splitwise.clone.model.PeopleVo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExpenseRequestVo {
	
	private Long amount;
	
	private String expenseName;
	
	private boolean isEquallyDivided;
	
	private String paidByUserEmail;
	
	private LocalDateTime expenseDate;
	
	private List<PeopleVo> involvedPeople;

}
