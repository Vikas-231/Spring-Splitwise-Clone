package com.splitwise.clone.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="expense_details")
public class ExpenseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="expense_id")
	private Long expenseId;
	
	@Column(name="amount")
	private Long amount;
	
	@Column(name="expense_name")
	private String expenseName;
	
	@Column(name="is_equally_divided")
	private boolean isEquallyDivided;
	
	@Column(name="paid_by_user_email")
	private String paidByUserEmail;
	
	@Column(name="expense_date")
	private LocalDateTime expenseDate;
	
	@OneToMany(mappedBy = "expenseEntity", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<PeopleEntity> involvedPeople;

}
