             package Inheritance;

             public class SingleEmployee {
            	 float salary=40000;
                 void salary()
                 {
                	 System.out.println("Salary is done");
                 }
}
             class Programmer extends SingleEmployee
             {
            	 int bonus=10000;
            	 
            	 public static void main(String args[])
            	 {
            		 Programmer p=new Programmer();
            		 p.salary();
            		 System.out.println("Bonus of progrmmer="+p.bonus);
            	 }
             }
