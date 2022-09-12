import java.util.Scanner;
public class Sumofdigits{
public void sum(int no)
{
int sum=0,rem;
while(no>0) 
{
	
	rem=no%10;
	sum=sum+rem;
	no=no/10;
	System.out.println("Sum of digit="+sum);
}

}
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a no=");
	int no=s.nextInt();
	Sumofdigits sd=new Sumofdigits();
	sd.sum(no);
}
}
