package com.flipkart.mobile.mi;

import java.util.Iterator;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.ws.soap.SOAPFaultException;

public class AtmHandlers implements SOAPHandler<SOAPMessageContext>{

	public AtmHandlers() {
		System.out.println("Handlers ::: Constructor");
	}
	
	
	@Override
	public boolean handleMessage(SOAPMessageContext context) {
			SOAPMessage message=context.getMessage();
			Boolean outbound=(Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY );
			if(!outbound) {
				try {
				message.writeTo(System.out);
				SOAPHeader header=message.getSOAPHeader();
			Iterator<?> itr=header.extractHeaderElements(SOAPConstants.URI_SOAP_ACTOR_NEXT);
				if(itr.hasNext()) {
					Node node=(Node)itr.next();
					String str=node.getValue();
					if("PAY123".equals(str.trim())) {
						return true;
					}
					else {
						generatedSoapFault(message);
					}
				}
				else {
					generatedSoapFault(message);
				}
				} catch (Exception e) {
				
					e.printStackTrace();
				}
			}
		return false;
	}
	private void generatedSoapFault(SOAPMessage message) {
		 try {
			SOAPBody body=message.getSOAPBody();
			body.removeContents();
			SOAPFault fault=body.addFault();
			fault.setFaultCode("IC00110ERROR");
			fault.setFaultString("This is invalid Key");
			throw new SOAPFaultException(fault);
		 } catch (SOAPException e) {
		
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		
		
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
