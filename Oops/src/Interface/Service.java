          package Interface;

          public interface Service {
               float serviceTax=18.5f;
               static void provideService(String details) {
				// TODO Auto-generated method stub
				
			}
               static void provideOnlineservice(String u,String pass){
            	   System.out.println("You will be authenticated by"+"using username and passwrd");
               }
               default void discountineService()
      
               {
            	  System.out.println("Your service is stopped");
              }
          }
          
		     interface OnlineService extends Service
			{
				public default void provideService(String r)
				{
					System.out.println("Take our service"+serviceTax);
				}
				public default void discountinueservice()
				{
					System.out.println("your service is stopped after 24 hours");
				}
			}

