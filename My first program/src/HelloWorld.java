import java.util.Scanner;
public class HelloWorld
{
public static void main(String args[])
{
int num1;
float num2;
float answer;
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the num1= ");
num1=scanner.nextInt();
System.out.println("Enter the num2=");
num2=scanner.nextInt();
answer=num1+num2;
System.out.println("sum of nummbers="+answer);
scanner.close();
}
}
