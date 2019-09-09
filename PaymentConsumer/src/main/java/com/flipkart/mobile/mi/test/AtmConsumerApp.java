package com.flipkart.mobile.mi.test;

import org.payments.paytm.binding.AccountInfo;
import org.payments.paytm.binding.AccountInfoRequest;
import org.payments.paytm.binding.InvoiceInfo;
import org.payments.paytm.binding.TransactionInfo;

import com.flipkart.mobile.mi.IAtm;
import com.flipkart.mobile.mi.IAtmImplService;

public class AtmConsumerApp {

	public static void main(String[] args) {
		
		IAtmImplService atmImplService=new  IAtmImplService();
		IAtm atm=atmImplService.getPort(IAtm.class);
		
		TransactionInfo info =new TransactionInfo();
		info.setAmount(2000.00);
		info.setAtmId(233222322l);
		info.setPin(2331);
		
		AccountInfo accountInfo=new AccountInfo();
		accountInfo.setAccId("2343283473");
		accountInfo.setName("Rituraj Rawat");
		accountInfo.setAge(22);
		accountInfo.setBranch("Chhatarpur");
		
		AccountInfoRequest accountInfoRequest=new AccountInfoRequest();
		accountInfoRequest.setAccountInfo(accountInfo);
		accountInfoRequest.setTransactionInfo(info);
		
		InvoiceInfo invoiceInfo=atm.getInvoiceInfo(accountInfoRequest);
		System.out.println("\n"+invoiceInfo);
		
	}
}
