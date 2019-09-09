package com.nit.test;

//import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import in.ms.project.types.ProjectType;

public class AppTestMarshaller {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		System.out.println("main methods....");
		
	ProjectType type=new ProjectType();
	type.setProjId(11001);
	type.setProjName("RiturajRawat");
	type.setProjDate(new Date(2019-1900,10-1,16));
	JAXBContext ctx=JAXBContext.newInstance("in.ms.project.types");	
	Marshaller marshaller=ctx.createMarshaller();
	//marshaller.marshal(type,new File("Abc.xml"));
	marshaller.marshal(type,System.out);
	System.out.println("Programme ends..........");
		
	}
}
