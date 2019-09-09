package com.nit.jaxb.test;

import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import order.purchase.types.PurchaseOrderType;

public class AppUnMarshaller {

	public static void main(String[] args) {
		SchemaFactory factory=SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		try {
			Schema schema=factory.newSchema(new File("PO.xsd"));
			JAXBContext  context=JAXBContext.newInstance("order.purchase.types");
			Unmarshaller unmarshaller=context.createUnmarshaller();
			unmarshaller.setSchema(schema);
			@SuppressWarnings("unchecked")
			JAXBElement<PurchaseOrderType> jaxb= (JAXBElement<PurchaseOrderType>) unmarshaller.unmarshal(new File("PO.xml"));
			PurchaseOrderType type=jaxb.getValue();
			System.out.println(type);
		} catch (SAXException | JAXBException e) {
			e.printStackTrace();
		}
		
	}
}
