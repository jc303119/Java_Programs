
interface P1{
	int add(int x, int y);

}
class P2 implements P1{

	@Override
	public int add(int x, int y) {
		return x+y;
	}
	public void display(){
		System.out.println("P2 Display");
	}
}

class BB {
	void show(){
		System.out.println("BB Show");
	}
}
public class InterfaceUseWays {

	public static void main(String[] args) {
		
		P1 obj2 = (a,b)->a+b; //SAM Interface (Simple Abstract Method) also called as Lambda expression. Disadv:can use only when there is only one method in the class.
		System.out.println("Lambda "+obj2.add(100,200));
		
		P1 obj3 = (x,y)->{
			System.out.println("X is "+x+ "Y is "+y);
			return x + y;
		};
		System.out.println("Multiple Lambda Line "+obj3.add(10, 20));
		
//	 BB b=new BB(){
//	 	@Override
//		void show(){
//			System.out.println("New Show"); //An Anonymous class so it create byte code classname$1.class.This technique is called inner way inheritance
//		}
//	 };
//	b.show();
	

	if(10>2){           //An Anonymous class/interface create many byte code for the end user so to avoid this problem java 8 introduce lambda expression.
			P1 p=new P1(){
			@Override
			public int add(int x, int y){ //when there is more than one method in the class then we use anonymous method and not Lambda Expression.
				this.display();
				this.hello();
				return x+y;
			    }
			
			public void display() {
				System.out.println("Anonymous Interface"); //because the object is created of an anonymous interface .
			   }
			  public void hello(){
				   System.out.println("Anonymous new Interface");
			   }
			  
		     };
		   int result = p.add(10, 2);
		   System.out.println("Result is " +result);
		  
		   
	   }
		
//        BB bb=new BB(); //class InterfaceUseWays call class BB directly so Bad. therefore we use interface in the middle
//		bb.show();
		//int result2=bb.add(20, 30);
		 
		
		  P2 obj = new P2();
		  obj.display();
		  int result = obj.add(10,20);
		  System.out.println(result);
		 
	}
}
