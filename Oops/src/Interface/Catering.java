package Interface;

import Inheritance.Food;

public abstract class Catering extends Food implements Service{
public Catering(String qlt) {
		super(qlt);
		System.out.println("Qulity is good");
}

public void provideservice(String details)
{
	System.out.println("we are serve delicious food"+details);
	
}
}
