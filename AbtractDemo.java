
abstract class Account{
    void showBalance() {
    	System.out.println("Show Balance");
	      }
    void updateBalance(){ }
    
    abstract void roi();
    abstract void withDraw();
 }

class SavingAccount extends Account{

	@Override
	void roi() {
		System.out.println("Saving roi");
	}

	@Override
	void withDraw() {
		System.out.println("Saving Withdraw");
	}
	void print(){
		System.out.println("Saving print");
	}
}

abstract class CurrentAccount extends Account{

	@Override
	void roi() {
		// TODO Auto-generated method stub
		
	}

}
class corpCurrentAccount extends CurrentAccount{

	@Override
	void withDraw() {
		System.out.println("Current withdraw");
	}
	
}
public class AbtractDemo {
	public static void main(String[] args) {
		
      SavingAccount sa=new SavingAccount();
      sa.roi();                        
      //CurrentAccount ca = new CurrentAccount();
     
      corpCurrentAccount cca=new corpCurrentAccount();
      cca.withDraw();
      
     // Account ac=new Account();         // abstract class cannot make object
   
	}
}            