import java.util.Scanner;

public class Sumofdigit {
	int no,sum=0,rem;
public void sum() {
	
	while(no>0)
	{
		no=rem%10;
		sum=sum+no;
		rem=rem/10;
		System.out.println("Sum of digits="+sum);
}
}
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter no=");
   int no=s.nextInt();
	Sumofdigit d=new Sumofdigit();
	d.sum();
	
	
}
}
