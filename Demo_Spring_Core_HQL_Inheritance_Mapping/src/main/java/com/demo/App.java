package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.demo.bean.Adress;
import com.demo.bean.Department;
import com.demo.bean.Employee;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate_cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();

		Employee e1 = new Employee();
		e1.setId(101);
		e1.setName("Saurav Sharma");
		e1.setSalary(600000);

		Department d1 = new Department();
		d1.setDeptId(1001);
		d1.setDeptName("Software Developer");

		Adress ad1 = new Adress();
		ad1.setAdsId(10002);
		ad1.setStreet("Langarpur");
		ad1.setCity("Barh");
		ad1.setState("Bihar");
		ad1.setCountry("India");
		ad1.setZip(803213);

		Session session = factory.openSession();
		session.beginTransaction();
		session.persist(e1);
		session.persist(d1);
		session.evict(ad1);
		session.getTransaction().commit();
		session.close();
		System.out.println("Sucess");
	}
}
