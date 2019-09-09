package com.nit.test;

import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import in.ms.project.types.ProjectType;

public class AppTestUnMarshaller {

	public static void main(String[] args) throws Exception{
	SchemaFactory factory=SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
	Schema schema= factory.newSchema(new File("project.xsd"));
	JAXBContext context=JAXBContext.newInstance("in.ms.project.types");
	Unmarshaller unmarshaller= context.createUnmarshaller();
	unmarshaller.setSchema(schema);
	@SuppressWarnings("unchecked")
	JAXBElement<ProjectType> element=(JAXBElement<ProjectType>) unmarshaller.unmarshal(new File("Abc.xml"));
	ProjectType type=element.getValue();
	System.out.println(type);
		
		
	}
}
