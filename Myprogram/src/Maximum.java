import java.util.Scanner;
public class Maximum {
public static void main(String args[])
{
 int x=67;
	int y=656;
	if(x>y)
	{
		System.out.println("Max is"+x);
	}
	else {
		System.out.println("Max is"+y);
		String msg= x>y? "Max is:"+x : "Max is:"+y;
				System.out.println(msg);
	}
}
}
