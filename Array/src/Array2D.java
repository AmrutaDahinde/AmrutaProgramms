import java.util.Scanner;

public class Array2D {
      public static void main(String args[]) {
    	  //int arr[][]= {{1,2},{4,5},{7,8}};
    	  int r=3,c=3;
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter the array elements:");
    	  int arr[][]=new int[r][c];
    	  
    	  for(int i=0;i<r;i++)
    	  {
    		  for(int j=0;j<c;j++)
    		  {
    			  arr[i][j]=sc.nextInt();
    		  }
    	  }
    	  int sum=0;
    	  for(int i=0;i<r;i++)
    	  {
    		  for(int j=0;j<c;j++)
    		  {
    			  sum=sum+arr[i][j];
    		  }
    	  }
    		  System.out.println("Sum of element is="+sum);
    	  
    	  System.out.println("Array elements are=");
    	  for(int i=0;i<r;i++)
    	  {
    		  for(int j=0;j<c;j++)
    		  {
    			  if(i==j)
    				  
    			  System.out.println(arr[i][j]+"");
    			  else
    		  System.out.println();
    	  }
    	  }
      }
}
