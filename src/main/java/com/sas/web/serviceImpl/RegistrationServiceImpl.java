package com.sas.web.serviceImpl;

import org.springframework.stereotype.Service;

import com.sas.web.entity.RegistrationEntity;
import com.sas.web.model.RegistrationModel;

@Service
public class RegistrationServiceImpl {
	
	public void saveUsers(RegistrationModel registrationModel){
		
		System.out.println("service");
		RegistrationEntity registrationEntity=new RegistrationEntity();
		registrationEntity.setCurrentYear(registrationModel.getCurrentYear());
	}

}
