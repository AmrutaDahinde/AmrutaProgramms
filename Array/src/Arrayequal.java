import java.util.Scanner;

public class Arrayequal {
        void checkeqal(int a1[],int a2[])
        {
        	int cnt;
        	if(a1.length==a2.length)
        	{
        		for(int i=0;i<a1.length;i++)
        			{
        			if(a1[i]==a2[i])
        			  {
        				cnt++;
        			}
        			else {
        				System.out.println("elements are different");
        				break;
        			}
        			}
        			if(cnt==a1.length)
        			{
                      System.out.println("elements are equal");
        		
        			}
        	}
        	
        		public static void main(String args[]) {
        			Arrayequal a=new Arrayequal(); 
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
        		    	a.checkeqal(a1, a2);
        		    }
        		      }
}

