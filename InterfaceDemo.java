interface Player{        //by default (abstract interface player)
	 void attack();         //by default (public abstract void attack();)
	 void defence();
	 void increasePower();
	  int  MIN_POWER=1;
	  int MAX_POWER=100;
	  int DEFAULT_POWER=10;
	  void jump();
	  int MAX_JUMP=100;
	 
}
interface StarPlayer{
	void extraPower();
}
 
abstract class CommonPlayer{
	 void score(){
		 
	 }
	 void food(){
		 
	 }
 }

class RedPlayer extends CommonPlayer implements Player, StarPlayer{
    
	int power=DEFAULT_POWER;
	@Override
	public void extraPower() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defence() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void increasePower() {
		// TODO Auto-generated method stub
		if(power<MAX_POWER){
			power+=2;
		}
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}
	
}

class WhitePlayer implements Player{
       
	int power=DEFAULT_POWER;
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defence() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void increasePower() {
		// TODO Auto-generated method stub
		if(power<MAX_POWER){
			power++;
		}
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceDemo {
           public static void main(String[] args){
        	   
           }
}
