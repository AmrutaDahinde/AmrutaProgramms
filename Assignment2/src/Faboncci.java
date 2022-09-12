
public class Faboncci {
	public static void main(String args[]) {
		
	int n=20,firstterm=0,secondterm=1;
	System.out.println("Fibonacci series upto "+ n +":");
	while(firstterm<=n)
	{
	System.out.println(firstterm + " , ");
	int nextterm=firstterm+secondterm;
	firstterm=secondterm;
	secondterm=nextterm;
	}
}
}