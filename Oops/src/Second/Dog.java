package Second;

public class Dog {
String bread;String size;
int age; String color;
public String getInfo()
{
	return ("Breed is:"+bread+"size is:"+size+"Age is:"+age);
			
}
public static void main(String args[])
{
	Dog malthee=new Dog();
	malthee.bread="malthee";
	malthee.size="small";
	malthee.age=2;
	malthee.color="white";
	System.out.println(malthee.getInfo());
}
}
