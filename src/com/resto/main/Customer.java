package com.resto.main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import com.resto.admin.Admin;
import com.resto.bean.Menu;
import com.resto.bean.MenuList;
import com.resto.bean.Prices;

public class Customer {
	static HashMap<String,Integer> hm;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("welcome");
		Admin a=new Admin(); //loading menus set by admin
		Prices p=new Prices();
		Menu m=new Menu();
		Admin adm=new Admin();
		
		hm=new HashMap<String,Integer>();
		
		 boolean ordering = true;
		System.out.println("Please select menu");
		int count=1;
do{
		MenuList.getMenu();
		
		  BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		  String name = reader.readLine();
		  int inte=Integer.parseInt(name);	
	        //System.out.println(name); 
	        
	        switch (inte) { 
	        case 1: 
	        	 int startcount=1;
	        	for(String aamhi:adm.Starter)
	        	{
	        		System.out.println(startcount+": "+aamhi+" "+p.returnValue(aamhi));
	        	startcount++;
	        	}
	        	
	        	String z;
	        							String y = reader.readLine();
	        							//System.out.println("y is"+y);
	        							if(y.equals("1")||y.equals("2"))
	        							{
	        							System.out.println("Enter quantity");
	        							 z = reader.readLine();
	        							 hm.put(adm.Starter[Integer.parseInt(y)-1], Integer.parseInt(z));
	        							}
	        							else 
	        							{
	        								z="4";
	        							}
	        							int zz=Integer.parseInt(z);
	        							int yy=Integer.parseInt(y);
	        							//star=new HashMap<String,Integer>();
	        							
	        							//System.out.println("Donee23"+adm.Starter[yy-1]);
	        							//System.out.println("Donee32"+zz);
	        							
	        							//hm.put("L&TT", 110);
	        						/*	for (Map.Entry<String,Integer> entry : hm.entrySet()) 
	        				        	 {
	        				        		 System.out.println("YOO");
	        				                 System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue()); 
	        				        	 }*/
							        	boolean orderingstart=true;;
										do{
							        	switch(yy){
							        	  // If y == 2 
							            case 1: 
							               System.out.println("you've ordered: "+adm.Starter[yy-1]+" with quantity: "+zz);
							               orderingstart=false;
							                break; 
							      
							            // If y == 3 
							            case 2: 
							            	System.out.println("you've ordered "+adm.Starter[yy-1]+" with quantity: "+zz);
							            	 orderingstart=false;
							                break;
							                
							            case 3: 
							            	//System.out.println("you've ordered "+adm.Starter[yy-1]);
							            	System.out.println("Wrong selection please select again");
							            	 orderingstart=false;
							                break;
							       
							            default: 
								        	 System.out.println("Wrong selection please select again");
								        	 orderingstart=false;
								            break; 
							        	}}while(orderingstart);
							        		
	        	
	        	
	            break; 
	        case 2: 
	       
	        	 int startcount1=1;
		        	for(String saare:adm.MainCourse)
		        	{
		        		System.out.println(startcount1+": "+saare+" "+p.returnValue(saare));
		        	startcount1++;
		        	}
	        	
	        	String z1;
				String y1 = reader.readLine();
				//System.out.println("y is"+y1);
				if(y1.equals("1")||y1.equals("2")|| y1.equals("3")||y1.equals("4")||y1.equals("5"))
				{
				System.out.println("Enter quantity");
				 z1 = reader.readLine();
				 hm.put(adm.MainCourse[Integer.parseInt(y1)-1], Integer.parseInt(z1));
				}
				else 
				{
					z1="4";
				}
				int zz1=Integer.parseInt(z1);
				int yy1=Integer.parseInt(y1);
									        	boolean orderingstart1=true;;
												do{
									        	switch(yy1){
									        	  // If y == 2 
									            case 1: 
									               System.out.println("you've ordered: "+adm.MainCourse[yy1-1]+" with quantity: "+zz1);
									               orderingstart1=false;
									                break; 
									      
									            // If y == 3 
									            case 2: 
									            	System.out.println("you've ordered "+adm.MainCourse[yy1-1]+" with quantity: "+zz1);
									            	 orderingstart1=false;
									                break;
									                
									            case 3: 
									            	//System.out.println("you've ordered "+adm.Starter[yy-1]);
									            	System.out.println("you've ordered "+adm.MainCourse[yy1-1]+" with quantity: "+zz1);
									            	 orderingstart1=false;
									                break;
									                
									            case 4: 
									            	//System.out.println("you've ordered "+adm.Starter[yy-1]);
									            	System.out.println("you've ordered "+adm.MainCourse[yy1-1]+" with quantity: "+zz1);
									            	 orderingstart1=false;
									                break;   
									                
									            case 5: 
									            	//System.out.println("you've ordered "+adm.Starter[yy-1]);
									            	System.out.println("you've ordered "+adm.MainCourse[yy1-1]+" with quantity: "+zz1);
									            	 orderingstart1=false;
									                break;     
									                
									            case 6: 
									            	//System.out.println("you've ordered "+adm.Starter[yy-1]);
									            	//System.out.println("you've ordered "+adm.MainCourse[yy1-1]+" with quantity: "+zz1);
									            	 orderingstart1=false;
									                break;     
									         
									       
									            default: 
										        	 System.out.println("Wrong selection please select again");
										        	 orderingstart1=false;
										            break; 
									        	}}while(orderingstart1);
	        					
	            break; 
	        case 3: 
	        	
	        	 int startcount11=1;
		        	for(String khavaiyye:adm.Dessert)
		        	{
		        		System.out.println(startcount11+": "+khavaiyye+" "+p.returnValue(khavaiyye));
		        	startcount11++;
		        	}
	        	
								        	String z11;
											String y11 = reader.readLine();
											//System.out.println("y is"+y11);
											if(y11.equals("1"))
											{
											System.out.println("Enter quantity");
											 z11 = reader.readLine();
											 hm.put(adm.Dessert[Integer.parseInt(y11)-1], Integer.parseInt(z11));
											}
											else 
											{
												z11="4";
											}
											int zz11=Integer.parseInt(z11);
											int yy11=Integer.parseInt(y11);
								        	boolean orderingstart11=true;;
											do{
								        	switch(yy11){
								        	  // If y == 2 
								            case 1: 
								               System.out.println("you've ordered: "+adm.Dessert[yy11-1]+" with quantity: "+zz11);
								               orderingstart11=false;
								                break; 
								      
								            // If y == 3 
								            
								                
								            case 2: 
								            	//System.out.println("you've ordered "+adm.Starter[yy-1]);
								            	//System.out.println("you've ordered "+adm.MainCourse[yy1-1]+" with quantity: "+zz1);
								            	 orderingstart11=false;
								                break;     
								         
								       
								            default: 
									        	 System.out.println("Wrong selection please select again");
									        	 orderingstart11=false;
									            break; 
								        	}}while(orderingstart11);
	        	
	            break; 
	        case 4: 
	        	//System.out.println("hoiiiiiiiiiiiii");
	        	//hm.forEach((key,value)-> System.out.print(key,value));
	        	//hm.put("shreyas", 10);
	        	//hm.put("sdff", 10);
	        	//System.out.println("hmm");
	        	
	    //   Integer[] arr=new Integer[hm.size()];
	       int total=0;
	       int qnt=0;
	       int finall=0;
	       			
	       			
	        	
	        	 for (Map.Entry<String,Integer> entry : hm.entrySet()) 
	        	 {
	        		 //System.out.println("YOO");
	        		 total=total+p.returnValue(entry.getKey());
	        		 qnt=entry.getValue();
	        		// System.out.println("VALUEEEEEEEEEE          "+p.returnValue(entry.getKey()));
	                 System.out.println("Menu: " + entry.getKey() +", Quantity = " + entry.getValue()+", total "+total*qnt); 
	                 finall=finall+(total*qnt);
	                 total=0;
	        	 }
	        	 
	        	 System.out.println("FINAL bill Amount is ------:: "+finall);
	        	
	        	 ordering = false;
	            break; 
	            
	        default: 
	        	 System.out.println("Wrong selection please select again");
	        	 MenuList.getMenu();
	            break; 
	        }   
}while (ordering);


	
	   
	}
	

}