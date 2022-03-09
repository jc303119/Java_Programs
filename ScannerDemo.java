import java.util.Arrays;


public class ScannerDemo {

	public static void main(String[] args) {
		String org="AbcXyAcbzAwewbA";
		System.out.println("Original String is\n" +org);
		 
        
        char[] chars=org.toCharArray();
		Arrays.sort(chars);
		String sorted= new String(chars);
	
		System.out.println("Sorted String is\n" +sorted);
		
		
		 
		
	}

}
