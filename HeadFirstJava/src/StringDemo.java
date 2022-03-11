
class Dog{

	public Dog(String name, int a) {
		
	}
	
	void bark(){
		System.out.println("Bark");
	}
	void play(){
		System.out.println("Play");
	}
	
}

public class StringDemo {

	
	public static void main(String[] args) {
		int a = 25;
		String name = "Fido";
		Dog myDog = new Dog(name, a);
		int x = a - 5;
		if(x<15){
			myDog.bark();
		}
		while(x>3){
			myDog.play();
		}

		
		int[] numList = {1,2,3,4,5};
		System.out.println("Hello");
		System.out.println("Dog: " +name);
		String num = "8";
		System.out.println(num);
		System.out.println(Integer.parseInt(num));     // returns primitive int
		int result = Integer.valueOf(num);            // returns object of integer
		System.out.println(result);
	}

}
