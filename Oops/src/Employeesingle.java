

public class Employeesingle {

  
   	 float salary=40000;
        void salary()
        {
       	 System.out.println("Salary is done");
        }
}
    class Programmer extends Employeesingle
    {
   	 int bonus=10000;
   	 
   	 public static void main(String args[])
   	 {
   		 Programmer p=new Programmer();
   		 p.salary();
   		 System.out.println("Bonus of progrmmer="+p.bonus);
   	 }
    }


