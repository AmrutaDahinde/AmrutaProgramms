import java.util.Scanner;

public class Sumofarray {
public void sum(int arr[]) {
	int sum=0;
	for (int i=0;i<arr.length;i++){
		sum=sum+arr[i];
	}
	System.out.println("Sum of all elements of array="+sum);
}
public static void main(String args[]) {
	Sumofarray a=new Sumofarray();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter array lenth=");
	int len=s.nextInt();
	 int[] arr=new int[len];
    System.out.println(arr.length);
	System.out.println("Enter array elements=");
	for(int i=0;i<arr.length;i++)
	{
		
		arr[i]=s.nextInt();
	}
	a.sum(arr);
}
}