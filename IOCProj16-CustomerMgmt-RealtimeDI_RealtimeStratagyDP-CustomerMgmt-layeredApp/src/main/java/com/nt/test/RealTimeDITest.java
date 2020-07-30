package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;

public class RealTimeDITest {

	public static void main(String[] args) {
		Scanner scn = null;
		CustomerVO vo = null;
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		MainController controller = null;
		String result = null;
		String name = null, cadd = null, pAmt = null, rate = null, time = null;
		// Read inputs
		scn = new Scanner(System.in);
		System.out.println("Enter Customer Name:");
		name = scn.next();
		System.out.println("Enter Customer Address:");
		cadd = scn.next();
		System.out.println("Enter Principle Amount:");
		pAmt = scn.next();
		System.out.println("Enter Rate of intrest:");
		rate = scn.next();
		System.out.println("Enter time :");
		time = scn.next();
		// store inputs vo class object
		vo = new CustomerVO();
		vo.setCname(name);
		vo.setCadd(cadd);
		vo.setpAmt(pAmt);
		vo.setRate(rate);
		vo.setTime(time);

		// create BeanFactory IOC container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		// get controller Bean Class object
		controller = factory.getBean("controller1", MainController.class);
		// invoke the method
		try {
			result = controller.processCustomer(vo);
			System.out.println(result);

		} catch (Exception e) {
			System.out.println("Internal problem:");
			e.printStackTrace();
		}

	}

}
