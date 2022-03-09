import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) {
    	
		String path = "C:\\Users\\jc\\Documents\\logs\\abcd.txt";
		File file = new File(path);
		
		try {
			
			System.out.println("DB Connection Open..");
			
			file.createNewFile();  //throw new IOException(); An Implicit Throw
			if(10>2){
				//System.exit(0);
			  return;
			}
			int x = 189/0;      //throw new ArithmetricException(); this is an Explicit Throw
		} catch (IOException e) {
			System.out.println("There is some problem occur while creating file. create a new file");
			e.printStackTrace();
		}
		catch(ArithmeticException e){
			System.out.println("number cannot be divided by 0. try another number");
		}
		catch(Exception e){
			System.out.println("An unexpected error occured");
		}
		finally{
			//Resource Clean Up Code
			System.out.println("DB Connection Close..");
		}
	}
}
