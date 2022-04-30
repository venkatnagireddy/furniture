package com.jap.furniture;

public class Table extends Furniture implements IFurniture{
    // specify attributes for Table
    // define constructors, ensure the super keyword is used
	int legs;
	
	
	public void actualAndDiscountedPrice() {
		System.out.println("Actual price is :"+getPrice());
		System.out.println("Final price is :"+(getPrice()-(getPrice()*getDiscountPrice())));
	}
	
	
	
	public void furnatureDetails() {
		super.DisplayFurnatureDetails();
		System.out.println("No of legs table have is :"+getLegs());
		
	}
	public void discountPercetage() {
		System.out.println("Discount percentage :"+(getDiscountPrice()*100)+"%");
		
	}
	public void calculateDiscountedPrice() {
		Furniture furniture=new Furniture();
		int price=furniture.getPrice();
		System.out.println("Discounted price is :"+(price*getDiscountPrice()));
		
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	
	
}
