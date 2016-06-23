/**
 * 
 */
package com.capgemini.tp.client;

import javax.naming.Context;
import javax.naming.NamingException;

import com.capgemini.tp.implementation.HelloWorldBean;
import com.capgemini.tp.service.HelloWorldBeanRemote;
import com.capgemini.tp.util.ClientUtil;

/**
 * @author Lamine
 *
 */
public class EJBJavaClient {
	public static void main(String[] args) {
		System.out.println("Point d'entrée de l'application client");
		HelloWorldBeanRemote bean = doLookup();
	    System.out.println(bean.sayHello()); // 4. Appel du service
	}

	private static HelloWorldBeanRemote doLookup() {
		Context context = null;
		HelloWorldBeanRemote bean = null;
		try {
			// 1. Obtenir le context
			context = ClientUtil.getInitialContext();
			
			// 2. Generate JNDI Lookup name
			String lookupName = getLookupName();
			
			// 3. Lookup and cast
			bean = (HelloWorldBeanRemote) context.lookup(lookupName);

		} catch (NamingException e) {
			e.printStackTrace();
		}
		return bean;
	}

	private static String getLookupName() {
		// nom ear
		String appName = "";

		//nom du jar ejb (nom du projet dans eclipse par défaut)
		String moduleName = "HelloEJB";

		//nom optionnel JBoss7
		String distinctName = "";

		// Nom de la classe implementant le EJB
		String beanName = HelloWorldBean.class.getSimpleName();

		// Nom complet de l'interface
	     final String interfaceName = HelloWorldBeanRemote.class.getName();

		// Create a look up string name
		String name = "ejb:" + appName + "/" + moduleName + "/" 
                       + distinctName + "/" + beanName + "!" + interfaceName;

		return name;
	}

}
