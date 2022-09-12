package Interface;

public interface Payment {
	void pay(int rs);
}
    class CreditCard implements Payment{
    	public void pay(int rs) {
    		System.out.println("Payment through CreditCard"+rs);
    		useCreditCard(4625265,8382);
    	}
    	public void useCreditCard(int ss,int pin)
    	{
    		System.out.println("Using CreditCard"+ss);
    		
    	}
    	class Debitcard implements Payment
    	{
    		public void pay(int rs) {
    			System.out.println("Payment through DebitCard"+rs);
    			useDebitCard(4625265,8382);
    		}
    		
    		public void useDebitCard(int ss,int pin){
    			System.out.println("Using DebitCard"+ss);
    		}
    	}
    }
