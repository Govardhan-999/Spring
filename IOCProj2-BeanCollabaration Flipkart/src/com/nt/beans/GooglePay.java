package com.nt.beans;

import java.util.Arrays;

public class GooglePay implements Payment {
	public GooglePay() {
		 System.out.println("Payment-via-GooglePay");
	}
	@Override
	public String payment(int sum,int transactionId,long AcNo[]) { 
		return "GooglePay is ready to provide service\n"
	+"fetching Ac information"+
	"\nHii user your A/cNo is="+AcNo[0]+
	"\ntotal amount is="+sum+ "\ntransaction Id="+
	transactionId+"\nyour trasaction is successfull !!!";
	}}
