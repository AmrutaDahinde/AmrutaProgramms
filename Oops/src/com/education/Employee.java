      package com.education;

      public class Employee
      {
      int eid;
      String ename;
      float sal;
      Employee()
      {
    	  this(200,400000,"amit");
    	  eid=1000;
    	  System.out.println("Employee detail="+eid +"+ename");
      }
      Employee(int i,float s,String ename)
      {this(ename,s);
      eid=i;
      }
      
      Employee(String name,float s)
      {
    	  ename=name;
    	  sal=s;
      }
      }