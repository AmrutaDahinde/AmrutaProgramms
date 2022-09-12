import java.util.Scanner;

public class Arrayprograms {
	void sum(int arr[]) {
		int sum=0;
		for (int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		System.out.println("Sum of arr elements="+sum);
	}
	void reversePrint(int arr[],int size)
	{
		System.out.println("Reverse array is:");
		for(int i=size-1;i>=0;i--)
	System.out.println(arr[i]+"");
	}
 void displayArray(int arr[],int size)
 {
	 for(int i=0;i<size;i++)
	 {
	System.out.println(arr[i]); 
 }
 for(int a:arr)
 {
	 System.out.println(a+"");
 }
}
 public static void main(String args[]) {
	 Arrayprograms a=new Arrayprograms();
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
	a.sum(arr);
	a.reversePrint(arr, len);
	a.displayArray(arr, len);
}
}
 