package com.nt.beans;

public class PhonePay implements Payment {
	public PhonePay() {
		 System.out.println("Payment-via-PhonePay");
	}
	@Override
	public String payment(int sum,int transactionId,long AcNo[]) { 
		return "phonepay is ready to provide service"+
	"\nfetching Ac information"+
	"\nHii user your A/cNo is="+AcNo[0]+"\ntotal amount is="+
	sum+"\ntransaction Id="+transactionId+"\nyour trasaction is successfull !!!";
	}
}
