package com.resto.bean;

public class Prices {
	
	public String salad;
	public String Soup;
	public String Papad;
	public String roti;
	public String sabji;
	public String daal;
	public String rice;
	public String icecream;
	public String anand;
	
	
	 public int returnValue(String a)
	{
		
	//System.out.println("value of a in prices: "+a);
		 
	
	
	if(a.equalsIgnoreCase("salad"))
		return 150;
	else if(a.equalsIgnoreCase("Soup"))
		return 100;
	else if(a.equalsIgnoreCase("Papad"))
		return 50;
	else if(a.equalsIgnoreCase("roti"))
		return 10;
	else if(a.equalsIgnoreCase("sabji"))
		return 200;
	else if(a.equalsIgnoreCase("daal"))
		return 150;
	else if(a.equalsIgnoreCase("rice"))
		return 100;
	else if(a.equalsIgnoreCase("icecream"))
		return 100;
	else
		return 0;
		
	}
	
}
