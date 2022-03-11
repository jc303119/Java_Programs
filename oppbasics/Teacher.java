package oppbasics;

public class Teacher {

	private int id;
	private String name;
	private float salary;
	private String branch;
	
	public Teacher() {
		System.out.println("I am A Constructor");
		branch="Noida";
	}
	
	public void Teach() {
		System.out.print("I am A Function\n");
	}
	

	public Teacher(int id, String name){
		this();
	    this.id=id;
	    this.name=name;
		//this.salary=salary;
		
	}
	
  
	public Teacher(int id, String name, float salary) {
		this(1002, "Mahesh");                          //doubt here why 1002 and Mahesh is not pass to the 2 para cons.
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}

	
	public void takeinput(int id, String name, float salary) {
		if(id<0 && salary<=0){
			System.out.println("Invalid Data");
			return;
		}

		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	public void print() {
		System.out.println("Id is\t" +id);
		System.out.println("Name of Teacher is\t" +name);
		System.out.println("Salary is\t" +salary);
		System.out.println("Branch is\t" +branch);
		
	}

}
