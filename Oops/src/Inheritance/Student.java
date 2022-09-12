package Inheritance;

import java.util.Scanner;

public class Student<total> {
int rollno1=10;
int rollno=11;
String name;
float mar,math,eng,total,per;
 public void totalmarks() {
	total=mar+math+eng;
	per=total/3*100;
	
}
}
class School extends Student{
	int sno;
	String sname;
	public static void main(String args[]) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter mar marks=");
		float mar=ss.nextFloat();
		School s=new School();
		s.totalmarks();
		
		 
	}
}