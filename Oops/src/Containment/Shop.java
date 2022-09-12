package Containment;

public class Shop {
int sno;
String sname,loc;
Shop(){}
Shop(int sno,String sname,String loc ){
	sno=sno;
	sname=sname;
	loc=loc;
}
public void setsno(int sno) {
	sno=sno;
}
public void setsno(String sname) {
	sname=sname;
}
public void setloc(String loc) {
	loc=loc;
}
public String toString()
{
	return"sno="+sno;
}
}
