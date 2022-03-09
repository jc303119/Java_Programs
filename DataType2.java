    import java.util.*;
public class DataType2 {
	    public static void main(String []args)
	    {
	        Scanner sc = new Scanner(System.in);
	        int t=sc.nextInt();

	        for(int i=0;i<t;i++)
	        {

	            try
	            {
	                long x=sc.nextLong();
	                System.out.println(x+" can be fitted in:\n*long\n");
	                
	                short s=sc.nextShort();
	                System.out.println(s+" can be fitted in:\n*short\n*int\n*long\n");
	                
	                int z=sc.nextInt();
	                System.out.println(z+" can be fitted in:\n*int\n*long\n");
	                
	                long l=sc.nextLong();
	                System.out.println(l+" can be fitted in:\n*long\n");
	                
	                
	                if(x>=-128 && x<=127)System.out.println("* byte");
	               
	            }
	            catch(Exception e)
	            {
	                System.out.println(sc.next()+" can't be fitted anywhere.");
	            }
              
	        }
	      sc.close();  
	        
	    }
	}
