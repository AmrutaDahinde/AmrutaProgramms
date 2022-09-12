import java.util.Scanner;
public class Digits {
public int makeAdditio(int val1,int val2) {
	     int c=val1+val2;
	     return c;
}
public int countDigits(){
	{
		int no,cnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter =");
		no=sc.nextInt();
		while(no>0)
		{
		int rem=no%10;
		cnt++;
		no=no/10;
		}
		System.out.println("number of digits in given no="+cnt);
	}
	return 0;
    }
     public void sumofdigit() {
	int no,digit,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter =");
	no=sc.nextInt();
	while(no>0)
	{
	int rem=no%10;
	sum=sum+rem;
	
	no=no/10;
	}
	System.out.println("sum of digits in given no="+sum);
  }

      public int Minidigit(int no) {
	
			
			int min=no%10;
			while(no>0)
			{
			
			if((no%10)<min)
		         min=(no%10);
			
			no=no/10;
			}
		         return min;
      }
		

public int maxdigit(int no) {
	
	
	int max=no%10;
	while(no>0)
	{
	
	if((no%10)>max)
         max=(no%10);
	
	no=no/10;
	}
         return max;
}



public static void main(String args[])
{   
	Digits obj=new Digits();
	
	
	obj.countDigits();
	obj.sumofdigit();
	obj.Minidigit(0);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter digit =");
	int no=sc.nextInt();
	int ans=obj.Minidigit(no);
	System.out.println("Enter digit="+obj.Minidigit( no));
	
	obj.maxdigit(0);
    int ans1=obj.maxdigit(no);
	System.out.println("Enter digit="+obj.maxdigit(no));
	
}
}