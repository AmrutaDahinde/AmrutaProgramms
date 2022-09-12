import java.util.Scanner;
public class PrimeFifty {
	public int prime(int no) {
	int no1=5;
	int flag=1;
	int i=2;
	while(i<=no1/2)

	{
	
	if(no%i==0)
	{
	flag=0;
	break;
	}
	i++;
	}
	if(flag==1)
	{
		System.out.println("prime no.");
	
	}
	else
	{
		System.out.println("Not prime no.");
	}
	return i;
	
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.=");
		int no1=sc.nextInt();
		
	   PrimeFifty obj=new PrimeFifty();
	  for(no1=1;no1<=100;no1++)
	   {
		 if(obj.prime(no1)==1)  {
			 System.out.println("It is prime");
		 }
		 else {
			 System.out.println("Not prime");
		 }
	   }
	  
	}
	}
	

