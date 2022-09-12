         package Inheritance;

        public class SingleAnimal {
         void eat()
         {
        	 System.out.println("eating...");
      
         }
         
         }
         
         class Dog extends SingleAnimal {
        	 void bark()
        	 {
        		 System.out.println("barking...");
        	 }
         }
         
class Test{
	public  static void main(String args[])
	{
		Dog d=new Dog();
		d.bark();
		d.eat();
		
	}
}
