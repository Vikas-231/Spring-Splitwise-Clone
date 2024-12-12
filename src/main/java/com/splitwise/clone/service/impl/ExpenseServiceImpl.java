package com.splitwise.clone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.splitwise.clone.entity.ExpenseEntity;
import com.splitwise.clone.entity.PeopleEntity;
import com.splitwise.clone.mapper.ExpenseMapper;
import com.splitwise.clone.repository.jpa.ExpenseRepository;
import com.splitwise.clone.service.ExpenseService;
import com.splitwise.clone.vo.ExpenseRequestVo;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepository;
	
	@Autowired
	private ExpenseMapper expenseMapper;

	@Override
	public void saveExpense(ExpenseRequestVo expenseRequestVo) {
		ExpenseEntity expenseEntity = expenseMapper.toExpenseEntity(expenseRequestVo);
		if (expenseEntity.getInvolvedPeople() != null) {
            for (PeopleEntity people : expenseEntity.getInvolvedPeople()) {
                people.setExpenseEntity(expenseEntity);
            }
        }
		expenseRepository.save(expenseEntity);
	}

}
