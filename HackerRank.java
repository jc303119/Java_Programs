

/*
    
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class HackerRank {


        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            String ans="";
            if(n%2==1){
              ans = "Weird";
            }
            else
            if(n>=2 && n<=5 && n%2==0){
              ans = "Not Weird";
            }
            else
            if(n>=6 && n<=20){
            	ans="Weird";
            }
            else
            if(n>20 && n%2==0){
            	ans="Not Weird";
            }
            System.out.println(ans);
            sc.close();
        }
    }*/

/*import java.util.Scanner;

public class HackerRank {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d=scan.nextDouble();
        scan.nextLine();
        String s=scan.nextLine();
      
       
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
} */
import java.util.Scanner;

public class HackerRank {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
           System.out.println("\n================================");
           for(int i=0;i<3;i++){
        	   
                String s1=sc.next();
                long x=sc.nextLong();
             
               System.out.printf("%-10s%03d%n",s1,x); //for formatting output.0->pad with zeroes(if digit is less than 3)
                
        	  }
           
            System.out.println("================================");
            sc.close();
    }
    
} 

/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRank {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int mul=0;
        for(int i=1; i<11; i++){
            mul=(N*i);
            System.out.println("2 x " +i+ " = " +mul);
        }
        in.close();
    }
}*/

/*import java.util.*;

class HackerRank {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
     
        for(int i=0; i<t; i++){
        	int a=in.nextInt();
        	int b=in.nextInt();
        	int n=in.nextInt();
        	
        	for(int j=0;j<n;j++){	 
        	
             a=a+(int)(Math.pow(2,j)*b);
             System.out.print(a+" ");
             
        }
        System.out.println("");
          }
        	   
        in.close();
    }
}
*/













