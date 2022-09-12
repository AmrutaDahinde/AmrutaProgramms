package Interface;

public class Person {
    int pid;
    String name;
    float salary;
    Payment dc;
    Person(){}
    Person(int i,String n,float s,DebitCard d)
    {
    	pid=i;
    	name=n;
    	salary=s;
    	dc=d;
    }
    Person(int i,String n,float s,CreditCard d)
    {
    	pid=i;
    	name=n;
    	salary=s;
    	dc=d;
    }
    public void enjoyShopping()
    {
    	System.out.println(name+"is Enjoying Shopping...");
    	dc.pay(6000);
    }
}
