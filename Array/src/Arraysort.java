import java.util.Arrays;
import java.util.Scanner;

public class Arraysort {
     void sorting(int a[])
     {
    	 int len=a.length;
    	 for(int i=0;i<a.length;i++)
    	 {
    		 for(int j=0;j<a.length;j++)
    		 {
    			 if(a[j]<a[i])
    			 {
    				 int temp=a[j];
    				 a[j]=a[j+1];
    				 a[j+1]=temp;
    				 }
    		 }
    	 }
    System.out.println(Arrays.toString(a));
    System.out.println("Second highest element="+a[2]);
    System.out.println("Third minimum="+a[len-3]);
}
public static void main(String args[])
{
	Arraysort a=new Arraysort();
	Scanner s=new Scanner(System.in);
	
}
}
