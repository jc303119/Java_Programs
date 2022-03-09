
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		final int EOF = -1;
		
		//String path = "C:\\Users\\jc\\Documents\\logs\\newfile.txt";
		String path = "F:\\ECLIPSE\\Eclipse_Project\\FileHandlingDemo\\src\\FileRead.java";
		
		File file = new File(path);
		if(!file.exists()){
			System.out.println("Can't read this file, It does not exist");
			return;
		}
		FileInputStream fs = new FileInputStream(file);
		int singleByte = fs.read();
		while(singleByte!=EOF){
			System.out.print((char)singleByte);
			singleByte = fs.read();
		}
		fs.close();

	}

}
