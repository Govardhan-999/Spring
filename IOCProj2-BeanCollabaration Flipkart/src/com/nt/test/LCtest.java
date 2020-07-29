package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.Flipkart;

public class LCtest {
	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		factory=new XmlBeanFactory(res);
		Flipkart bean=factory.getBean("fpk",Flipkart.class);
		String msg=bean.purchase(new String[] {"sai"},
	      new long[] {9573500451l},new String[]{"Watch","specticals","iphone"},
	      new int[] {12000,1600,80000});
		System.out.println(msg);
		System.out.println("sai...");
		
	}

}
