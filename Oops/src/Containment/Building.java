package Containment;

public class Building {
int bno;
String bname,loc;
Building(){}
Building(int bno,String bname,String loc){
	bno=bno;
	bname=bname;
	loc=loc;
}
public void setbno(int no) {
	bno=no;
}
public void setbname(String name)
{
	bname=name;
}
public void setloc(String loc) {
	loc=loc;
}

public String toString()
{
	return "bno="+bno +"/n bname ="+bname + "loc="+loc;
}
class Society
{
	int sno;
	String sname;
	String loc;
}
}
