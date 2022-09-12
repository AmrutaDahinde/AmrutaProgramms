import java.util.Arrays;
import java.util.Scanner;

public class Arraystring {
           void checkstring(String arr[])
           {
        	    String arr[]= {"java","Langauge","is","good"};
        	   for(int i=0;i<arr.length;i++)
        	   {
        		   System.out.println(arr[i]+""+arr[i].length());
        	   }
        	   for(int i=arr.length-1;i>=0;i--)
        	   {
        		   System.out.println(arr[i].charAt(i));
        	   }
        	   System.out.println();
        	   
           }
            void charchange(char ch)
            {
            	char ch[]= {'a','B','c','D','e','F','g','H'};
                  System.out.println(Arrays.toString(ch));
                  for(int i=0;i<ch.length;i++)
                  {
                	  if(ch[i]=>'A' && ch[i]<='Z')
                	  {
                		  ch[i]=(char)(ch[i]+32);
                	  }
                	  else if(ch[i]=>'a' && ch[i]<='z')
                	  {
                		  ch[i]=(char)(ch[i]-32)
                				  
                	  }
                	  System.out.println(Arrays.toString(ch));
            	}
            }
           public static void main(String args[])
           {
        	   Arraystring a=new Arraystring();
        	   Scanner ss=new Scanner(System.in);
             	System.out.println("Enter array size=");
             	int size=ss.nextInt();
             	int arr[]=new int[size];
             	System.out.println(arr.length);
             	System.out.println("Enter array elements=");
             	for(int i=0;i<arr.length;i++)
             	{
             		arr[i]=ss.nextInt();
           	}
           	a.checkstring(arr);
           }
             }
           

