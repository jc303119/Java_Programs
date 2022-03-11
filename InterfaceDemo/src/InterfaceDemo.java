interface Iplayer{             //abstract interface IPlayer
	void play();                     //public abstract void play();
	void run();
	void jump();
	
	int MAX_POWER = 100;         //public static final int MAX_POWER = 100;
}
class Red implements Iplayer{

	@Override
	public void play() {
		
		System.out.println("player RED play");
	}

	@Override
	public void run() {
		
		System.out.println("player RED run");
	}

	@Override
	public void jump() {
		
		System.out.println("player RED jump");
	}
	
}
class Green implements Iplayer{

	@Override
	public void play() {
		
	  System.out.println("player GREEN play");	
	}

	@Override
	public void run() {
		
		System.out.println("player GREEN run");
	}

	@Override
	public void jump() {
		
		System.out.println("player GREEN jump");
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Green red= new Green(){
		 
			@Override
			public void run() {
			    super.run();
				
			}

			@Override
			public void jump() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void play() {
                super.play();
				System.out.println("Anonymous player play");
				
			}
		};
		red.play();
		red.run();
		
	}
}

