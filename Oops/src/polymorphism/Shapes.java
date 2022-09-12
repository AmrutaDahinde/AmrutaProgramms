package polymorphism;

public class Shapes {
	void calculatearea(double b,int h)
	{
		double rect=(b*h)/2;
		System.out.println("Area of rectangle="+rect);
	}
	void calculatearea(int s)
	{
		
    int sqr=4*s;
     System.out.println("Area of square="+sqr);
	}
   void calculatearea(float a,int b)
   {
	   float t;
	   t=1/2*(a*b);
	   System.out.println("Area of triangle="+t);
	   
   }
   void calculatearea(float r)
   {
	   float c;
	   c=(22*r*r)/7;
	   System.out.println("Area of circle="+c);
	   
   }
   

public static void main(String args[])
{
	Shapes s=new Shapes();
	s.calculatearea(22);
	s.calculatearea(24);
	s.calculatearea(23, 12);
	s.calculatearea(23.5,54);
}
}