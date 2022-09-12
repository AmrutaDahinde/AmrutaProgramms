import java.util.Scanner;

public class ArrayOverriding {
	 public void makeArray(String arr[])
	    {
	    	for(int i=0;i<arr.length;i++)
	    	{
	    		System.out.println(arr[i]+"");
	    	}
	    }
	  public static void main(String args[]) {
	    	ArrayOverriding a=new ArrayOverriding();
	    	Scanner s=new Scanner(System.in);
	    	System.out.println("Enter array length=");
	    	int len=s.nextInt();
	    	 String[] arr=new String[len];
	        System.out.println(arr.length);
	    	System.out.println("Enter array elements=");
	    	for(int i=0;i<arr.length;i++)
	    	{
	    		
	    		
	    		arr[i]=s.next();
	    	}
	    	a.makeArray(arr);
	    }
	}

