
public class Maxofarray {
     void findmax(int arr[],int size)
     {
    	 int max=arr[0];
    	 for(int i=0;i<size;i++)
    	 
    		 if(arr[i]>max)
           max=arr[i];
    		
     System.out.println("Maximum value in given elements are="+max);
     }
     public static void main(String args[]) {
    	 int arr[]= {10,24,65,75,44,33,22};
    	 Maxofarray m=new Maxofarray();
    	
    	 m.findmax(arr, 7);
     }
}
