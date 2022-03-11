package com.brainmentors.kbc.model.question;

import com.brainmentors.kbc.dto.question.QuestionDTO;
//import com.brainmentors.kbc.dto.utils.LifeLineDTO;

public class QuestionOperations {
           
	       public static final int MAX_QUESTIONS=3;
                   
           QuestionDTO questions[]=new QuestionDTO[MAX_QUESTIONS];

		  // private static final int MAX_LIFELINE=3;                     //check here once if line line option is not working .
		   
           //LifeLineDTO lifeLines[]=new LifeLineDTO[MAX_LIFELINE];
          // String x[]=new String[3];
           public QuestionOperations(){
                	 prepareQuestions();
                	 //prepareLifeline();
                     }
                  
        private QuestionDTO prepareQuestionObjects(int id, String name, String options[],String rightans,int score){
                	QuestionDTO question=new QuestionDTO();
                	question.setId(id);
                	question.setName(name);
                	question.setOptions(options);
                	question.setRightanswer(rightans);
                	question.setScore(score);
                	return question;
                }
                  
			   private void prepareQuestions() {
                       String options[]={"Java Virtual Machine","Java Vital Machine","Both A and B"," None of these"};
				       questions[0]=this.prepareQuestionObjects(1, "JVM stands for\n", options, "a",1000);
				       String options2[]={"Java Run Environment","Java Runtime Environment","Both A and B","None of these"};
				       questions[1]=this.prepareQuestionObjects(2, "JRE stands for\n", options2, "b", 3000);
				       String options3[]={"Java Develop Kit","Java deve Kit","Java Development Kit","Both A and B"};
				       questions[2]=this.prepareQuestionObjects(3, "JDK stands for\n", options3, "c", 5000);
				        
				 }
           public QuestionDTO getQuestion(int index){
        	   return questions[index];                              
           }
                  
            
         /*  private LifeLineDTO prepareLifeLineObject(int id, String name){
        	   LifeLineDTO lifeLine=new LifeLineDTO(); 
        	       lifeLine.setId(id);
        	       lifeLine.setName(name);
        	       //lifeLine.setOptions(options);
        	     return lifeLine;
           }
           private void prepareLifeline(){
        	     lifeLines[0]=this.prepareLifeLineObject(1, "Flip Question");
        	     lifeLines[1]=this.prepareLifeLineObject(1, "Call a Friend");
        	     lifeLines[2]=this.prepareLifeLineObject(1, "50-50");
           }
           public LifeLineDTO getlifeLine(int index){
        	   return lifeLines[index];
           }*/
}
