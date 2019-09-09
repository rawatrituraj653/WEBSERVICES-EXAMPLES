package com.flipkart.mobile.mi;

import java.util.Iterator;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.ws.soap.SOAPFaultException;

public  class AtmHandlersForConsumer implements SOAPHandler<SOAPMessageContext>{

	 public AtmHandlersForConsumer() {
		
		System.out.println("Handlers ::: Constructor");
	}

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		
				
				Boolean outbound=(Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
				if(outbound) {
					try {
						SOAPMessage message=context.getMessage();
						SOAPEnvelope envelope=message.getSOAPPart().getEnvelope();
						SOAPHeader header=envelope.getHeader();
						if(header==null) {
							 header= envelope.addHeader();
						}	
						String key=getSecretKey();
					QName name=new QName("http://flipkart.com/mobile/mi","SecretKey");
					SOAPHeaderElement element=header.addHeaderElement(name);
					element.setActor(SOAPConstants.URI_SOAP_ACTOR_NEXT);
					element.addTextNode(key);
					message.saveChanges();
					
					message.writeTo(System.out);
					System.err.println("\n This is from consumer");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
		return true;
	}

	private String getSecretKey() {
		return "PAY123";
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void close(MessageContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

}
