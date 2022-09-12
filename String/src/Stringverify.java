import java.util.Scanner;

public class Stringverify {
     public void checkstring(String s1,String s2) {
    
    	 boolean flag=true;
    	 for(int i=0;i<s2.length();i++)
    	 { int cnt=0;
    		 for(int j=0;j<s1.length();j++)
    		 {
    		 
    			 if(s2.charAt(i)==s1.charAt(j))
    			 {
    				cnt++;
    				break;
    		 }
    		 if(cnt==0)
    		 {
    			 flag=false; 
    			 break;
    		 }
    	 }
    	 } 
     if(flag==true)
     {
    	 System.out.println("New string is created");
     }
     else {
    	 System.out.println("New string is not created");
		 } 
     }
     public static void main(String args[]) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter string=");
    	 String s1=sc.next();
    	 System.out.println("Enter string=");
    	 String s2=sc.next();
    	 Stringverify sv=new Stringverify();
    	 sv.checkstring(s1,s2);
     }
}
