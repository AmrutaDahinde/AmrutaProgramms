import java.util.Scanner; 
public class ArithmaticOper {
public static void main(String args[]) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no1=");
	int no1=sc.nextInt();
	System.out.println("Enter no2=");
	int no2=sc.nextInt();
	int sum=no1+no2;
	int sub=no1-no2;
	int product=no1*no2;
	int division=no1/no2;

	System.out.println("Sum="+sum);

	System.out.println("Sub="+sub);

	System.out.println("product="+product);
	System.out.println("division="+division);
}
}
