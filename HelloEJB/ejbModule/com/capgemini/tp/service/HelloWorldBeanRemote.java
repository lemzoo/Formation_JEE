package com.capgemini.tp.service;

import javax.ejb.Remote;

@Remote
public interface HelloWorldBeanRemote {
	public String sayHello();
}
