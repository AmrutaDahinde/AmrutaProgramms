         package Second;

         class SingleAnimal {
         void eat()
         {
        	 System.out.println("eating...");
      
         }
         
         }
         
         class Dog1 extends SingleAnimal {
        	 void bark()
        	 {
        		 System.out.println("barking...");
        	 }
         }
         
class Test{
	public  static void main(String args[])
	{
		Dog1 d=new Dog1();
		d.bark();
		d.eat();
		
	}
}
