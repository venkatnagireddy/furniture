package com.jap.furniture;
import java.util.*;

public class FurnitureDemo
    {
        public static void main(String[] args)
        {
            // Declare Objects for the furniture Bookshelf, Table and Sofa
            // Ensure that the super type refers to the sub classes
            // Display the details of each of them
        	Scanner scan=new Scanner(System.in);
        	Bookshelf bookshelf=new Bookshelf();
        	Sofa sofa=new Sofa();
        	Table table=new Table();
        	Furniture furniture=new Furniture();
        	System.out.println("Enter Furniture used for\n 1.Office\n 2.Home\n 3.Garden\n ");
        	int choice=scan.nextInt();
        	FurnitureType.FurnitureChoice(choice);
        	
        	System.out.println("Enter the Furniture :\n 1.BookShelf\n 2.Table\n 3.Sofa\n");
        	int bts=scan.nextInt();
        	if(bts==1) {
        		/*System.out.println("Enter Furniture used for\n 1.Office\n 2.Home\n 3.Garden\n ");
            	int choice=scan.nextInt();
            	bookshelf.FurnitureChoice(choice);*/
            	scan.nextLine();
        		System.out.println("Enter the colour of Furniture");
        	    bookshelf.setColour(scan.nextLine());
        	    //scan.nextLine();
        	    System.out.println("Enter the material of Furniture");
        	    bookshelf.setFurnitureType(scan.nextLine());
        	    System.out.println("Enter the price of Furniture");
        	    bookshelf.setPrice(scan.nextInt());
        	    System.out.println("Enter the No of SHelfs for Bookshelf");
        	    bookshelf.setNoOfShelfs(scan.nextInt());
        	    bookshelf.furnatureDetails();
        	    bookshelf.discountPercetage();
        	    bookshelf.calculateDiscountedPrice();
        	    bookshelf.actualAndDiscountedPrice();
        	    
        	}
        	else if(bts==2) {
        		/*System.out.println("Enter Furniture used for\n 1.Office\n 2.Home\n 3.Garden\n ");
            	int choice=scan.nextInt();
            	bookshelf.FurnitureChoice(choice);*/
            	scan.nextLine();
        		System.out.println("Enter the colour of Furniture");
        	    table.setColour(scan.nextLine());
        	    //scan.nextLine();
        	    System.out.println("Enter the material of Furniture");
        	    table.setFurnitureType(scan.nextLine());
        	    System.out.println("Enter the price of Furniture");
        	    table.setPrice(scan.nextInt());
        	    System.out.println("Enter the No of legs table have");
        	    table.setLegs(scan.nextInt());
        	    table.furnatureDetails();
        	    table.discountPercetage();
        	    table.calculateDiscountedPrice();
        	    table.actualAndDiscountedPrice();
        	    
        	}
        	else if(bts==3) {
        		/*System.out.println("Enter Furniture used for\n 1.Office\n 2.Home\n 3.Garden\n ");
            	int choice=scan.nextInt();
            	bookshelf.FurnitureChoice(choice);*/
            	scan.nextLine();
        		System.out.println("Enter the colour of Furniture");
        	    sofa.setColour(scan.nextLine());
        	    //scan.nextLine();
        	    System.out.println("Enter the material of Furniture");
        	    sofa.setFurnitureType(scan.nextLine());
        	    System.out.println("Enter the price of Furniture");
        	    sofa.setPrice(scan.nextInt());
        	    System.out.println("Enter the No of SHelfs for Bookshelf");
        	    sofa.setSeatingCapacity(scan.nextInt());
        	    sofa.furnatureDetails();
        	    sofa.discountPercetage();
        	    sofa.calculateDiscountedPrice();
        	    sofa.actualAndDiscountedPrice();
        	    
        	}
        	
        	
        	
        	
        }
    }