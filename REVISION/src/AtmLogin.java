import java.util.Scanner;


public class AtmLogin {
     int pin = 123;
     void login(int pin){
    	if(this.pin == pin){
    		System.out.println("Account details: .......");
    		System.out.println("1. Banking /n 2.Account Balance /n 3. Withdrawal /n 4. Information");
    		
    		
    	}
    	else{
    		System.out.println("Invalid Pin number");
    	}
     }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your PIN");
		
		AtmLogin obj = new AtmLogin();
		obj.login(sc.nextInt());
		
  sc.close();
	}
 
}
