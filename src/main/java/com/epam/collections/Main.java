package com.epam.collections;

import java.util.*;
public class Main 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	MyCollection myCollection=new MyCollection();
    	System.out.println("Enter number of items to buy (n>10)");
    	int no =sc.nextInt();
    	System.out.println("Enter name and price of the item");
    	for(int i=0;i<no;i++) {
    		String name=sc.next();
    		double price =sc.nextDouble();
    		//Details details=new Details(name,sal);
    		Items item = new Items(name,price);
    		myCollection.add(item);
    	}
        
        char opt='y';
        while(opt=='y') {
        	System.out.println("Enter operation to be performed.\n1. Add 2. Remove 3. Fetch 4. Print");
        	int option=sc.nextInt();
        	switch(option) {
        	case 1:System.out.println("Enter name and price of item");
        			String name=sc.next();
        			double price=sc.nextDouble();
        			myCollection.add(new Items(name,price));
        			break;
        	case 2:System.out.println("Enter the index at which the object should be removed");
        			int n=sc.nextInt();
        			myCollection.delete(n);
        			break;
        	case 3:System.out.println("Enter the index at which details are to be fetched");
        			int n1=sc.nextInt();
        			Items fetched=myCollection.get(n1);
        			if(fetched!=null) System.out.println(myCollection.get(n1));
        			break;
        	case 4:myCollection.print();
        			break;
        	default:System.out.println("Enter valid option");
        			break;
        	}
        	System.out.println("Do you want to continue (y/n)");
        	opt=sc.next().charAt(0);
        }
        sc.close();
    }
}