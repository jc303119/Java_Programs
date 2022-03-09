
/*
 * Unchecked Exception->
 * all these exception occurs due to developer coding so they are take care by java at runtime, so they are called as 
 * programmatic Bugs and they are Unchecked Exception(JVM/java Does't check error during compile time.
 * e.g int x =100/0;
 * 
 * Checked Exception ->Exception always occur during runtime but they can be checked during compile time whether you
 * treat the exception or not. so they are called as API Bugs.
 * e.g File read/write, n/w connectivity, DB connectivity, DB DATA read/write.
 * 
 */
public class CheckException {

	public static void main(String[] args) {
	//String name1 = null;   //null means not pointing to any address in the m/m. 
	//name1.toUpperCase();   //so when we try to get the upper case of this String we get nullpointerexception at runtime.
	
		//int x = 100/0;         //this is arithmetic exception. the code will be called Dead code.
		//System.out.println(x);
		
	String name ="jikmat";
	 
	/*if(name!=null && name.equals("jikmat") ){        //don't use this code because if there will be more than one String/name
		                                  
		name.toUpperCase();
		System.out.println(name);
		System.out.println(name.toUpperCase());
	}*/
	
	if("jikmat".equals(name)){
		System.out.println(name.toUpperCase());
	}
	else{
		
	}
	int x[] = {10,20,30,40,50};        //ArrayoutofboundException
	x[10] = 100;
	

	}

}
