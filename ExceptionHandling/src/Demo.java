/*
 * try catch, try catch finally,  try finally
 * try without catch is possible. but try with finally
 * 
 */
import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

public class Demo {

	public static void main(String[] args) {
		// try to check the error using logger.
		//Logger logger = new Logger();
		String path = "C:\\Users\\jc\\Documents\\logs\\a.txt";
		File file = new File(path);
	    boolean isOpen= false;
		try {
			System.out.println("DB connection is open");
			isOpen = true;
			if(10>2){     //if we add this condition it means we get out of the function because it return but 
				          //it is void and doesn't return with value. so the next lines will return.
				System.exit(0); //terminate the program i.e the DB connection close will not work.
				return;
				
			}
			file.createNewFile();  //this is a Checked Exception or API Bugs. if we THROWS this exception then there is no 
			                       //further class to handle so try catch handle is used. 
			int x =100/0;
			System.out.println("This code will not run when there is exception");
			System.out.println("I will run when there is no exception");
		//System.out.println("DB connection is close");  //closing here is very bad for the beneficial of company and also consume 
		                                     //many m/m due to open of many connection
			/*if(age<18){
			throw new MinorAgeException();            //Explicit throw 
		}*/
		} catch (IOException e) {   //throw new IOException();            i.e Implicit throw         
		  System.out.println("There is some problem while creating file");
			
			e.printStackTrace();
		}  
		catch(ArithmeticException e){    //throw new ArithmeticException(); 
			System.out.println("You divide a number by zero");
		}
		catch(Exception e){
			
			System.out.println("Some miscelanous exception occur");
		}
		finally{
			//This is called as Resource Clean up Code
			System.out.println("DB connection is close");
		}
		                              
       
	}

}
