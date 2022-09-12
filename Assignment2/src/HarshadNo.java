import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class HarshadNo {
public int Harsh(int no) {
	int rem=0,sum=0;
	
	while(no>0)
	{
		rem=no%10;
		sum=sum+rem;
		no=no/10;
	}
	return sum;
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no=");
	int a=sc.nextInt();
	HarshadNo obj=new HarshadNo();
	int no=obj.Harsh(a);
	int sum=obj.Harsh(no);
	if(no%sum==0)
	System.out.println(no+"is HarshadNo");
	else
		System.out.println(no+"is not Harshad no");
}
}
