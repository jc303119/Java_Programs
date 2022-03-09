
public class TestForEmployee {

	public static void main(String[] args) {
		Employee ram=new Employee();
		Employee sam=new Employee();
		
		ram.print();
		
		ram.id=1001;
		ram.name="Ram";
		ram.salary=33000;
		ram.print();
		sam.print();
		
		sam.id=2002;
		sam.name="Sam";
		sam.salary=35000;
		sam.print();
	}

}
