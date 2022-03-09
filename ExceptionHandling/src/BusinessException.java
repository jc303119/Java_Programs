/*
 * to make your own exception ,
 * 1. we need to extends the parent class exception i.e Exception for checked exception
 *    and extends runtimeException for unchecked exception.
 * 2.to take the values make constructor and to print the values override toString.
 */
import java.util.Scanner;

class MinorAgeException extends Exception{
	private int age;
	private String message;
	
	public MinorAgeException(int age, String message) {
	this.age = age;
	this.message = message;
	}
	@Override
	public String toString(){                      //listen to the audio once 
		return message+ " "+age;
		
	}
}
public class BusinessException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		try{
		if(age<18){
			throw new MinorAgeException(age, "You are a minor");        //this is a checked exception.
		}
		System.out.println("Congrats you can apply for the following....");
		System.out.println("you can apply for DL");
		System.out.println("you can apply for VoterId");
		}
		catch(MinorAgeException e){
			System.out.println(e);       // here e.toString() is set by default.
		}
		finally{
			if(sc!=null){
				sc.close();
			}
		}
	}

}
