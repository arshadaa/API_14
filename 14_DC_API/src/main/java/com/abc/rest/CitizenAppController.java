package com.abc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.abc.binding.CitizenAppBinding;
import com.abc.service.CitizenAppService;

@RestController
public class CitizenAppController {

	@Autowired
	private CitizenAppService service;
	
	
	public ResponseEntity<String> registerCitizen(@RequestBody Integer appId){
		String response = service.checkAppId(appId);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
