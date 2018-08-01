package com.lib.controllers;

import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Remove {
	@RequestMapping(value="/getremove")
public String removeitem() {
	
try {
			
			Session session = new Configuration().configure().buildSessionFactory().openSession();
			session.createQuery("from BiryaniPojo where itemtype=biryanis");
			session.beginTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("enter proper way");
		}
	
	
	return null;
	
}
}
