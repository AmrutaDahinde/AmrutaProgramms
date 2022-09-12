        package com.education;

        public class Question {
         private int qid,qwt;
         private String qText;
          private char answer;
         
          public void setQwt(int a)
          {
        	  qwt=a;
          }
          public int getQwt()
          {
        	  return qwt;
        	 
          }
          Question()
          {
        	  qid=45;
        	  qText="sadfgg?";
        	  answer='D';
          }
          Question(int id,String q,char ans,int wt)
          {
        	  qid=43;
        	  qText=q;
        	  answer=ans;
        	  qwt=wt;
        	  System.out.println("Qestion is created with paractor");
        	  
          }
          Question(int id,String q)
          {
        	  qid=id;
        	  qText=q;
        	 
        
          System.out.println("Question is created");
          }
          
          public void showQuesionDetails()
          {
        	  System.out.println("Question id="+getQwt());
        	  System.out.println("Question is qText="+qText);
        	  System.out.println("Question Answer="+answer);
        	  System.out.println("Question Wt="+qwt);
        	  
          }
          
          public void creatQuestion(int id,String q,char ans,int wt)
          
          {
        	  qid=qid;
        	  qText=q;
        	  answer=ans;
        	  qwt=wt;
        	  System.out.println("Question is created");
          }
          
          public void changeQuestion(String newQuestion)
          {
        	  qText=newQuestion;
        	  System.out.println("Question is Updated");
          }
          
          public void changewt(int newwt)
          {
        	  qwt=newwt;
        	  System.out.println("Marks Updated");
          }
        }
          
