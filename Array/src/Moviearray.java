import java.util.Arrays;
import java.util.Scanner;

public class Moviearray {
            public static void main(String args[])
            {
            	Scanner s=new Scanner(System.in);
    			System.out.println("Enter the size=");
    			int size=s.nextInt();
    			Movie e[]=new Movie[size];
    		      for(int i=0;i<size;i++)
    		      {
    		    	  System.out.println("Enter the movid,movname,releasesate,boxofficecollection,producer=");
    		          int movid=s.nextInt();
    		          String movname=s.next();
    		          int releaseyear=s.nextInt();
    		          int boxofficecollection=s.nextInt();
    		          String producer=s.next();
    		          e[i]=new Movie(movid,movname,releaseyear,boxofficecollection,producer);
    		       }
            
		      //System.out.println(Arrays.toString(e));
		      for(Movie mov:e)
		      {
		    	  if(mov.boxofficecollection>500000 && mov.producer.equalsIgnoreCase("John")) {
		    	  System.out.println("Boxofficecollection="+mov.boxofficecollection +"Producer name="+mov.producer);
		}
      }

      }        
}
