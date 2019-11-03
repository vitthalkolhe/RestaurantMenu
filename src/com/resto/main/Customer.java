package com.resto.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import com.resto.admin.Admin;
import com.resto.bean.MenuList;
import com.resto.bean.Prices;
/*
 * Customer class is used to display all the available Menu's to the customer and accept the input based on customer preferences
 * It also calculate the total food bill based on Menu ordered
 * 
 * */
public class Customer {
	static HashMap<String, Integer> hm;

	/*
	 * Variable Description
	 * 
	 * Admin adm - Used to define Menu category
	 * "Starter, MainCourse,Dessert, Beverages" with below sub category 1) Starter
	 * -> "Papad","Soup","--Back menu--" 2) Main course ->
	 * "Roti","Sabji","Daal","Rice","Salad","--Back menu--" 3) Dessert ->
	 * "iceCream","--Back menu--" 4) Beverages ->
	 * "Pepsi","Water","IceTea","Coffee","--Back menu--"
	 * 
	 * Prices prices -> Used to initialize menu items with respective price.
	 * 
	 * 
	 * int foodChoice - Used to get and compare the user input in Main Switch case
	 * Boolean ordering - Used to control the main Do While loop
	 * 
	 * String starterChoice - Used to get the choice of starter from user String
	 * mainCourseChoice - Used to get the choice of Main Course from user String
	 * desertChoice - Used to get the choice of dessert from user String
	 * beveragesChoice - Used to get the choice of beverages from user
	 *
	 * String starterQuantity - Used to get the quantity of starter from user String
	 * mainCourseQuantity - Used to get the quantity of Main Course from user String
	 * dessertQuantity - Used to get the quantity of dessert from user String
	 * beveragesQuantity - Used to get the quantity of beverages from user
	 * 
	 * float finall - Used to calculate the total food bill excluding 5% tax float
	 * tax - Used to calculate the 5% tax on finall food bill float billToBePaid -
	 * Total Bill to be paid including the tax
	 * 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("-----------------------WELCOME TO JACOB's KITCHEN------------------------");
		Prices prices = new Prices();
		Admin adm = new Admin();

		hm = new HashMap<String, Integer>();

		boolean ordering = true;
		System.out.println("Please select a menu from list");
		do {
			// Get the list of Menu's
			MenuList.getMenu();

			// Get a user input for Menu item selection
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String foodChoice = reader.readLine();
			int foodChoice_Int = Integer.parseInt(foodChoice);
			// System.out.println(name);

			switch (foodChoice_Int) {
			// Case specific to Starter Menu items
			case 1:
				int startcount = 1;
				for (String aamhi : adm.Starter) {
					// Disply all the items from the Starter
					System.out.println(startcount + ": " + aamhi + " " + prices.returnValue(aamhi));
					startcount++;
				}

				String starterQuantity = "0";
				String starterChoice = reader.readLine();
				if (starterChoice.equals("1") || starterChoice.equals("2")) {
					System.out.println("Enter quantity");
					starterQuantity = reader.readLine();
					hm.put(adm.Starter[Integer.parseInt(starterChoice) - 1], Integer.parseInt(starterQuantity));
				}

				int starterQuantity_Int = Integer.parseInt(starterQuantity);
				int starterChoice_Int = Integer.parseInt(starterChoice);
				boolean orderingstart = true;
				;
				do {
					switch (starterChoice_Int) {
					case 1:
						System.out.println("you've ordered: " + adm.Starter[starterChoice_Int - 1] + " with quantity: "
								+ starterQuantity_Int);
						orderingstart = false;
						break;

					case 2:
						System.out.println("you've ordered " + adm.Starter[starterChoice_Int - 1] + " with quantity: "
								+ starterQuantity_Int);
						orderingstart = false;
						break;

					default:
						System.out.println("Wrong selection please select again");
						orderingstart = false;
						break;
					}
				} while (orderingstart);

				break;
			// Case specific to Main course Menu items
			case 2:

				int startcount1 = 1;
				for (String mainCourse : adm.MainCourse) {
					// Display all the items from Main Course
					System.out.println(startcount1 + ": " + mainCourse + " " + prices.returnValue(mainCourse));
					startcount1++;
				}

				String mainCourseQuantity = "0";
				String mainCourseChoice = reader.readLine();
				// System.out.println("y is"+y1);
				if (mainCourseChoice.equals("1") || mainCourseChoice.equals("2") || mainCourseChoice.equals("3")
						|| mainCourseChoice.equals("4") || mainCourseChoice.equals("5")) {
					System.out.println("Enter quantity");
					mainCourseQuantity = reader.readLine();
					hm.put(adm.MainCourse[Integer.parseInt(mainCourseChoice) - 1],
							Integer.parseInt(mainCourseQuantity));
				}

				int mainCourseQuantity_Int = Integer.parseInt(mainCourseQuantity);
				int mainCourseChoice_Int = Integer.parseInt(mainCourseChoice);
				boolean orderingstart1 = true;
				;
				do {
					switch (mainCourseChoice_Int) {
					case 1:
						System.out.println("you've ordered: " + adm.MainCourse[mainCourseChoice_Int - 1]
								+ " with quantity: " + mainCourseQuantity_Int);
						orderingstart1 = false;
						break;

					case 2:
						System.out.println("you've ordered " + adm.MainCourse[mainCourseChoice_Int - 1]
								+ " with quantity: " + mainCourseQuantity_Int);
						orderingstart1 = false;
						break;

					case 3:
						System.out.println("you've ordered " + adm.MainCourse[mainCourseChoice_Int - 1]
								+ " with quantity: " + mainCourseQuantity_Int);
						orderingstart1 = false;
						break;

					case 4:
						System.out.println("you've ordered " + adm.MainCourse[mainCourseChoice_Int - 1]
								+ " with quantity: " + mainCourseQuantity_Int);
						orderingstart1 = false;
						break;

					case 5:
						System.out.println("you've ordered " + adm.MainCourse[mainCourseChoice_Int - 1]
								+ " with quantity: " + mainCourseQuantity_Int);
						orderingstart1 = false;
						break;

					case 6:
						orderingstart1 = false;
						break;

					// In case of wrong selection
					default:
						System.out.println("Wrong selection please select again");
						orderingstart1 = false;
						break;
					}
				} while (orderingstart1);

				break;
			// Case specific to Desert Menu items
			case 3:

				int startcount11 = 1;
				for (String dessert : adm.Dessert) {
					// Display all the items from desert
					System.out.println(startcount11 + ": " + dessert + " " + prices.returnValue(dessert));
					startcount11++;
				}

				String desertQuantity = "0";
				String desertChoice = reader.readLine();
				if (desertChoice.equals("1")) {
					System.out.println("Enter quantity");
					desertQuantity = reader.readLine();
					hm.put(adm.Dessert[Integer.parseInt(desertChoice) - 1], Integer.parseInt(desertQuantity));
				}

				int desertQuantity_Int = Integer.parseInt(desertQuantity);
				int desertChoice_Int = Integer.parseInt(desertChoice);
				boolean orderingstart11 = true;
				;
				do {
					switch (desertChoice_Int) {
					case 1:
						System.out.println("you've ordered: " + adm.Dessert[desertChoice_Int - 1] + " with quantity: "
								+ desertQuantity_Int);
						orderingstart11 = false;
						break;

					case 2:
						orderingstart11 = false;
						break;

					default:
						System.out.println("Wrong selection please select again");
						orderingstart11 = false;
						break;
					}
				} while (orderingstart11);

				break;

			// Case specific to Beverages Menu items
			case 4:
				int startcount4 = 1;
				for (String beverage : adm.Beverages) {
					// Display all the items from Beverages
					System.out.println(startcount4 + ": " + beverage + " " + prices.returnValue(beverage));
					startcount4++;
				}

				String beveragesQuantity = "0";
				String beveragesChoice = reader.readLine();
				if (beveragesChoice.equals("1") || beveragesChoice.equals("2") || beveragesChoice.equals("3")
						|| beveragesChoice.equals("4")) {
					System.out.println("Enter quantity");
					beveragesQuantity = reader.readLine();
					hm.put(adm.Beverages[Integer.parseInt(beveragesChoice) - 1], Integer.parseInt(beveragesQuantity));
				}

				int beveragesQuantity_Int = Integer.parseInt(beveragesQuantity);
				int beveragesChoice_Int = Integer.parseInt(beveragesChoice);

				boolean orderingBeverages = true;
				;
				do {
					switch (beveragesChoice_Int) {
					case 1:
						System.out.println("you've ordered: " + adm.Beverages[beveragesChoice_Int - 1]
								+ " with quantity: " + beveragesQuantity_Int);
						orderingBeverages = false;
						break;

					case 2:
						System.out.println("you've ordered " + adm.Beverages[beveragesChoice_Int - 1]
								+ " with quantity: " + beveragesQuantity_Int);
						orderingBeverages = false;
						break;
					case 3:
						System.out.println("you've ordered " + adm.Beverages[beveragesChoice_Int - 1]
								+ " with quantity: " + beveragesQuantity_Int);
						orderingBeverages = false;
						break;
					case 4:
						System.out.println("you've ordered " + adm.Beverages[beveragesChoice_Int - 1]
								+ " with quantity: " + beveragesQuantity_Int);
						orderingBeverages = false;
						break;

					default:
						System.out.println("Wrong selection please select again");
						orderingBeverages = false;
						break;
					}
				} while (orderingBeverages);

				break;

			// Ask for the final bill
			case 5:
				int total = 0;
				int qnt = 0;
				float finall = 0;
				float tax = 0;
				float billToBePaid = 0;

				// Calculate the total bill amount excluding tax
				for (Map.Entry<String, Integer> entry : hm.entrySet()) {
					total = total + prices.returnValue(entry.getKey());
					qnt = entry.getValue();
					System.out.println(
							"Menu: " + entry.getKey() + ", Quantity = " + entry.getValue() + ", total " + total * qnt);
					finall = finall + (total * qnt);
					total = 0;
				}

				// Calculate the tax which is 5% of total food bill
				tax = (finall * 5) / 100;

				// Final bill amount including tax
				billToBePaid = tax + finall;
				System.out.println("Total bill Amount excluding tax is ------:: " + finall);
				System.out.println("Tax to be added (5%)------:: " + tax);
				System.out.println("Final bill amount is ------:: " + billToBePaid);

				ordering = false;
				break;

			// Wrong selection
			default:
				System.out.println("Wrong selection please select again");
				break;
			}
		} while (ordering);

	}

}