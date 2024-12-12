package com.splitwise.clone.mapper;

import org.mapstruct.Mapper;

import com.splitwise.clone.entity.ExpenseEntity;
import com.splitwise.clone.vo.ExpenseRequestVo;

@Mapper(componentModel = "spring")
public interface ExpenseMapper {

	ExpenseEntity toExpenseEntity(ExpenseRequestVo expenseRequestVo);
}
