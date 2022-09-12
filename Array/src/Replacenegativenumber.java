import java.util.Arrays;
import java.util.Scanner;

public class Replacenegativenumber {
   void Negativenumber(int arr[],int size)
   {
   int cnt=0;
   for(int i=0;i<size;i++)
   {
	   if(arr[i]<0)
	   {
		   cnt++;
	   }
   }
   System.out.println("Negative elements are="+cnt);
   }
   
void Replacenumber(int arr[],int size)
{    
	for(int i=0;i<size;i++) {
		if(arr[i]<0)
		{
			arr[i]=arr[i-1]*arr[i-1];
		}
	}
	System.out.println(Arrays.toString(arr));
	}
public static void main(String args[])
{
	Replacenegativenumber r=new Replacenegativenumber();
	int arr[]= {8,-10,54,-6,4,-3,7,2,-4};
	r.Negativenumber(arr, 9);
	r.Replacenumber(arr, 9);
	
		}
}

