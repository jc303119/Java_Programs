
interface T1{
	default void show(){
		System.out.println("T1 Show");
	}
	static void print(){
		System.out.println("This is T1 Print");
	}
}
interface T2{
	default void show(){
		System.out.println("T2 Show");
	}
}
interface T3 extends T1,T2{

	@Override
	default void show() {
		T1.super.show();
		T2.super.show();
	}
	
}
class T4 implements T3{
	
}
/*class Validation{
	private Validation(){}
*/
//this is called utility class ...?
interface Validation{
		static boolean isBlank(){
			return false;
		}
	}

public class MultipleInheritanceProblem {

	public static void main(String[] args) {
		//Validation v = new Validation();
		//v.isBlank();
		Validation.isBlank();
		T4 obj = new T4();
		obj.show();
		T1.print();
	}

}
