package com.capgemini.tp.service;

import java.util.Collection;

import javax.ejb.Remote;

@Remote
public interface ShoppingCart {
	public void initialize();

    public void addItem(String item);

    public Collection<String> getItems();

    public void finished();
}
