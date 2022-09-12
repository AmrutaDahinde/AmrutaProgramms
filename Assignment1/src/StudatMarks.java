import java.util.Scanner;
public class StudatMarks {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float Math,sci,phy,bio,chem,total,per,mathoutof,scioutof,phyoutof,biooutof,chemoutof,outoftotal;
		
		System.out.println("Enter Maths marks =");
		Math=sc.nextFloat();
		
		System.out.println("Enter mathoutof=");
		mathoutof=sc.nextFloat();
		
		System.out.println("Enter sci marks=");
		sci=sc.nextFloat();
		
		System.out.println("Enter scioutof=");
		scioutof=sc.nextFloat();
		
		System.out.println("Enter physics marks=");
		phy=sc.nextFloat();
        
		System.out.println("Enter phyoutof=");
         phyoutof=sc.nextFloat();
        
         System.out.println("Enter biology marks=");
 		bio=sc.nextFloat();
         
 		System.out.println("Enter biooutof=");
          biooutof=sc.nextFloat();
          
          System.out.println("Enter chemistry marks=");
  		chem=sc.nextFloat();
          
  		System.out.println("Enter chemoutof=");
           chemoutof=sc.nextFloat();
         total=Math+sci+phy+bio+chem;
         System.out.println("Total of marks="+total);
         
         
 	     outoftotal=mathoutof+scioutof+phyoutof+biooutof+chemoutof;
 		per=(total/outoftotal)*100;
 		System.out.println("Percentage ="+per);
}
}