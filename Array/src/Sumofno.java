import java.util.Scanner;

public class Sumofno {
      public int displaysum(int no)
      {
    	  if(no==0)
    		  return 0;
    	  else
    		  return no+displaysum(--no);
      }
      public static void main(String args[])
      {
    	  Sumofno s=new Sumofno();
    	  Scanner ss=new Scanner(System.in);
    	  System.out.println("Enter no=");
    	  int no=ss.nextInt();
    	  int ans=s.displaysum(no);
    	  System.out.println("Sum of natural no="+ans);
    	  
      }
}
