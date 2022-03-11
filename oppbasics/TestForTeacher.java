package oppbasics;

public class TestForTeacher {

	public static void main(String[] args) {
		Teacher seema= new Teacher(1001,"Seema",23000);
		seema.Teach();
		seema.print();
		System.out.println("*********************************");
		Teacher akash= new Teacher(1001,"Akash");
		//akash.takeinput(1003, "teema", 3409);
		akash.print();
		System.out.println("*********************************");
		Teacher rahul= new Teacher(1004,"Rahul");
		rahul.print();
		System.out.println("*********************************");
	}

}
