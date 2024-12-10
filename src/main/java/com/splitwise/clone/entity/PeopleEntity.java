package com.splitwise.clone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="people_in_expense")
public class PeopleEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="people_id")
	private Long peopleId;
	
	@ManyToOne
    @JoinColumn(name = "expense_id", nullable = false) 
    private ExpenseEntity expenseEntity;

	@Column(name="email")
	private String email;
	
	@Column(name="split_percent")
	private Double splitPercent;
	
	@Column(name="mobile_number")
	private Long mobileNumber;
	
	@Column(name="individual_amount")
	private Long individualAmount;
	
}
