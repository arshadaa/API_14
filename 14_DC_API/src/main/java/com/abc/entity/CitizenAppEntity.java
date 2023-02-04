package com.abc.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name = "CITIZEN_APPS")
@Data
public class CitizenAppEntity {
	
	@Id
	@GeneratedValue
	private Integer appId;
	private String fname;
	private String email;
	private String gender;
	private long mobileNum;
	private long ssn;
	private LocalDate dob;
	
	@CreationTimestamp
	private LocalDate creationDate;
	
	@UpdateTimestamp
	private LocalDate updationDate;
	
	private Integer updatedBy;
	private Integer createdBy;
}

