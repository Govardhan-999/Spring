package com.nt.beans;

import java.util.Arrays;

public class DTDC implements Courier {

	@Override
	public String deliver(String items[],int orderid) {
		return "DTDC deliverd your products"+Arrays.toString(items)+
				"\nyour orderd is "+orderid;
	}

}
