package com.capgemini.tp.implementation;

import javax.ejb.Stateless;

import com.capgemini.tp.service.HelloWorldBeanRemote;

/**
 * Session Bean implementation class HelloWorldBean
 */
@Stateless
public class HelloWorldBean implements HelloWorldBeanRemote {

	public String sayHello() {
		System.out.println("Hello ! ");
		return "Bonjour ... !";
	}

}