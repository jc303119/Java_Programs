package oppbasics;
class Example{
	 void show(){
		System.out.println("no argument show");
	}
	protected long show(int x){
		System.out.println("one argument int show");
		return 0;
	}
	 double show(long x){
		System.out.println("one argument long show");
		return 0.0;
	}
    void show(int x,long y){
		System.out.println("diff arg show");
	}
	 void show(long x,int y){
		System.out.println("diff order arg show");
	}
}
class A{
	 void input(){
		System.out.println("taking input for A");
	}
	 void print(){
		System.out.println(" A print");
	}
}
class B extends A{
	
	@Override
	void input(){
		System.out.println("taking input for B, this is overriding");
	}
	  void input(int x){
		System.out.println("taking input for B. this is overloading");
	}
	  void output(){
		System.out.println(" B output");
	}
}
public class OverridingVsOverloading {

	public static void main(String[] args) {
		A obj2=new A();
		obj2.print();
		obj2.input();
	
		A obj=new B();
		obj.print();
		obj.input();
		//obj.input(56);
		
		
	 Example ex=new Example();
	 ex.show();
	 ex.show(78);
	 ex.show(85,97L);

	}

}
