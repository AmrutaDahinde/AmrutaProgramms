    import java.util.Scanner;
	public class Calculator {

	public static void main(String args[])
	{
	int menu,num1,num2,result;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter menu=");
	menu=sc.nextInt();
	System.out.println("Enter num1=");
	num1=sc.nextInt();
	System.out.println("Enter num2=");
	num2=sc.nextInt();

	switch(menu){
	   case 1:
	          result=num1+num2;
	          System.out.println("Addition of no.=" + result);
	          break;
	    case 2:result=num1-num2;
	           System.out.println("Substraction of no.=" + result);
	          break;
	    case 3:result=num1*num2;
	           System.out.println("Multiplication of no.=" + result);
	     case 4:result=num1/num2;
	           System.out.println("Division of no.=" + result);
	     default :
	           System.out.println("invalid");
	          break;
	     }
	     }
	}

