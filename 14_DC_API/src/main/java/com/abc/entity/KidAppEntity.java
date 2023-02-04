package com.abc.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "KIDS_DETAILS")
public class KidAppEntity {
   
	@Id
	@GeneratedValue
	private Integer kidId;
	private String kidName;
	private Integer kidAge;
	private Long SSN;
}