import java.util.Scanner;
class Ascii
{
public static void main(String args[])
{
char ch='A';

Scanner sc=new Scanner(System.in);
System.out.println("Enter character=");
ch=sc.nextLine().charAt(0);
System.out.println(ch);
}
}
