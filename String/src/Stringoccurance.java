import java.util.Scanner;

public class Stringoccurance {
public void checkoccurance(String s) {
	char a[]=s.toCharArray();
	for(int i=0;i<a.length;i++) {
		if(a[i]=='@')
			continue;
		int cnt=1;
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				cnt++;
				a[i]='@';
			}
		}
		System.out.println(a[i]+"occurs"+cnt+"times");
}


}





public static void main(String args[]) {
	
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the String");
	String s=sc.next();
	Stringoccurance so=new Stringoccurance();
	so.checkoccurance(s);
}
}
