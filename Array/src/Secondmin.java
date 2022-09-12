
           public class Secondmin {
             public static int getsecondmin(int a[],int total) {
            	 int temp;
            	 for (int i = 0; i < total; i++)   
 		        {  
 		            for (int j = i + 1; j < total; j++)   
 		            {  
 		                if (a[i] < a[j])   
 		                {  
 		                    temp = a[i];  
 		                    a[i] = a[j];  
 		                    a[j] = temp;  
 		                }  
 		            }  
 		        }  
 		       return a[total-2];  
 		}  
 		public static void main(String args[]){  
 		 
 			int a[]= {-20,0,25,15,19,37,23};
 			System.out.println("Second minimum of array="+getsecondmin(a,7));
             }
}
