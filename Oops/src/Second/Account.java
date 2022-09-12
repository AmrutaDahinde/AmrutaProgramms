package Second;

public class Account {
int accid;
String name;
float balance;
static float iRate=5.5f;
public static int objcount=0;

Account(){
	objcount++;
}
Account(String n,int id,float b)
{
	accid=id;
	name=n;
	balance=b;
    objcount++;
	}
public String toString()
{
	return"Acc"+accid+"of name="+name+"balance="+balance;
	
}
public  void changeInterest(float newRate)
{
	iRate=newRate;
	System.out.println("Interest rate changed to"+iRate);
}


	public static void main(String args[]){
		System.out.println("current Interest="+Account.iRate);
		Account a1=new Account("amol",324,23445555);
		Account a2=new Account("amit",364,234455558);
		System.out.println(Account.iRate);
		System.out.println(a1);
		System.out.println(a2);
	}
	{
}
}
