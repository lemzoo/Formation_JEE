/**
 * 
 */
package com.capgemini.tp.client;

import javax.naming.Context;
import javax.naming.NamingException;

import com.capgemini.tp.implementation.SessionLifeBean;
import com.capgemini.tp.service.SessionLife;
import com.capgemini.tp.util.SessionUtil;

/**
 * @author ib
 *
 */
public class LifeCycleClient {
	public static void main(String[] args) {
		SessionLife bean = doLookup();
		System.out.println(bean.affiche("Hello")); // 4. Appel du service
	}

	private static SessionLife doLookup() {
		Context context = null;
		SessionLife bean = null;
		try {
			// 1. Obtenir le context
			context = SessionUtil.getInitialContext();
			// 2. Generate JNDI Lookup name
			String lookupName = getLookupName();
			// 3. Lookup and cast
			bean = (SessionLife) context.lookup(lookupName);

		} catch (NamingException e) {
			e.printStackTrace();
		}
		return bean;
	}

	private static String getLookupName() {
		// nom ear
		String appName = "";

		// nom du jar ejb
		String moduleName = "HelloEJB";

		// nom optionnel JBoss7
		String distinctName = "";

		// Nom de la classe implementant le EJB
		String beanName = SessionLifeBean.class.getSimpleName();

		// Nom complet de l'interface
		final String interfaceName = SessionLife.class.getName();

		// Create a look up string name
		String name = "ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + interfaceName;

		return name;
	}

}
