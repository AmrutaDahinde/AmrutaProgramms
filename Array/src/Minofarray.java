import java.util.Scanner;

public class Minofarray {
      void findmin(int arr[],int size)
      {
    	int min=arr[0];
    	for(int i=0;i<size;i++)
    	if(arr[i]<min)
    		min=arr[i];
    	System.out.println("Minimum value in given array= "+min);
      }
      public static void main(String args[])
      {
    	  Minofarray m=new Minofarray();
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
    	m.findmin(arr, size);
    }
      }

