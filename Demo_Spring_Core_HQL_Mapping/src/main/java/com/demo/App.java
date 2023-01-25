package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Department;
import com.demo.bean.Employee;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate_cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory);
        
        Employee e1 = new Employee();
        e1.setId(105);
        e1.setName("Saurav Sharma");
        e1.setSalary(600000);
       
        Department dept = new Department();
        dept.setDeptId(10001);
        dept.setDeptName("Software Developer");
        
        e1.setDepartment(dept);
        System.out.println(e1);
        
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(e1);
        session.getTransaction().commit();
        session.close();
    }
}
