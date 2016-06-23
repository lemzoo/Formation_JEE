package com.capgemini.tp.util;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class InterceptorsUtil {

	private static Context initialContext; 
	private static final String PKG_INTERFACES = "org.jboss.ejb.client.naming";
	
	public static Context getInitialContext() throws NamingException {
		if(initialContext == null){
			Properties properties = new Properties();
			
			//Ce mapping est spécifique au serveur Wildfly
			//Recuperation du contexte de JBoss en utilisant le fichier jboss-ejb-client.properties
			//et on utilise PKG_INTERFACES pour indiquer qu'on utilise "org.jboss.ejb.client.naming"
			properties.put(Context.URL_PKG_PREFIXES, PKG_INTERFACES);
			initialContext = new InitialContext(properties);
		}
		return initialContext;
	}
}