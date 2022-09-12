
public class StringSum {
public void check()
{
	String s="sd5df5fg66";
	System.out.println(s);
	if(Character.isDefined(s.charAt(2)))
	{
		System.out.println(s.charAt(2)+"is digit");
	}
	else
	
		System.out.println(s.charAt(2)+"is not digit");
		char s1='8';
		String s2=s1+"";
		int no=Integer.parseInt(s2);
		System.out.println(no+2);
				
}
public static void main(String args[]) {
	StringSum s=new StringSum();
	s.check();
}
}
