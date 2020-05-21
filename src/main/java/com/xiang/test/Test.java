package com.xiang.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiang.fz.bean.Person;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        Person person = (Person) context.getBean("person7");
        System.out.println(person);

	}

}
