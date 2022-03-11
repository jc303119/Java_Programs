
public class stringcompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s1="Hello World";
     String s2="I am a Java Developer";
     // s2=s1;
     String s3=s2;
     System.out.println(s2.compareTo(s1));
     System.out.println(s3.compareToIgnoreCase(s2));
   	 //System.out.println(s2.compareTo(s3));
   	 
     if(s1==s2){
    	 System.out.println("same reference");
    	 }
    	 else{
    		 System.out.println("not same reference");
    	 }
     }
}

