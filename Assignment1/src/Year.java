import java.util.Scanner;
public class Year {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter Days=");
	int n=sc.nextInt();
	if(n>=365)
	{
	System.out.println((n/365)+"year::");
	
	int weeks=(n-365)/7;
	System.out.println(weeks+"weeks::");
	int days=(n-365)%7;
	System.out.println(days+"days::");
}
}
}