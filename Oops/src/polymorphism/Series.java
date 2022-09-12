package polymorphism;
import java.util.Scanner;
public class Series {
	
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int n,i,pr=0;
			System.out.println("Enter the range of number(limit)=");
			n=sc.nextInt();
			for(i=1;i<=n;i++)
			{
				pr=(pr*2)+1;
				System.out.println(pr+"");
			}
			sc.close();
	}

}
