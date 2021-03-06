/**
 * 
 */
package com.capgemini.tp.client;

import java.util.Collection;

import javax.naming.Context;
import javax.naming.NamingException;

import com.capgemini.tp.implementation.ShoppingCartBean;
import com.capgemini.tp.service.ShoppingCart;
import com.capgemini.tp.util.ShoppingUtil;

/**
 * @author Lamine
 *
 */
public class ShoppingCartClient {
	public static void main(String[] args) {
		ShoppingCart shoppingCart = doLookup();
		// 4. Appel du service
		shoppingCart.addItem("Bread");
		shoppingCart.addItem("Milk");
		shoppingCart.addItem("Tea");
		System.out.println("Contents of your cart are:");
		Collection<String> items = shoppingCart.getItems();
		for (String item : items) {
			System.out.println(item);
		}
		System.out.println("\n");
		shoppingCart.finished();
	}

	private static ShoppingCart doLookup() {
		Context context = null;
		ShoppingCart bean = null;
		try {
			// 1. Obtenir le context
			context = ShoppingUtil.getInitialContext();
			// 2. Generate JNDI Lookup name
			String lookupName = getLookupName();
			// 3. Lookup and cast
			bean = (ShoppingCart) context.lookup(lookupName);

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
		String beanName = ShoppingCartBean.class.getSimpleName();

		// Nom complet de l'interface
		final String interfaceName = ShoppingCart.class.getName();

		// Create a look up string name
		String name = "ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + interfaceName
				+ "?stateful";

		System.out.println(name);

		return name;
	}
}
