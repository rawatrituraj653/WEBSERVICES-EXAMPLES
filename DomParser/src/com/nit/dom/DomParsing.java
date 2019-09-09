package com.nit.dom;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomParsing{

	public static void main(String[] args) throws Exception{
		System.out.println("Main Method");

	DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
	
	DocumentBuilder builder=builderFactory.newDocumentBuilder();
	Document document= builder.parse("Book.xml");
	
		Element element=document.getDocumentElement();
	System.out.println("Root Element: "+element.getNodeName());
		NodeList list=document.getElementsByTagName("book");
		if(list!=null) {
			for (int i = 0; i < list.getLength(); i++) {
				Node node=list.item(i);
				Element element2=(Element) node;
				System.out.println("Id   :"+element2.getElementsByTagName("id").item(0).getTextContent());
				System.out.println("Name :"+element2.getElementsByTagName("name").item(0).getTextContent());
				}		
				
		}
	
				
		}		
		
	}
	
