package com.jap.furniture;

public class Bookshelf extends Furniture implements IFurniture
{
    // specify attributes for BookShelf
    // define constructors, ensure the super keyword is used
	int noOfShelfs;
	//Actual price and final price
	Furniture furniture=new Furniture();
	public void actualAndDiscountedPrice() {
		System.out.println("Actual price is :"+getPrice());
		System.out.println("Final price is :"+(getPrice()-(getPrice()*getDiscountPrice())));
	}
	
	public void furnatureDetails() {
		super.DisplayFurnatureDetails();
		System.out.println("No of Shelfs of Bookshelf :"+getNoOfShelfs());
		
	}
	public void discountPercetage() {
		System.out.println("Discount percentage :"+(getDiscountPrice()*100)+"%");
		
	}
	public void calculateDiscountedPrice() {
		//Furniture furniture=new Furniture();
		int price=furniture.getPrice();
		System.out.println("Discounted price is :"+(price*getDiscountPrice()));
		
	}
   /* public void FurnitureChoice(int choice) {
		
		//String Choice=choice.toUpperCase();
		Bookshelf book=new Bookshelf();
		//FurnitureType t1=FurnitureType.OFFICE;
		switch(choice) {
		case 1 :   //"OFFICE" :
			
			book.setDiscountPrice(0.1f);
			break;
		case 2:  //"HOME" :
			//Furniture furniture=new Furniture();
			book.setDiscountPrice(0.05f);
			break;
		case 3:  //"GARDEN" :
			//Furniture furniture=new Furniture();
			book.setDiscountPrice(0.025f);
			break;
		default:
			System.out.println("Enter correct type");
		}
}*/
	
	public int getNoOfShelfs() {
		return noOfShelfs;
	}
	public void setNoOfShelfs(int noOfShelfs) {
		this.noOfShelfs = noOfShelfs;
	}
	
	

}