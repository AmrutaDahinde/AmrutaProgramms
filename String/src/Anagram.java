import java.util.Scanner;

public class Anagram {
	public void check(String s1,String s2) {
		 char ch[]=s1.toCharArray();
		 char ch1[]=s2.toCharArray();
		 int cnt=0;
		 boolean flag=true;
    	 for(int i=0;i<s1.length();i++)
    	 {
    		 for(int j=0;j<s2.length();j++)
    		 {
    		 
    			 if(s2.charAt(i)==s2.charAt(j))
    			 {
    				cnt++;
    				break;
    		 }
    		 if(cnt==0)
    		 {
    			 flag=false; 
    			 break;
		
	} if(flag==true)
    {
   	 System.out.println("New string is created");
    }
    else {
   	 System.out.println("New string is not created");
    }
    		 }
    	 }
    }
    public static void main(String args[]) {
   	 Scanner sc=new Scanner(System.in);
   	 System.out.println("Enter string=");
   	 String s1=sc.next();
   	 System.out.println("Enter string=");
   	 String s2=sc.next();
   	 Anagram a=new Anagram();
   	 a.check(s1,s2);
   
	
}
}
