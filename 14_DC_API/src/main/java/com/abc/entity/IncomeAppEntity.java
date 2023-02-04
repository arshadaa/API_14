package com.abc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "INCOME_DETAILS")
public class IncomeAppEntity {

	@Id
	@GeneratedValue
	private Integer incomeId;
	private Long monthlySalaryIncome;
	private Long rentIncome;
	private Long propertyIncome;
}
