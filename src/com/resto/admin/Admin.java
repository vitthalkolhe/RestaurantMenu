package com.resto.admin;

import com.resto.bean.Menu;

/*
 * Admin class is used to define the food menu items which will be offered to customer
 * 
 * */
public class Admin {

	// Main course Menu items
	public static String MainCourse[] = { "Roti", "Sabji", "Daal", "Rice", "Salad", "--Back menu--" };
	// Starter Menu items
	public static String Starter[] = { "Papad", "Soup", "--Back menu--" };
	// Dessert Menu items
	public static String Dessert[] = { "iceCream", "--Back menu--" };
	// Beverages Menu items
	public static String Beverages[] = { "Pepsi", "Water", "IceTea", "Coffee", "--Back menu--" };

	public Admin() {
		// Initialize the Menu object
		Menu m = new Menu(MainCourse, Starter, Dessert, Beverages);
	}

}
