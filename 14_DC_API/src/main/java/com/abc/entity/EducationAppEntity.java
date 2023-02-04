package com.abc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "EDUCATION_DETAILS")
public class EducationAppEntity {

	@Id
	@GeneratedValue
	private Integer EducationId;
	private String highestDegree;
	private Integer graduationYear;
	private String universityName;
}
