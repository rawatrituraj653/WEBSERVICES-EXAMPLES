package com.flipkart.mobile.mi;

import javax.jws.HandlerChain;
import javax.jws.WebService;

import org.payments.paytm.binding.AccountInfoRequest;
import org.payments.paytm.binding.InvoiceInfo;

@WebService(endpointInterface = "com.flipkart.mobile.mi.IAtm")
//@HandlerChain(file = "handler-chain.xml")
public class IAtmImpl implements IAtm{

		public IAtmImpl() {
			System.out.println("IATM IMPL:: Constructor");
		}
	
	@Override
	public InvoiceInfo getInvoiceInfo(AccountInfoRequest accountData) {
		System.out.println("Get Invoice Info");
	
	InvoiceInfo	 info= new InvoiceInfo();
			 	info.setTxNo("TXN1231PAY122");
				info.setInvoiceInfo("INVOICE-INFO");
				info.setStatus("success...");
				info.setDenialRsn("this is sucessfullly orderd..");
				info.setInvoiceGenDate("16-NOV-2019");
		
	
		 	
		return info;
	}
}
