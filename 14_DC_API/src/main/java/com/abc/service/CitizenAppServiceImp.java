package com.abc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.binding.CitizenAppBinding;
import com.abc.entity.CitizenAppEntity;
import com.abc.repository.CitizenAppRepo;

@Service
public class CitizenAppServiceImp implements CitizenAppService {
 
	@Autowired
	private CitizenAppRepo repo;
	
	@Override
	public String checkAppId(Integer id) {
		
		boolean check = repo.existsById(id);
		if(check) {
			
			return "App Id found...";
		}
		
		return "App Id not found...";
	}

}
