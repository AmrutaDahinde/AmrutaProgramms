import java.util.Scanner;
public class Neon {
public int neon(int no) {
	int rem,sq;
	int sum=0;
	sq=no*no;
	while(sq!=0)
	{
		rem=sq%10;
		sum=sum+rem;
		sq=sq/10;
		
	}
	if(no==sum)
	{
		System.out.println("It is neon no.="+no);
	}
		else
		{
			System.out.println("It is not neon no.="+no);
		}
		return sum;
	}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no.=");
	int no=sc.nextInt();
	Neon obj=new Neon();
	int a=obj.neon(no);
	System.out.println(a);
}
}
