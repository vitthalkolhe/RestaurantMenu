package com.resto.bean;

/*
 * Price class is used to initialize food items with respective prices
 * */
public class Prices {

	// Initialize all the Menu items with prices
	public int returnValue(String a) {

		if (a.equalsIgnoreCase("salad")) // salad 150 rs
			return 150;
		else if (a.equalsIgnoreCase("Soup")) // soup 100 rs
			return 100;
		else if (a.equalsIgnoreCase("Papad")) // Papad 50 rs
			return 50;
		else if (a.equalsIgnoreCase("roti")) // roti 10 rs
			return 10;
		else if (a.equalsIgnoreCase("sabji")) // Sabji 200 rs
			return 200;
		else if (a.equalsIgnoreCase("daal")) // Daal 150 rs
			return 150;
		else if (a.equalsIgnoreCase("rice")) // Rice 100 rs
			return 100;
		else if (a.equalsIgnoreCase("icecream")) // icecream 100 Rs
			return 100;
		else if (a.equalsIgnoreCase("Pepsi")) // Pepsi 50 Rs
			return 50;
		else if (a.equalsIgnoreCase("Water")) // Water 20 Rs
			return 20;
		else if (a.equalsIgnoreCase("IceTea")) // IceTea 50 Rs
			return 50;
		else if (a.equalsIgnoreCase("Coffee")) // Coffee 40 rs
			return 40;
		else
			return 0; // else 0 Rs

	}

}
