package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class RealTimeDITest {

	public static void main(String[] args) {
		MainController controller=null;
		Scanner sc = null;
		String result=null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		EmployeeVO vo = null;
		String eName = null;
		String eAdd = null;
		String eBasicSalary =null;
		sc = new Scanner(System.in);
		System.out.println("Enter Employee  Name:");
		eName = sc.nextLine();
		System.out.println("Enter Employee  Address:");
		eAdd = sc.nextLine();
		System.out.println("Enter Employee  BasicSalary:");
		eBasicSalary = sc.nextLine();
		vo= new EmployeeVO();
		vo.seteName(eName);
		vo.seteAdd(eAdd);
		vo.seteBasicSalary(eBasicSalary);
		// create BeanFactory IOC container
				factory = new DefaultListableBeanFactory();
				reader = new XmlBeanDefinitionReader(factory);
				reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
				// get controller Bean Class object
				controller = factory.getBean("controller1", MainController.class);
				// invoke the method
				try {
					 
					result = controller.processResult(vo);
					 
					System.out.println(result);

				} catch (Exception e) {
					System.out.println("Internal problem:");
					e.printStackTrace();
				}

			}

		}