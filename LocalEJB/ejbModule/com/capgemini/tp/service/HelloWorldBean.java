package com.capgemini.tp.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloWorldBean
 */
@Stateless
@LocalBean
public class HelloWorldBean {

	public String print() {
		return "Hello World  from ma Session Bean qui implémente la classe HelloWorldBean ....";
	}
}
