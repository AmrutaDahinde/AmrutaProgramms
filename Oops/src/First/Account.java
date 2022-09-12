    package First;
     import java.util.Scanner;
    public class Account {
     int accno;
     String name,type;
     float bal,amt;
      Scanner sc=new Scanner(System.in);
       public void accopen()
       {
    	  
       }
       public void accdetails()
       {
    	  
       }
      public void deposite()
     {
     }
      public void withdrow()
      {
       if(amt>=1000) {
    	   System.out.println("Enter amt=");
       }
    	   else
    	   {
    		   System.out.println("Not allowed");
    	   }
       
   	   bal=bal-amt;
   	   System.out.println("Current Balance="+bal);
      }
}
