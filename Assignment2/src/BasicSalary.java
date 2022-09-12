    import java.util.Scanner;
	public class BasicSalary
	{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter salary=");
	float sal=sc.nextFloat();
	float gs,da,hra;
	da=25*sal/100;
	hra=35*sal/100;
	gs=sal+da+hra;
	if(gs>100000)
	{
	System.out.println("Vp of company");
	}
	else if(gs>80000)
	{
	System.out.println("Avp of company");
	}
	else if(gs>60000)
	{
	System.out.println("Manager of company");
	}
	else if(gs>40000)
	{
	System.out.println("Assistance of company");
	}
	else
	System.out.println("Officer of company");
	}
	}


