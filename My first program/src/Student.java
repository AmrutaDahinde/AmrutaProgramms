
public class Student {
public static void main(String args[]) {
	Stud s1=new Stud("Amu","kirti");
	Stud s2=new Stud("sonal","kiran");
	
	System.out.println(s1.equals(s2));
	
}

public Object s1;
public Object stud1;
}
class Stud{
	String s1="kanchan";
	String s2="amu";
	private Object stud1;
	 Stud(){}
	 Stud(String stu,String stud1){
			s1=stu;
			s2=stud1;
		}
		public boolean equals(Object s) {
			if(s==null)
				return false;
			if(this==s)
				return true;
			Stud stu=(Stud)s;
		
		if(this.s1.equals(stu.s1) && this.stud1==stu.stud1)
	        return true;
	        else
	        	return false;
}
}
