package com.resto.bean;

public class Menu {
	
	String MainCourse[];
	String Starter[];
	String Dessert[];
	String Beverages[];
	String listofmenus[]={"STARTER","MAINCOURSE","DESSERT","BEVERAGES","ASK FOR A BILL"};
	
	public Menu()
	{}
	
	//Menu constructor
	public Menu(String[] mainCourse, String[] starter, String[] dessert, String[] beverages) {
		super();
		this.MainCourse = mainCourse;
		this.Starter = starter;
		this.Dessert = dessert;
		this.Beverages = beverages;
		
	}
	public void getMainCourse() {
		//return MainCourse;
		for(String s:MainCourse)
		{
			System.out.println(s);
		}
	}
	public void getStarter() {
		//return Starter;

		for(String s:Starter)
		{
			System.out.println(s);
		}
	}
	
	public void getDessert() {
		//return Dessert;
		for(String s:Dessert)
		{
			System.out.println(s);
		}
	}
	
	public void getBeverages() {
		//return Dessert;
		for(String s:Beverages)
		{
			System.out.println(s);
		}
	}
	
	public String[] getlistofmenus() {
		
		return listofmenus;  // return all the Menu items
	}
	

}
