      package polymorphism;

      public class Object {
       double figure(double l,int b)
       {
    	   return (l*b)/2;
    	   
       }
       float figure(int s)
       {
    	   return(s*s);
       }
       int figure(int l,int b)
       {
    	   return(1/2*(l*b));
       }
       float figure(float r)
       {
    	   return(22*r*r)/7;
       }
       public static void main(String args[])
       {
    	   Object o=new Object();
    	   System.out.println("Area of rectangle="+o.figure(3.5, 8));
    	   System.out.println("Area of square="+o.figure(3));
    	   System.out.println("Area of triangle="+o.figure(7, 7));
    	   System.out.println("Area of circle="+o.figure(7));
       }
       }
