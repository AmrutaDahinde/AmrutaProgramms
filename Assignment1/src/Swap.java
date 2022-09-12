import java.util.Scanner;
public class Swap {
	public static void main(String args[]) {
	int p,q,temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of p and q");
	p=sc.nextInt();
	q=sc.nextInt();
	System.out.println("Before swapping numbers="+p+" "+q);
	temp=p;
	p=q;
	q=temp;
	System.out.println("After swapping="+p+" "+q);
	System.out.println();
	}
	}