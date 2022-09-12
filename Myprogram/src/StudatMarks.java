import java.util.Scanner;
public class StudatMarks {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float Math,sci,phy,total,per,mathoutof,scioutof,phyoutof,outoftotal;
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
         total=Math+sci+phy;
         System.out.println("Total of marks="+total);
         
 		outoftotal=mathoutof+scioutof+phyoutof;
 		per=(total/outoftotal)*100;
 		System.out.println("Percentage ="+per);
}
}