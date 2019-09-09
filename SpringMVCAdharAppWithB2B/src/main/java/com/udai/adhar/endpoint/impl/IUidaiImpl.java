package com.udai.adhar.endpoint.impl;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.udai.adhar.endpoint.IUidai;
import com.udai.model.Person;
import com.udai.service.IPersonService;

@WebService(endpointInterface = "com.udai.adhar.endpoint.IUidai")
@Component
public class IUidaiImpl implements IUidai {
	 @Autowired	
	private IPersonService service;
	
	public IUidaiImpl() {
		System.out.println("this is Endpoint Consrtuctor");
	}
	
	@Override
	public Person getAdharData(Long adharNum) {
		System.err.println("coming from Endpoint Impl Class:  "+service);	
		Person person=service.getPersonData(adharNum);
		System.out.println("Person from endpoint:  "+person);
		return person;		
	}

	@Override
	public Long adharEnroll(Person person) {
		System.err.println("coming from Endpoint Impl Class:  "+service);
		Long adharNum=service.savePersonData(person);	
		return adharNum;
	}
}
