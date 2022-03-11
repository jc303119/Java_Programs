package com.brainmentors.kbc.views.user;

import java.util.Scanner;

import com.brainmentors.kbc.dto.user.UserDTO;
import com.brainmentors.kbc.model.user.UserOperations;
import com.brainmentors.kbc.views.question.QuestionView;

public class LoginView {
              public void login(){
                  Scanner sc=new Scanner(System.in);
            	  System.out.println("Enter the login ID");
            	  String userid=sc.next();
            	  System.out.println("Enter the Password");
            	  String password=sc.next();
            	  
            	  UserDTO userDTO=new UserDTO();
            	  userDTO.setUserid(userid);
            	  userDTO.setPassword(password);
            	  
            	  UserOperations userOperations=new UserOperations();
            	  if(userOperations.isAuth(userDTO)){                       //remember this line ?
            		   System.out.println("Welcome  " +userid+ "\n");
            		   QuestionView questionView=new QuestionView();
            		   questionView.printQuestion();
            	  }
            	  else{
            		  System.out.println("Invalid userid or passsword. Please try again");
            	  }
            	  sc.close();
              }
              
}
