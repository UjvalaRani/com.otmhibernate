package com.kodnest.com.otmhibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory);
        
        
        
        Skills sk1 = new Skills();
        Skills sk2 = new Skills();
        Skills sk3 = new Skills();
        Skills sk4 = new Skills();
        Skills sk5 = new Skills();
        
        List<Skills> list1 =new ArrayList<Skills>();
        list1.add(sk1);
        list1.add(sk2);
        
        List<Skills> list2 =new ArrayList<Skills>();
        list2.add(sk3);
        list2.add(sk4);
        

        Student st1= new Student(11,"ujvala",list1);
        Student st2= new Student(12,"ujvala rani",list2);
        
        sk1.setSkill_id(111);
        sk1.setSkill_name("java");
        sk1.setSt(st1);
        
        sk2.setSkill_id(222);
        sk2.setSkill_name("Python");
        sk2.setSt(st1);
        
        sk3.setSkill_id(333);
        sk3.setSkill_name("sql");
        sk3.setSt(st2);
        
        sk4.setSkill_id(444);
        sk4.setSkill_name("web");
        sk4.setSt(st2);
        
        
        
        Session ss = factory.openSession();
        Transaction tran = ss.beginTransaction();
        ss.save(st1);
        ss.save(st2);
        ss.save(sk1);
        ss.save(sk2);
        ss.save(sk3);
        ss.save(sk4);
        tran.commit();
    }
}