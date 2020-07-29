package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import com.nt.beans.WishMessageGenerator;
public class SetterInjectionTest {
	public static void main(String[]args)
	{
		Resource res=null;
		BeanFactory factory=null;
		Object obj=null;
		WishMessageGenerator generator=null;
		res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
	factory=new XmlBeanFactory(res);
	obj=factory.getBean("wish");
	generator=(WishMessageGenerator)obj;
	System.out.println("Message::"+generator.generatorWishMsg("Gopi"));
    System.out.println("Gopi");
	
	
	}
	

}
