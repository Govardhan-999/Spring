 package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.PlayerVO;

public class RealTimeDITest1 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader r=null;
		MainController c=null;
		String result=null;
		 Scanner scn=null;
		 PlayerVO vo=null;
		 String name=null,country=null,pInnings=null,pRunsScored=null
			, pRunsConceded=null,pnoOfNotOuts=null,pwktsTaken=null;
		 scn=new Scanner(System.in);
		 System.out.println("Enter Player Name::");
		 name=scn.nextLine();
		 System.out.println("Enter  Country::");
		 country=scn.nextLine();
		 System.out.println("Enter Player Innings::");
		 pInnings=scn.nextLine();
		 System.out.println("Enter Player RunsScored::");
		 pRunsScored=scn.nextLine();
		 System.out.println("Enter Player  RunsConceded::");
		 pRunsConceded=scn.nextLine();
		 System.out.println("Enter Player No of not outs::");
		 pnoOfNotOuts=scn.nextLine();
		 System.out.println("Enter Player  wickets taken::");
		 pwktsTaken=scn.nextLine();
		 //vo
		 vo=new PlayerVO();
		 vo.setpName(name);
		 vo.setpCountry(country);
		 vo.setpInnings(pInnings);
		 vo.setpRunsScored(pRunsScored);
		 vo.setpRunsConceded(pRunsConceded);
		 vo.setPnoOfNotOuts(pnoOfNotOuts);
		 vo.setPwktsTaken(pwktsTaken);
		 //
		 factory=new DefaultListableBeanFactory();
		 r=new XmlBeanDefinitionReader(factory);
		 r.loadBeanDefinitions( "applicationContext.xml");
		 //
		 c=factory.getBean("controller",MainController.class);
		 try {
			 result=c. processPlayer(vo);
			 System.out.println(result);
		 }
		 catch(Exception e)
		 {
			System.out.println("internal problem");
			 e.printStackTrace(); 
			 }
		 }
	}

