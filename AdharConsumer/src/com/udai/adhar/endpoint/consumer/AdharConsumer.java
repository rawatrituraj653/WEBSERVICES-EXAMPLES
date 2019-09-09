package com.udai.adhar.endpoint.consumer;

import com.udai.adhar.endpoint.Person;
import com.udai.adhar.endpoint.impl.IUidai;
import com.udai.adhar.endpoint.impl.IUidaiImplService;

public class AdharConsumer {

	public static void main(String[] args) {
		
		IUidaiImplService implService=new IUidaiImplService();
		IUidai iUidai=implService.getPort(IUidai.class);
		Person person=iUidai.getAdharData(700045676544l);
		System.out.println(person);	
	}
}
