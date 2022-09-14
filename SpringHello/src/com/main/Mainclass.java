package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;

public class Mainclass {

	public static void main(String[] args) {
		
		ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
		Student s1=(Student)a.getBean("s1");
		System.out.println("ID:" +s1.getId());
		System.out.println("FNAME:" +s1.getFname());
		System.out.println("LNAME:" +s1.getLname());
		System.out.println("EMAIL:" +s1.getEmail());
				
		
	}
}
