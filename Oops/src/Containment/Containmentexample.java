package Containment;


public class Containmentexample {
public static void main(String args[])
{
	Doctor d=new Doctor(345,"amit kale","eye specialist");
	Hospital h1=new Hospital(8765,"Dinanath hospital","karve nagar",d);
	System.out.println(h1);
	h1.sethname("Sasun Hospital");
	System.out.println(d);
	h1.setdoc(d);
}

}
