
import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo1 {
	
	
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		String path = "C:\\Users\\jc\\Documents\\logs\\newfile.txt";
		
	    File file = new File(path);
	    
	    if(file.exists()){
	    	//System.out.println("This file is already exist");
	    	System.out.println("This file is already exist now i want to append");
	    	FileOutputStream fs = new FileOutputStream(file,true);
	    	System.out.println("Enter the data to Append in the file");
	    	String data = sc.nextLine();
	    	fs.write(data.getBytes());
	    	fs.close();
	    	System.out.println("Data store in the file..");
	    	//System.out.println("Do you want to Override");
	    }
	    else{
	    	file.createNewFile();
	    	FileOutputStream fs = new FileOutputStream(file);
	    	System.out.println("Enter the data to store in the file");
	    	String data = sc.nextLine();
	    	fs.write(data.getBytes());
	    	fs.close();
	    	System.out.println("Data store in the file..");
	      }
	    
	    
	}
}
