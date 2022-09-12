       package Second;

public class Car {
	   String model;
      public static	int totalcarSold;
      Car()
    {
	totalcarSold++;
    }
     Car(String m)
     {
    	 model=m;
     }
     public void  carsold(String m)
     {
    	 System.out.println("car model="+"Audi");
     }
   public  String  toString()
     {
    	 return "model="+model+"Totalcarsold="+totalcarSold;
     }
     public static void main(String args[])
     {
    	 Car c=new Car();
    	c.carsold("Audi");
    	System.out.println("Total car sold="+totalcarSold);
    	System.out.println(c);
     }
}
