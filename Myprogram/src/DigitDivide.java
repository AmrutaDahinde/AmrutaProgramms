import java.util.Scanner;
public class DigitDivide {
	int no,rem;
public void divide()
{
	while(no>0)
	{
		rem=no%10;
		if(rem%3==0)
			System.out.println("digit divisible by 3="+rem);
		no=no/10;
	}
}
public static void main(String args[])
{
	DigitDivide d=new DigitDivide();
	d.divide();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter no=");
    int no=s.nextInt();
	
}
}
