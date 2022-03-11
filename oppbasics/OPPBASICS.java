package oppbasics;
/**
 * this class tell us about the basic class and objects in OOPs
 * it also contain variables and methods 
 * this is the main class for calling other classes and methods
 * 
 * @author jc
 *
 */

public class OPPBASICS {

	public static void main(String[] args) {

        Employee ram=new Employee(-34,"ram kumar sharma",-45000);
        Employee sam=new Employee(-37,"shyam kumar verma",-49000);
        ram.setSalary(ram.getSalary()+2000);    
        
        String ramresult=ram.printresult();
        System.out.println(ramresult);
        
        String samresult=sam.printresult();
        System.out.println(samresult);
	}

}
