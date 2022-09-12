
public class Digitsdivide {
public void divide(){
	int no=34569,rem;
	while(no>0)
	{
		rem=no%10;
		if(rem%3==0)
			no=no/10;
		System.out.println("Digits which divided by 3 are="+rem);
	}
}
public static void main(String args[])
{
	Digitsdivide d=new Digitsdivide();
	d.divide();
}
}
