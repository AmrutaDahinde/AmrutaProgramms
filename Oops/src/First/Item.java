package First;
import java.util.Scanner;
public class Item {
int qut;
String name,qul;
float cost;
public void additem()
{
	qut=12;
	name="ball";
	qul="small";
	cost=30;
	
}

public void itemdetail()
{
	System.out.println("Item Name="+name);
	System.out.println("Item Quantity="+qut);
	System.out.println("Item Quality="+qul);
	System.out.println("Item cost="+cost);
}
public void itempurchase()
{
	}
}
