package com.resto.bean;
/*
 * MenuList class id used to return list of available Menu's
 * 
 * */

public class MenuList {

	public static void getMenu() {
		Menu m = new Menu();

		int count = 1;

		// Get and Display all the Menu Items to the User
		for (String s : m.getlistofmenus()) {
			System.out.println(count + ": " + s);
			count++;
		}
	}
}
