package com.jap.furniture;

public class Furniture
    {
        // declare color, price, discounted price and furniture type as variables
        // use appropriate access specifiers
	private static String colour;
	private static  int price;
	private static float discountPrice;
	private static String furnitureType;
	
	
public void DisplayFurnatureDetails() {
	System.out.println("Colour of Furniture :"+getColour());
	System.out.println("Price of Furniture :"+getPrice());
	//System.out.println("Discount Price of Furniture :"+(getDiscountPrice()*100));
	System.out.println("Material Type of Furniture :"+getFurnitureType());
	
	
}


public String getColour() {
	return colour;
}


public void setColour(String colour) {
	this.colour = colour;
}


public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}


public float getDiscountPrice() {
	return discountPrice;
}


public void setDiscountPrice(float discountPrice) {
	this.discountPrice = discountPrice;
}


public String getFurnitureType() {
	return furnitureType;
}


public void setFurnitureType(String furnitureType) {
	this.furnitureType = furnitureType;
}



	

	



    }