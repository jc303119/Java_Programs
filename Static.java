package oppbasics;

class MathOperation{                                         //real life static operation example like in Flipkart,Amazon the search
	    
	static void sin(){                                                         //stretagy are same to all customers 
		System.out.println("Sin of 30 is 0.5");
	}
}
class Validation{
	static boolean checkBlank(String str){
		if(str.length()==0){
			return true;
		}
		else{
			return false;
		}
	}
}
class P{
	static void show(){
		System.out.println("P class show ");
	}
}
class C extends P{
	static void show(){
		System.out.println("C class show");
	}
}
public class Static {

	public static void main(String[] args) {
		//System s=new System();
		//s.out.println("hello");
		 //P obj=new C();                                 //doesn't depend on whether object is created or not because static method is  
		 //obj.show();            //P.show()             //bind with the CLASS and not with the OBJECT. thus there is warning.
		                                                //but it run anyway.
		 
		/*Validation v=new Validation();
		v.checkBlank("Hello how are you");
		
		MathOperation m=new MathOperation();
		m.sin();*/
		P.show();
		C.show();
		MathOperation.sin();
		//MathOperation ob = new MathOperation();
		//ob.sin();
		
		
	}

}
