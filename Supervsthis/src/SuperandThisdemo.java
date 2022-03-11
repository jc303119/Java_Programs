class Parent{
    int x;
	Parent(){
		x=1000;
		System.out.println("this is default cons of parent class");
	}
	Parent(int x){
		this();
		System.out.println("para cons  of parent");
	}
	void print(){
		System.out.println("PARENT print call");
	}
}
class Child extends Parent{
	int x;
	Child(){
		super(10);
           x=2000;
		System.out.println("this is default cons of child class");
	}

	Child(int x){
		this();
	    int n=super.x + this.x + x;
		System.out.println("para cons of child");
		System.out.println("value of n:\n"+n);
	}
	void print(){
		System.out.println("CHILD print call");
		super.print();
	}

}
public class SuperandThisdemo {
  public static void main(String[] args){
	  Child obj=new Child(20);
	  obj.print();  
	  }
}
