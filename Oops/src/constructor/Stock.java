package constructor;

public class Stock {
public static void main(String args[])
{
	Item obj=new Item(1,"bat",20);
	Item obj1=new Item(2,"ball",10);
	Item obj2=obj1;
	
	System.out.println(obj.hashCode());
	 System.out.println(obj1.hashCode());
	 System.out.println(obj2.hashCode());
	 System.out.println(obj);
}

}
