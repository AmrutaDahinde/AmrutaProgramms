import java.util.Scanner;
public class IncresingNo 
{ 
	boolean increase(int no) {
	boolean flag=true;
	int r1=no%10;
	no=no/10;
	while(no>0)
	{
		int r2=no%10;
	if(r1<r2)
	{
		flag=false;
		break;
	}
r1=r2;
no=no/10;
}
	return true;
}
	public static void main(String args[]) {
		IncresingNo obj=new IncresingNo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no=");
	 int no=sc.nextInt();
}
}