package com.splitwise.clone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.splitwise.clone.service.ExpenseService;
import com.splitwise.clone.vo.ExpenseRequestVo;

@RestController
@RequestMapping("/splitiwise_clone")
public class ExpenseController {
	
	@Autowired
	private ExpenseService expenseService;
	
	@PostMapping("/save_expense")
	public void createExpense(@RequestBody ExpenseRequestVo expenseRequestVo) {
		expenseService.saveExpense(expenseRequestVo);
	}

}
