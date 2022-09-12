package constructor;

public class Item {
	int Iid;
	String Iname,sname;
	float cost;
	Item()
	{
		this(2,"car",300);
		 System.out.println("Item id="+Iid);
	}
	Item(int Iid,String Iname ,float cost)
	{ 
		
		Iid=Iid;
		Iname=Iname;
		cost=cost;
	}
   Item(int i,String name)
   {
	   Iid=i;
	   sname=name;
   }
   public String toString()
   {
	String s="Iid="+Iid+"Iname="+Iname+"cost="+cost+"sname="+sname;
	   return s;
   }
}
