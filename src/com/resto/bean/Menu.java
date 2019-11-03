package com.resto.bean;

/*
 * Menu Class contains the list of available Menus
 * 
 * */

public class Menu {

	String MainCourse[];
	String Starter[];
	String Dessert[];
	String Beverages[];
	String listofmenus[] = { "STARTER", "MAINCOURSE", "DESSERT", "BEVERAGES", "ASK FOR A BILL" };

	public Menu() {
	}

	// Menu constructor
	public Menu(String[] mainCourse, String[] starter, String[] dessert, String[] beverages) {
		super();
		this.MainCourse = mainCourse;
		this.Starter = starter;
		this.Dessert = dessert;
		this.Beverages = beverages;

	}

	public void getMainCourse() {
		// print MainCourse;
		for (String s : MainCourse) {
			System.out.println(s);
		}
	}

	public void getStarter() {
		// print Starter;

		for (String s : Starter) {
			System.out.println(s);
		}
	}

	public void getDessert() {
		// print Dessert;
		for (String s : Dessert) {
			System.out.println(s);
		}
	}

	public void getBeverages() {
		// print Beverages;
		for (String s : Beverages) {
			System.out.println(s);
		}
	}

	public String[] getlistofmenus() {

		return listofmenus; // return all the Menu items
	}

}
