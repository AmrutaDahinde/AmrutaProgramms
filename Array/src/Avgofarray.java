import java.util.Scanner;

public class Avgofarray {
      void findavg(int arr[],int size)
      {
    	  int total =0;
    	 for(int i=0;i<size;i++)
    	 {
    	  total=total+arr[i]; 
    	 }
      double average=total/arr.length;
      System.out.println("The average is="+average);
}
      public static void main(String args[])
      {
    	  Avgofarray a=new Avgofarray();
    	  Scanner ss=new Scanner(System.in);
      	System.out.println("Enter array size=");
      	int size=ss.nextInt();
      	int arr[]=new int[size];
      	System.out.println(arr.length);
      	System.out.println("Enter array elements=");
      	for(int i=0;i<arr.length;i++)
      	{
      		arr[i]=ss.nextInt();
    	}
    	a.findavg(arr, size);
      }
 }