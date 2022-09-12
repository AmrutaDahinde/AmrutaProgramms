import java.util.Scanner;

public class Stringpalindrome {
public void check(String s1)
{      String rev="";
	 int length=s1.length();
	for(int i=length-1;i>=0;i--)
	rev=rev+s1.charAt(i);
	if(s1.equals(rev))
		System.out.println(s1+"is a palindrom");
	else
		System.out.println(s1+"is not palindrome");
}
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string=");
	String s1=sc.next();
	Stringpalindrome sp=new Stringpalindrome();
	sp.check(s1);
	
}
}
