package com.aaron.spring.springcore.shoppingcart;

import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Item> items;

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ShoppingCart [items=" + items + "]";
	}

}
