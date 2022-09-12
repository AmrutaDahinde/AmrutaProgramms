package First;
import java.util.Scanner;
public class Bank {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("BANK OF INDIA");
	Account acc=new Account();
	acc.accopen();
	{
	System.out.println("Enter Account No.=");
	int accno=sc.nextInt();
	System.out.println("Enter Account Name.=");
	String accname=sc.next();
	System.out.println("Enter Account Balance.=");
	float bal=sc.nextFloat();
	}
      acc.accdetails();
      {
    	  System.out.println("Account No"+acc.accno+"is owned by"+acc.name);
   	   System.out.println("Current Balance is Rs="+acc.bal);
      }
      
      acc.deposite();
      {
      System.out.println("Enter amount you want to deposite=");
      float amt=sc.nextFloat();
      }
      acc.withdrow();
      {
      System.out.println("Enter amount you want to withdrow");
      float amt=sc.nextFloat();
}
}
}