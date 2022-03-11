
class Animal{
	
	public void callme(){
		System.out.println("In callme of Animal");
	}
}

class Dogg extends Animal{
	
	public void callme(){
		System.out.println("In callme of Dog");
	}
	public void callme2(){
		System.out.println("In callme2 of Dog");
	}
}
public class UseAnimals {

	public static void main(String[] args) {
		
		Dogg d = new Dogg();
		Animal a = (Animal)d;
		d.callme();
		a.callme();
		((Dogg)a).callme2();

	}

}
