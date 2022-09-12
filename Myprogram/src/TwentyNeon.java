import java.util.Scanner;
public class TwentyNeon {
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
		return sum;
		
		}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.=");
		int no=sc.nextInt();
		Neon obj=new Neon();
		for(int i=1;i<=20;i++)
		{
			if(obj.neon(no)==1)
			{
		int a=obj.neon(no);
		System.out.println("It is neon no");
			}
			else
			{
				System.out.println("It is  not neon no");
			}
	}
	}
}


