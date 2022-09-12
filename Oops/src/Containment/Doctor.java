package Containment;

public class Doctor {

	int regno;
	String spec,name;
	 Doctor() {}
	 Doctor(int r,String n,String spec)
	{
		 regno=r;
		 name=n;
		 spec=spec;
	}
		public void setregno(int r)
		{
			regno=r;
			
		}
	public void setname(String r)
	{
		name=r;
		
	}
	public void setspec(String r)
	{
		spec=r;
		
	}
	
		public String toString()
		{
			return "regno="+regno +"/n name ="+ name + "spec="+spec;
		}
}

class Hospital
{
	int noofBeds;
	String hname,loc;
	Doctor doc;
	public Hospital() {}
	public Hospital(int b,String n,String loc,Doctor doc) {
		noofBeds=b;
		hname=n;
		loc=loc;
		doc=doc;
		
	}
	public void setnoofBeds(int b)
	{
		noofBeds=b;	
	}
	public void sethname(String r)
	{
		hname=r;
	}
	public void setloc(String r)
	{
		loc=r;	
	}
	public void setdoc(Doctor d)
	{
		d=d;
		
	}
	public String toString()
	{
	
		return "hname ="+ hname + "loc="+loc +"Doctor="+doc;
	}
}

