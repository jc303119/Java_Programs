/*public class Solution {


    public static void main(String[] args) {
    	System.out.println("Hello, World.");
    	System.out.println("Hello, Java.");
        /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */
  //  }
//}

/*import java.util.*;
import java.io.*;

class Solution {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
            	
                 short s=sc.nextShort();
	                System.out.println(s+" can be fitted in:\n*short\n*int\n*long");
                
                int z=sc.nextInt();
	                System.out.println(z+" can be fitted in:\n*int\n*long");
	                
                int x=sc.nextInt();
                    System.out.println(x+" can be fitted in:\n*int\n*long");
              
                long l=sc.nextLong();
                System.out.println(l+"can be fitted in:\n*long");
                   
                long m=sc.nextLong();
                System.out.println(m+"can be fitted in:\n*long");
                System.out.println("\n");
                
               if(x>=-128 && x<=127)
                {
                    System.out.println("* byte");
                }
            }
           
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
            
           }
        sc.close();
        }
   }
*/

/*
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
        
          System.out.println("1 " +sc.nextLine());
          System.out.println("2 " +sc.nextLine());
          System.out.println("3 " +sc.nextLine());
       }
        sc.close();
    }
}

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	private static final int B = 0;
	private static final int H = 0;
	private static boolean flag = true;
    
   public static void check(){

		Scanner sc = new Scanner(System.in);
   	System.out.println("enter breath");
   	int B = sc.nextInt();
   	System.out.println("enter the height");
   	int H = sc.nextInt();

   	sc.close();
    	
    }
   
	public static void main(String[] args){
		
		if(flag){
			System.out.println(flag);
			int area=B*H;
			System.out.print(area);
		}

		
	}//end of main

}//end of class


