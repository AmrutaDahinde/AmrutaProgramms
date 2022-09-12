import java.util.Scanner;

public class SquareArray {
	  public void array(int b[][]) {
		  
		   for(int i=0;i<b.length;i++)
	  	 {
	  		 for(int j=0;j<b[i].length;j++) 
	  		 {
	  			 int sqr=b[i][j]*b[i][j];
	  		 
	  	 System.out.print(b[i][j]*b[i][j]+"");
	  	 }  
	  		 System.out.println();
	  	 }
	   }
	  

	public static void main(String args[])
	{
		JaggedArray ja=new JaggedArray();
		 int b[][]=new int[3][4];
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("Enter array elements=");
		   for(int i=0;i<b.length;i++)
		   {
			   for(int j=0;j<b[i].length;j++)
			   {
				   b[i][j]=sc.nextInt();
			   }
		   }
		   ja.array(b);
}
}