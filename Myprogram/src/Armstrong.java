import java.util.Scanner;
public class Armstrong {
	public int countDigits(int no)
	{ 
		int count=0;
		while(no>0){
			int rem=no%10;
			count++;
			no=no/10;
		}
        return count;	
}

public int findpower(int base,int power) {
	int ans=1;
	for(;power>0;power--)
	{
		ans=ans*base;
		
	}
return ans;
}

public  boolean isArmStrong(int no)
{
	int power=countDigits(no);
	int sum=0,tempnum=no;
	while(no>0)
	{
		int base=no%10;
		sum+=findpower(base,power);
		no=no/10;
		
	}
if(sum==tempnum)
	return true;

else

	return false;
	}
public int makeAddition(int val1,int val2)
		 {
	 int c=val1+val2;
	 return c;
	
		 }
     public void show()
     {
    	System.out.println("Enter no=");
    	int no=new Scanner(System.in).nextInt();
    	int i=1;
    	while(i<=10)
    	{
    		System.out.println("no*1");
    		i++;
    	}	
    	}
    	public static void main(String args[]) {
    		Scanner sc=new Scanner(System.in);
    		Armstrong obj=new Armstrong();
    		System.out.println("Enter base=");
    		int a=sc.nextInt();
    		boolean ans=obj.isArmStrong(a);
    		if(ans==true)
    		System.out.println(a +" is Armstrong");
    		else
    			System.out.println(a+" is Not Armstrong");
    		for(int i=150;i<=200;i++)
    		{
    			if (obj.isArmStrong(i)==true)
    				System.out.println(i+"is Armstrong");
    			else
    	System.out.println(i+"is not Armstrong ");
    		}
    		System.out.println("No.of digit are:"+obj.countDigits(a)); 			
    		System.out.println("Enter num2=");
    		int b=sc.nextInt();
    		int ans1=obj.makeAddition(a, b);
    		System.out.println("Addition is "+ans1);
    		System.out.println("Done");
    		sc.close();
    			
    	}		
   
}