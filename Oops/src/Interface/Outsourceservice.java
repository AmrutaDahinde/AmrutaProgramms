package Interface;

import Inheritance.Food;

public class Outsourceservice {
public static void main(String args[]) {
	Service s=new Courier();
	
	Service.provideService("Daily letter exchange");
	
	Food f= new Catering("good");
   f.order();
   f.order("pizza", 5);
	Service.provideService("Annapurna");
	
}
}
