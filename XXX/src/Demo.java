import java.util.Scanner;

strictfp public class Demo {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
//		char m;
//		for(m=2309; m<2360; m++) {
//			System.out.print(" "+m);
//		}
//		
		char l;
		for(l=97; l<105; l++) {
			System.out.print(" "+l);
		}
		
		int N = sc.nextInt();
		
		if(N%2 == 1 )
		{
			System.out.println("Weird");
		} 
		else
		{
			if(N >= 2 && N <=5)
			{
				System.out.println("Not Weird");
			}
			else if(N >= 6 && N<= 20)
			{
				System.out.println("Weird");
			}
			else
			{
				System.out.println("Not Weird");
			}
		}
		

	}
}


