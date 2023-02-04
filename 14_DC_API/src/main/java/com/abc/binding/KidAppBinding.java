package com.abc.binding;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
public class KidAppBinding {
   
	
	private String kidName;
	private Integer kidAge;
	private Long SSN;
}
