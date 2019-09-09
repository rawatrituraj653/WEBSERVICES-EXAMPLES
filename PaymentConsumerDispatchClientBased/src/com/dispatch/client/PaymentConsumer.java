package com.dispatch.client;


import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

public class PaymentConsumer {
	private static final String T_NS="http://flipkart.com/mobile/mi";
	private static final String TY_NS="http://paytm.payments.org/binding";
	private static final String ENDPOINT_URL="http://localhost:8085/PaymentBasedProvider/getTx";
	private static final String SERVICE_NAME="IAtmImplService";
	private static final String PORTNAME="IAtmImplPort";
	public static void main(String[] args) throws Exception {
	
		Service  service=Service.create(new QName(T_NS, SERVICE_NAME));
		QName portName=new QName(T_NS, PORTNAME);
		service.addPort(portName,SOAPBinding.SOAP11HTTP_BINDING, ENDPOINT_URL);
		Dispatch<SOAPMessage> dispatch=
		service.createDispatch(portName, SOAPMessage.class,Service.Mode.MESSAGE);
		MessageFactory factory=MessageFactory.newInstance();
		SOAPMessage request=factory.createMessage();
		SOAPPart part=request.getSOAPPart();
		SOAPEnvelope envelope=part.getEnvelope();
		
		SOAPBody body=envelope.getBody();
		SOAPElement accInfoRequest=body.addChildElement("accountInfoRequest", "wsdl", T_NS);
		SOAPElement accInfo=accInfoRequest.addChildElement("accountInfo","typ",TY_NS);
		accInfo.addChildElement("accId").addTextNode("MYACCOUNT");
		accInfo.addChildElement("name").addTextNode("JOHN CENA");
		accInfo.addChildElement("age").addTextNode("23");
		accInfo.addChildElement("branch").addTextNode("Chhatarpur");
		
		SOAPElement trnInfo=accInfoRequest.addChildElement("transactionInfo", "typ", TY_NS);
		trnInfo.addChildElement("atmId").addTextNode("23423321");
		trnInfo.addChildElement("pin").addTextNode("4325");
		trnInfo.addChildElement("amount").addTextNode("34000.00");
		
		request.writeTo(System.out);
		
		SOAPMessage response=dispatch.invoke(request);
		response.writeTo(System.out);
		
	
	
	}
}
