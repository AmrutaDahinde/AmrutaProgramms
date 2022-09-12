import java.util.Scanner;
public class SimpleIntrest {
public static void main(String args[]) {
	float p,t,r,si;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter p,t & r");
	p=sc.nextFloat();
	t=sc.nextFloat();
	r=sc.nextFloat();
	si=p*t*r/100;
	System.out.println("Simple intrest="+si);
}
}
