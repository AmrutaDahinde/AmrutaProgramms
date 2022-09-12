package polymorphism;
import java.util.Scanner;

import Second.Account;
public class Shopping {
	 class CreaditCard{
		int cno,limit;
		String cowner;
	 CreaditCard(int no,int l,String o)
	{
		cno=no;limit=l;
		cowner=o;
	}
	public void usecreadit(int amt)
	{
		System.out.println("paying rs"+amt);

	}
        class DebitCard{
    	int dno,limit;
    	String downer;
		 DebitCard(int no,int l,String o) {
			dno=no;limit=l;
			downer=o;
		}	
		 public void usedebitCard(int amt) {
			 System.out.println("Paying Rs"+amt+"using debitcard");
		 }
	
   
		public void doTransaction(CreaditCard c){
			System.out.println("You got 15% discount on bill on creaditcard transaction");
		
		}
		public void doTransactio(DebitCard d) {
			System.out.println("No discount on bill on debitcard transction");
		}
    
    public static void main(String args[]) {
    
    	Shopping s=new Shopping();
    	CreaditCard c=new CreaditCard();
    	DebitCard d=new DebitCard();
        s.doTransaction(c);
    }
    }