
public class Digitscount {
public void count() {
	int no=6578,cnt=0;
	while(no>0)
	{
		no=no/10;
		cnt++;
		System.out.println("Digits count ="+cnt);
	}
}
public static void main(String args[])
{
	Digitscount dc=new Digitscount();
	dc.count();
}
}
