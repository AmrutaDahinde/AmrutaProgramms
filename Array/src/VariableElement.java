
      public class VariableElement {
    	  void add(String s,int ...a) 
          {
       	   int sum=0;
       	   for(int i=0;i<a.length;i++)
       	   {
       		   sum=sum+a[i];
       	   }
       	   System.out.println("Addition is:"+sum);
          }
           void add(String s,float b,int ...a) 
           {
        	   int sum=0;
        	   for(int i=0;i<a.length;i++)
        	   {
        		   sum=sum+a[i];
        	   }
        	   System.out.println("Addition is:"+sum);
           }
           static void add(int...a)
           {
        	   int sum=0;
        	   for(int i=0;i<a.length;i++)
        	   {
        		   sum=sum+a[i];
        	   }
        	   System.out.println("Addition is="+sum);
           }
           public static void main(String args[])
           {
        	   int arr[]= {1,2,3,4,5,6};
        	   add(arr);
        	   add(10,20,30);
           }
}
