import java.util.Arrays;
import java.util.Scanner;

public class EmployeAray {
	 public static void main(String args[])
     {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the size=");
			int size=s.nextInt();
			Employe e[]=new Employe[size];
		      for(int i=0;i<size;i++)
		      {
		    	  System.out.println("Enter the empid,name,dept,sal=");
		          int empid=s.nextInt();
		          String name=s.next();
		          String dept=s.next();
		          int sal=s.nextInt();
		         e[i]=new Employe(empid,name,dept,sal);
		         
		       }
		      System.out.println(Arrays.toString(e));
		      for(Employe emp:e)
		      {
		    	  System.out.println(e);
		}
    }
}