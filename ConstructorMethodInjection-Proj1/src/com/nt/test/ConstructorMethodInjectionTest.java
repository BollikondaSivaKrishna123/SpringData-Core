package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class ConstructorMethodInjectionTest {

	public static void main(String[] args) {
		//Hold Spring Cfgs File
		FileSystemResource fis=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//Create Container Object
		XmlBeanFactory xmlFactory=new XmlBeanFactory(fis);
		WishMessageGenerator wishMessageGenerator=(WishMessageGenerator)xmlFactory.getBean("wmg");
		System.out.println(wishMessageGenerator.WishMessageGeneratorMethod("Rahul"));
		
	}//end of main

}//end of class
