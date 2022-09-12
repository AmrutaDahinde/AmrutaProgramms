import java.util.Scanner;
public class Maxpower {
	public long powerofno(long base,long power) {
    long ans=1;

for(; power>0;power--)
	{
	ans=ans*base;
	}
return ans;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
				
				Maxpower mp=new Maxpower();
				System.out.println("Enter base=");
				System.out.println("Enter power=");
				//int ans=mp.powerofno(b,p);
				System.out.println("Power of no="+mp.powerofno(0,0));
	}
}