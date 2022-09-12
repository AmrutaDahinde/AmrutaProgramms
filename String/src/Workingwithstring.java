
public class Workingwithstring {
         public static void main(String args[]) {
        	 String s="TQ";
        	 String s1=new String("Hello");
        	 System.out.println(s.hashCode());
        	String s2= s.concat(s1);
        	 System.out.println(s2.hashCode());
        	 System.out.println(s1.hashCode());
        	
        	 
        	 System.out.println(s1.equals(s1));
        	 Laptop l1=new Laptop("Linux",80000.000);
        	 Laptop l2=new Laptop("window",90000.000);
        	 
        	 System.out.println(l1==l2);
        	 System.out.println(l1.equals(l2));
         }
}
class Laptop{
	String os;
	double price;
	Laptop(){
	}
	Laptop(String o,double p){
		os=o;
		price=p;
	}
	public boolean equals(Object o) {
		if(o==null)
			return false;
		if(this==o)
			return true;
		Laptop l=(Laptop)o;
	
	if(this.os.equals(l.os) && this.price==l.price)
        return true;
        else
        	return false;
	}
}
