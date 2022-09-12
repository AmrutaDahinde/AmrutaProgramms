package com.education;

public class Exam {
public static void main(String args[])
{
	Question q1,q2;
	q1=new Question();
	q1=setqwt(2);
	 System.out.println("Qwt="+q1.getQwt());
	 q1.showQuesionDetails();
	 q2=new Question(454,"what is data",'c',1);
	 q2.showQuesionDetails();
	 q1.changeQuestion("what is object?");
	 System.out.println("After changing questions=");
	 q1.showQuesionDetails();
	 q2=new Question();
	 q2.creatQuestion(100023, "what is bytecode",'c', 8);
	 int totalMarks=q1.getQwt()+q2.getQwt();
	 if(totalMarks==10)
	 {
		 System.out.println("paper set properly");
	 } else
	 {
      if(q1.getQwt()<q2.getQwt())
      {
    	  q1.changewt(10-q2.getQwt());
      }
      else
      {
    	  q2.changewt(10-q1.getQwt());
      }
	 }
	 System.out.println(""); 
	 q1.showQuesionDetails();
	 q2.showQuesionDetails();
}

private static Question setqwt(int i) {
	// TODO Auto-generated method stub
	return null;
}
}

