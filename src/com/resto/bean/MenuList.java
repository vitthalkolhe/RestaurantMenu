package com.resto.bean;

public class MenuList {
	
	public static void getMenu()
	{
	Menu m=new Menu();
	
	int count=1;
	
	for(String s:m.getlistofmenus())
	{
		// Get and  Display all the Menu Items to the User
		System.out.println(count+": "+s);
		count++;
	}
	}
}
