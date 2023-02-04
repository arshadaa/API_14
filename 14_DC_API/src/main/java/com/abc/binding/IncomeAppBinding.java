package com.abc.binding;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INCOME_DETAILS")
public class IncomeAppBinding {

	@Id
	@GeneratedValue
	private Integer incomeId;
	private Long monthlySalaryIncome;
	private Long rentIncome;
	private Long propertyIncome;
}
