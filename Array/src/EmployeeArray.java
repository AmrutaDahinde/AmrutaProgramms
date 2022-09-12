
    public class EmployeeArray {
     int eid;
     String ename;
     float salary;
      EmployeeArray() {}
      EmployeeArray(int eid,String ename,float sal){
    	  eid=eid;
    	  ename=ename;
    	  salary=sal;
      }
     public String toString() {
    	 return "Employee id="+eid +"Employee name="+ename+"Salary="+salary;
     }
     public class Payroll{
    	 public float ShowHighestSal(EmployeeArray[] e) {
    		 float hsal=Integer.MIN_VALUE;int hIndex;
    		 for(int i=0;i<e.length;i++) {
    			 if(e[i].salary>hsal)
    			 {
    				 hsal=e[i].salary;
    				 hIndex=i;
    			 }
    		 
    		 }
    			System.out.println("Employee with highest sal=");
    			//System.out.println(e[hIndex]);
    	 
    	 return hsal;
    	 }
    	 public void matchsalary(EmployeeArray[] sal) {
    		 float hsal=Integer.MIN_VALUE;
    		
    			 System.out.println("Employee with highest sal are=");
    		 }
    }
     public static void main(String args[])
     {
    	 EmployeeArray e[]=new EmployeeArray[5];
    	 e[0]=new EmployeeArray(101,"Amruta",30000);
    	 e[1]=new EmployeeArray(102,"Kanchan",40000);
    	 e[2]=new EmployeeArray(103,"Kanta",47000);
    	 e[3]=new EmployeeArray(104,"Karan",60000);
    	 e[4]=new EmployeeArray(105,"charu",80000);
     
    
       
    // System.out.println("Highest salary=" +p.matchsalary(e));
     }
    }
