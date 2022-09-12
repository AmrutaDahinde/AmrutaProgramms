package Second;

public class Quetion {
int qid,qwt;
String qText;
char answer;


public void showquestionDetail() {
	System.out.println("Question id="+qid);
	System.out.println("Question is="+qText);
	System.out.println("Questions answer is="+answer);
	System.out.println("Question wt ="+qwt);
	
}
public void creatQuestion(int id,String qText,char ans,int wt) {
	qid=id;
	qText="q";
	answer=ans;
	System.out.println("Question is created");
	
}
public void changQuestion() {
	
}
}
