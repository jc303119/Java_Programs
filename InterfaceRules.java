import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

interface A{
	void show();
	int x=100;       //by default(public static final int x=100;
}

interface B{
	void show();
	void disp();
	int x=200;
}

interface C extends A, B{
	void print();
}

class D implements C{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(A.x + B.x);
	}
	
}

class X extends WindowAdapter{
	 public void windowClosing(WindowEvent e){
		 System.out.println("Logic for closing");
	 }
}
public class InterfaceRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //WindowListener L;
        WindowAdapter w =null;
        System.out.println(w);
  
        D obj=new D();
        obj.print();
        
	}

}
