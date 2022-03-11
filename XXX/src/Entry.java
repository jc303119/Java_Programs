import java.util.Scanner;

public class Entry {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the Student");
		String name = sc.next();
		System.out.println("Enter the Roll no of the Student");
		int rollNo = sc.nextInt();
		
		int marks[] = new int[3];
	    System.out.println("Enter the marks of three Subjects");
	    for(int i=0; i<marks.length; i++) {
	    	marks[i] = sc.nextInt();
	    }
	    
	    EntryReport e = new EntryReport(name,rollNo, marks);
	    e.printResult();
	    System.out.println(e.printResult());
	    sc.close();
		

	}

}
