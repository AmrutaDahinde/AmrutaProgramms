import java.util.Scanner;

public class Arrayfunctions {
    public void display(int arr[][])
 
        {
        	for(int r=0;r<arr.length;r++)
        	{
        		for(int c=0;c<arr[r].length;c++) {
        			if(arr[r][c]<1)
        			{
        				arr[r][c]*=-1;
        			}
        		}
        		System.out.println(arr+"");
        	}
        }
        public static void main(String args[]) {
        	Arrayfunctions a=new Arrayfunctions();
        	Scanner s=new Scanner(System.in);
        	int len=s.nextInt();
	    	 String[] arr=new String[len];
	        System.out.println(arr.length);
	    	System.out.println("Enter array elements=");
	    	for(int i=0;i<arr.length;i++)
	    	{
	    		
	    		arr[i]=s.next();
	    	}
	    	a.display(null);
        }
       
}
	    
	
     