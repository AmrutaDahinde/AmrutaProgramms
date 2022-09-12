package Inheritance;

public class Food {
String name;
float price;
private int qnt;
protected Food(String qlt) {
	qlt=qlt;
}
public void order() {}
	public void order(String n,int q) {
		name=n;
		qnt=q;
	}
	public void setname(String n) {
		name=n;
	}
	public void setprice(float p) {
		price=p;
	}
	public void setqnt(int q) {
		qnt=q;
	}
	public String toString()
	{
		return "name="+name +"price="+price + "qnt="+qnt;
	}
}
	class Junkfood extends Food
	{
		String jname,qlt;
		int jqut;
		Junkfood(String n,int q)
		{
		super(n);
		name=n;
		}
	
	  Junkfood() {
		  this("pizza","good");
	  }
      Junkfood(String jn,String qlt)
		{
			super(qlt);
			name=jn;
			qlt=qlt;
		}
		public void setname(String n) {
			jname=n;
		}
		public void setqlt(String q) {
			qlt=q;
		}
		public  void qnt(int jqut) {
			jqut=jqut;
		}
		public String toString() {
			return "jname="+jname+"jqlt="+qlt+"jqut="+jqut;
		}
		public void jqut() {
			// TODO Auto-generated method stub
			int qut;
			System.out.println("junkfood quantity="+jqut);
		}
	}



