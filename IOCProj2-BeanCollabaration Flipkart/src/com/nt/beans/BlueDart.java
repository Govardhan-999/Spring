package com.nt.beans;

import java.util.Arrays;

public class BlueDart implements Courier {

	@Override
	public String deliver(String items[],int orderid) {
		return "BlueDart deliverd your products="+Arrays.toString(items)
		+"\nyour order id is "+orderid;
	}

}
