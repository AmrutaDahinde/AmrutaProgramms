import java.util.Scanner;
public class Krishnmurti {
	
	public int Krishn() {
		
		int no=153,temp=no,reminder,sum=0;
		while(temp>0)
		{
			reminder=temp%10;
			sum+=
					factorialOf(reminder);
			temp=temp/10;
		
		}
		return no;
		
	}
	public int factorialOf(int no) {
		int prod=1;
		while(no>0) {
			prod=prod*no;
			no--;
		}
		return prod;
		

	}
public static void main(String args[]) {
	Krishnmurti obj=new Krishnmurti();
	

	int no=obj.Krishn();
	int sum=obj.Krishn();
	if(sum==no) 
		System.out.println(no+"is krishnmurti no");
	else
		System.out.println(no+"is not krishnmurti no");
		
	}
}

