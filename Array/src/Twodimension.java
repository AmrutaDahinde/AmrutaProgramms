import java.util.Arrays;

public class Twodimension {

	    public static void main(String args[]) {
	    	
	    	 int b[][]= {
					  {4,5,6},
					  {7,8,9},
					  {8,9,10}
			  };
	    	 System.out.println("Length of Array b"+b.length);
	    	 System.out.println("Complete length of Array b"+Arrays.toString(b));
	    	 for(int i=0;i<b.length;i++)
	    	 {
	    		 for(int j=0;j<b[i].length;j++) 
	    		 {
	    			 
	    	 System.out.print(b[i][j]+  "  ");
	              }
	    		 System.out.println();
	    	 }
	   
	    //	 System.out.println(Arrays.toString(b[0])+"with length"+b[i].length);
}
}
