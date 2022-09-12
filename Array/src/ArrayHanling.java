import java.util.Scanner;

public class ArrayHanling {
    public void makeArray(int arr[])
    {
    	for(int i=0;i<arr.length;i++)
    	{
    		System.out.println(arr[i]+"");
    	}
    }
    public static void main(String args[]) {
    	ArrayHanling a=new ArrayHanling();
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
