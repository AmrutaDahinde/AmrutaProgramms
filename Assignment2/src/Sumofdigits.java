import java.util.Scanner;
public class Sumofdigits 
	{
	public static void main(String args[])
	{
	int no,cnt=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter digit=");
	no=sc.nextInt();
	while(no>0)
	{
	int rem=no%10;
	cnt++;
	no=no/10;
	}

	System.out.println("number of digits in given no.="+cnt);
	}
	}

