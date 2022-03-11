package com.brainmentors.kbc.views.question;

import java.util.Scanner;

import com.brainmentors.kbc.dto.question.QuestionDTO;
import com.brainmentors.kbc.model.question.QuestionOperations;

public class QuestionView {
           int index;
           Scanner sc;
           QuestionOperations questionOperations;
         public QuestionView(){
        	 index=0;
        	 sc=new Scanner(System.in);
        	 questionOperations=new QuestionOperations();       //why define inside the constructor
          }
         public void printQuestion(){
        	 int seq=65;
        	 String yourans="";
        	 QuestionDTO questionDTO=questionOperations.getQuestion(index);
        	 System.out.println("Q."+questionDTO.getId()+" "+questionDTO.getName());
        	 for(String option : questionDTO.getOptions()){
        		 System.out.println(" "+(char)seq+") "+option);
        		 seq++;
        	 }
        	 System.out.println("\n");
        	 while(true){
        	 System.out.println("Enter your Answer");
        	 yourans=String.valueOf(sc.next().charAt(0));
    if(yourans.equals("a") || yourans.equals("b") || yourans.equals("c") ||  yourans.equals("d")){
        			 break;
        	 }
        	 else{
        		 System.out.println("Wrong option selected");
        		 continue;
        	     }
                          }
        	 
        	 questionDTO.setYouranswer(yourans);
        	 if(questionDTO.compareanswer()){
        		 System.out.println("Your Amount is" +questionDTO.getScore()+"\n");
        		 if(index<QuestionOperations.MAX_QUESTIONS-1){
        			 index++;
        			 printQuestion();
        		          }
        		 else{
        			 System.out.println("Game Over" +questionDTO.getScore());
        		     }
        	   }
        	 else{
        		 System.out.println("Wrong Answer Game Over");
        	 }
      	 
       }
   }
