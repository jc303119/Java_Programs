import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Partyy {

	public static void main(String[] args) {
		
		System.out.println("Hello Everyone");
          Partyy obj = new Partyy();
          obj.buildInvite();
	}

public void buildInvite(){
		
		Frame f = new Frame();
		Label l = new Label("Party at Jikmat's");
		Button b = new Button("You bet");
		Button b1 = new Button("Shoot me");
		Panel p = new Panel();
		p.add(l);
		
	}
}
