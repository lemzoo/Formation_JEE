package com.capgemini.tp.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class Auditor {
	
	@AroundInvoke
	public Object methodStats(InvocationContext invctx) throws Exception {
		String name = invctx.getMethod().getName();
		long startTime = System.nanoTime();
		System.out.println("Starting method Auditors : " + name);
		try {
			return invctx.proceed();
		} finally {
			long elapsedTime = System.nanoTime() - startTime;
			System.out.println("Finished method Auditors class: " + name + " Method took " + elapsedTime + " nanoseconds to execute");
		}
	}

}
