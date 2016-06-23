package com.capgemini.tp.service;

import javax.ejb.Remote;

@Remote
public interface InterceptorsBeanRemote {
	public String sayHello();
}
