     package Second;

     public class Chatroom {
      String passward;
      String name;
      static int count=1; 
      int id;
      static int accid=100;
      
      
      Chatroom() {
    	  count++;
      }
       Chatroom(String n) {
    	   id=accid++;
    	  name=n;
    	  
      }
     
    
      public String toString()
      {
    	  return "id is:"+id+"\n"+"name is:"+name;
      }
      public static void main(String args[]) {
      Chatroom c=new Chatroom();
      Chatroom c1=new Chatroom("amol");
      Chatroom c2=new Chatroom("amruta");
      System.out.println(c1.toString());
      System.out.println(c2.toString());
      System.out.println("You visited people are:"+Chatroom.count);
      }
     }
     
