import java.util.Scanner;
public class Switch {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int dayno;
	
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
		     default:System.out.println("Invalid");     
	
		}
		
	}
}
