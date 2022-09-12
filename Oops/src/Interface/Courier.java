package Interface;

public abstract class Courier implements Service {

	void provideservice(String s)
	{
		System.out.println("we are there to serve you "+ s);
		System.out.println("only pay service tax amount"+Service.serviceTax);
	}
	
	}

