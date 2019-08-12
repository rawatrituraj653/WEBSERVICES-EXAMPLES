package in.tekleads.book.types;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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

public class AuthenticationHandler implements SOAPHandler<SOAPMessageContext>{
	public AuthenticationHandler() {
		System.out.println("AuthenticationHandler:: static");
	}
	
	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		System.out.println("this is handle Message Called");
		SOAPMessage message=context.getMessage();
		Boolean outbound=(Boolean)context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		System.out.println(outbound);
		if(!outbound){
			try {
				File file1 =new File("D:\\Bootstrap\\css\\input.txt");
				if(!file1.exists()) {
				boolean b=file1.createNewFile();
					System.out.println(b);
				}
				FileOutputStream  fos=new FileOutputStream(file1);
				message.writeTo(fos);
				SOAPHeader header=message.getSOAPHeader();
				//use namesapce soapenv:actor="http://schemas.xmlsoap.org/soap/actor/next"
				Iterator itr= header.extractHeaderElements(SOAPConstants.URI_SOAP_ACTOR_NEXT);
				System.out.println("Iterator====================>");
				if(itr.hasNext()) {
					System.out.println("Inside Iterator======================>");
					Node node=(Node) itr.next();
					if(node!=null) {
						System.out.println("inside=================================>");
						String value=node.getValue();
						System.out.println("inside=================================>"+value);
						if("abc@123".equals(value.trim())) {
							System.out.println("inside=================================>COmparison");
							return true;
						}else {
						
							generateSoapFaultException(message);
						}
					}
				}
					else {
						generateSoapFaultException(message);
					}
			} catch (SOAPException | IOException e) {
				
				e.printStackTrace();
			}
		}else {
			try {
			File file2 =new File("D:\\Bootstrap\\css\\input1.txt");
				if(!file2.exists()) {
				boolean b=file2.createNewFile();
					System.out.println(b);
				}FileOutputStream  fos=new FileOutputStream(file2);
				message.writeTo(fos);
			} catch (SOAPException | IOException e) {
				e.printStackTrace();
			}
		}
		
		return false;
	}

	private void generateSoapFaultException(SOAPMessage message) {
		try {
			SOAPBody body=message.getSOAPBody();
			SOAPFault fault=body.addFault();
			body.removeContents();
			fault.setFaultCode("IC10001ERROR");
			fault.setFaultString("Invalid  Request");
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
		
	}
	@Override
	public Set<QName> getHeaders() {
		return null;
	}
	
	
	

}
