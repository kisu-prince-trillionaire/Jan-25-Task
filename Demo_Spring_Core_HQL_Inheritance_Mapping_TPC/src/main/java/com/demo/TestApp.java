package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Employee;

public class TestApp {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate_cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Employee employee = session.get(Employee.class, 101);
		System.out.println(employee);
		Employee employee1 = session.load(Employee.class, 102);
		System.out.println(employee1);
		
		session.close();
		factory.close();
	}

}
