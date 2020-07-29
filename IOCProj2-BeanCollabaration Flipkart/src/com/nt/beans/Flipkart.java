package com.nt.beans;
import java.util.Arrays;
import java.util.Random;
public class Flipkart {
	private Payment payment;
	private Courier courier;
	public Flipkart() {
		 System.out.println("===Welcome to Flipkart===");
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
     public void setCourier(Courier courier) {
		this.courier = courier;
	}
     public String purchase(String name[],long AcNo[],String items[], int amount[]) {
	      Random rad=new Random();
	      int sum=0;
       for(int i=0;i<amount.length;i++)
      {
    	sum+=amount[i];
      }
       String S1=Arrays.toString(items);
	int transactionId=rad.nextInt(70000586);
	int oid=rad.nextInt(45687812);
	String s2=courier.deliver(items,oid);
	String status1=payment.payment(sum,transactionId,AcNo);
	 
	return "products="+S1+"\n"+status1+"\n"+s2+
			"\nthanking you..."+"\nvisit again "+name[0];
}
}
