import java.util.Scanner;

public class Reversearray {
       void  reverse(int arr[]) {
    	  
    	   for(int i=arr.length-1;i>=0;i--)
    	   {
    		 System.out.println(arr[i]+"");
    		 
    	   }
       }
       public static void main(String args[]) {
       	Reversearray r=new Reversearray();
       	Scanner s=new Scanner(System.in);
       	
       	
       	System.out.println("Enter array length=");
       	int len=s.nextInt();
       int	arr[]=new int[len];
       	System.out.println(arr.length);
       	System.out.println("Enter array elements=");
       	for(int i=0;i<arr.length;i++)
       	{
       		
       		arr[i]=s.nextInt();
       	}
       	r.reverse(arr);
}
}