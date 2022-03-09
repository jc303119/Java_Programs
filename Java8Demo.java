interface Food{
	default void flavor(){   //in Java 8 Interface is not 100% abstract we can avoid override for some methods by using 'default' keyword.
		System.out.println("Flavor");
	}
	default void vitamin(){
		System.out.println("Vitamins");
	}
}

interface E{
	void show();  //public abstract void show();
 }

class E1 implements Food,E{

	@Override
	public void show(){
		System.out.println("Show Override");
	}
	
	public void flavor(){
		Food.super.flavor();
		System.out.println("Flavor Override");  //Flavor override is not mandatory
	}
}
 
public class Java8Demo {

	public static void main(String[] args) {
		 
		E1 e1=new E1(){                               //call using Anonymous Class/Interface
			 public void show(){
				 super.show();
				 System.out.println("New show");
			 }
			 public void flavor(){
				 super.flavor();
				 System.out.println("New Flavor");
			 }
		};
		e1.show();
	    e1.flavor();

	}

}
