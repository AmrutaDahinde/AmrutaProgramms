package Second;

public class Exam {
public static void main(String args[]) {
	Quetion q1,q2,q3,q4,q5;
	q1=new Quetion();
	q1.creatQuestion(12345, "what is binding", 'A', 7);
	q1.showquestionDetail();
	
	q2=new Quetion();
	q2.creatQuestion(0, "what is Bytecode", 'S', 5);
	q2.showquestionDetail();
	
	int totalmarks=q1.qwt+q2.qwt;
	if(totalmarks==15)
	{
		
	}
		q3=new Quetion();

	
	
	q4=new Quetion();
	q5=new Quetion();
	
}
}
