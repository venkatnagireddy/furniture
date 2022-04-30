package com.jap.furniture;

class Sofa extends Furniture implements IFurniture
    {
        // Specify attributes for Sofa
       // define constructors, ensure the super keyword is used
	int seatingCapacity;
	
	public void actualAndDiscountedPrice() {
		System.out.println("Actual price is :"+getPrice());
		System.out.println("Final price is :"+(getPrice()-(getPrice()*getDiscountPrice())));
	}
	
	
	
	public void furnatureDetails() {
		super.DisplayFurnatureDetails();
		System.out.println("No of seating capacity :"+getSeatingCapacity());
		
	}
	public void discountPercetage() {
		System.out.println("Discount percentage :"+(getDiscountPrice()*100)+"%");
		
	}
	public void calculateDiscountedPrice() {
		Furniture furniture=new Furniture();
		int price=furniture.getPrice();
		System.out.println("Discounted price is :"+(price*getDiscountPrice()));
		
	}
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	

    }