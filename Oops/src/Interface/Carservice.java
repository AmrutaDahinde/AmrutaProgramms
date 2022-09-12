              package Interface;

               public class Carservice implements Wash,Clean {
               public static void main(String args[]) {
            	   Wash w =new Carservice();
            	   Clean.dopolishing();
               }

			public void dowashing()
			{
				System.out.println("It is ready for washing");
				
			}

			
			public void dowashing(String s) {
				System.out.println("It is ready");
					
			}
			
}
