package oppbasics;
/**
 * this Employee class contain public methods and private member variables 
 * the printresult method is used to print the details of the Employee
 * the takeinput method is used to take the input from the end user
 * 
 * @author jc
 * @since 17th June 2017
 */
public class Employee {

	 private int id;
	 private String name;
	 private double salary;
	private String branch;
	private String city;
	private String designation;
	
	
	 public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city ="Delhi";
	}

	public Employee(){
		 setBranch("Delhi");
		 setCity("Delhi");
		 setDesignation("Narela");
		}
	 
	 public Employee(int id,String name, double salary){
		this();
		this.id=id;
		this.name=name;
		this.salary=salary;
	 }
	 
	 public void takeinput(int id, String name, double salary){
		 if(id>0 && salary>0){
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
		}
		 else{
			 System.out.println("Invalid Parameter for value of "+name);
		 }
	 }
	 
	  public String getBranch() {
			return branch;
		}
	  
	  public void setBranch(String branch) {
			this.branch = branch;
		}
	
    public String printresult(){
    CommonUtil cu=new CommonUtil();	
    	 
     return "\nId:\t"+id+"\nName:\t"+cu.getpropername(name)+"\nSalary:\t"+salary+"\nBranch:\t"+branch+"\nCity:\t"+city+"\nDesignation:"+designation;
     }

}
	

