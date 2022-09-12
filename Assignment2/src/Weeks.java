
	import java.util.Scanner;
	public class Weeks
	{
	public static void main(String args[])
	{
	int dayno;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Day no.=");
	dayno=sc.nextInt();
	switch(dayno){
	   case 1:System.out.println("It is monday");
	          break;
	    case 2:System.out.println("It is tuseday");
	          break;
	    case 3:System.out.println("It is wednsday");
	          break;
	     case 4:System.out.println("It is Thursday");
	          break;
	     case 5:
	          System.out.println("It is fridyday");
	          break;
	     case 6:System.out.println("It is saturday");
	          break;
	     default:System.out.println("Invalid week day");
	      }
	}
	}