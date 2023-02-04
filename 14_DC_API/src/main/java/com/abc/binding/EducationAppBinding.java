package com.abc.binding;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
public class EducationAppBinding {

	private Integer EducationId;
	private String highestDegree;
	private Integer graduationYear;
	private String universityName;
}
