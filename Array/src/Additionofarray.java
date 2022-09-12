import java.util.Scanner;

public class Additionofarray {
   void add(int arr[],int size, int totalexp)
   {
	   for(int i=0;i<arr.length;i++)
	   {
	   totalexp=totalexp+arr[i];
	     
   }
   }
   public static void main(String args[])
   {
	  
	    	Additionnofarray  a=new ArrayHanling();
	    	Scanner s=new Scanner(System.in);
	    	int arr[]={3,4,5,6,7};
	    	
	    	System.out.println("Enter array length=");
	    	int len=s.nextInt();
	    	arr=new int[len];
	    	System.out.println(arr.length);
	    	System.out.println("Enter array elements=");
	    	for(int i=0;i<arr.length;i++)
	    	{
	    		
	    		arr[i]=s.nextInt();
	    	}
	    	a.makeArray(arr);
   }
}

