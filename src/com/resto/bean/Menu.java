package com.resto.bean;

public class Menu {
	
	String MainCourse[];
	String Starter[];
	String Dessert[];
	String listofmenus[]={"Starter","MainCourse","Dessert","exit, Ask for Bill"};
	
	public Menu()
	{}
	
	public Menu(String[] mainCourse, String[] starter, String[] dessert) {
		super();
		this.MainCourse = mainCourse;
		this.Starter = starter;
		this.Dessert = dessert;
		
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
	
	public String[] getlistofmenus() {
		return listofmenus;
	}
	

}
