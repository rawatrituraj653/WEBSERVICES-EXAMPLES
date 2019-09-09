package com.st.test;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class AccountTest {

	public static void main(String[] args) throws Exception {
		
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=factory.newDocumentBuilder();
		Document document=builder.parse("Account.xml");	
		document.getDocumentElement().normalize();
		Element element=document.getDocumentElement();
		System.out.println(element.getNodeName());
		
		NodeList list=document.getElementsByTagName("Account");
			visitChildElement(list);
	}
	public static void visitChildElement(NodeList list) {
		for (int i = 0; i < list.getLength(); i++) {
			Node node=list.item(i);
			if(node.getNodeType()==Node.ELEMENT_NODE) {
				System.out.println("Node Name: "+node.getNodeName()
					+" Value :"+node.getTextContent());
			
			if(node.hasAttributes()) {
				NamedNodeMap nodeMap=node.getAttributes();
				for(int j=0;j<nodeMap.getLength(); j++) {
					Node nodetemp=nodeMap.item(j);
					System.out.println("Attr type: "+nodetemp.getNodeName()+
							"\t value: "+nodetemp.getTextContent());
				}

			
			if(node.hasChildNodes()) {
				visitChildElement(node.getChildNodes());
				
			}
			}	
		}
	  }		
	}
}
