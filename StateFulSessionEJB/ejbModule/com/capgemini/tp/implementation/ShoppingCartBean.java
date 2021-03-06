package com.capgemini.tp.implementation;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.ejb.Remove;
import javax.ejb.Stateful;

import com.capgemini.tp.service.ShoppingCart;

/**
 * Session Bean implementation class HelloWorldBean
 */
@Stateful
public class ShoppingCartBean implements ShoppingCart {

	private ArrayList<String> items;

	@PostConstruct
	public void initialize() {
		items = new ArrayList<String>();
	}

	public void addItem(String item) {
		items.add(item);
	}

	public Collection<String> getItems() {
		return items;
	}

	@Remove
	public void finished() {
		System.out.println("Remove method finished() Invoked");
	}
}