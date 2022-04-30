package com.jap.furniture;

public enum FurnitureType {
    OFFICE, HOME, GARDEN;
	
	//int choice=FurnitureType.values();
	
 public static void FurnitureChoice(int choice) {
		
		//String Choice=choice.toUpperCase();
		Furniture furniture=new Furniture();
		//FurnitureType t1=FurnitureType.OFFICE;
		switch(choice) {
		case 1 :   //"OFFICE" :
			
			furniture.setDiscountPrice(0.1f);
			//System.out.println("hi");
			break;
		case 2:  //"HOME" :
			//Furniture furniture=new Furniture();
			furniture.setDiscountPrice(0.05f);
			break;
		case 3:  //"GARDEN" :
			//Furniture furniture=new Furniture();
			furniture.setDiscountPrice(0.025f);
			break;
		default:
			System.out.println("Enter correct type");
		}
	}
	
 
	
}
