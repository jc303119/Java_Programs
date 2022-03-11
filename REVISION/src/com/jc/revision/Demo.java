package com.jc.revision;

public class Demo {
	 private int id;
	 private String name;
	 private double salary;
	 
	public Demo(int x, String y, double z){
		this.id = x;
		this.name = y;
		this.salary = z;
		
	}
    @Override
    public String toString() {
	
	return "ID is  " +id+ "\nName is  " +name+ "\nSalary is  " +salary+ "";
}
	public static void main(String[] args) {
		System.out.println("Welcome to Java");
		  Demo demo = new Demo(23, "Jikmat", 30400);
		  System.out.println(demo);  //by default toString() method is attach with the object to print meaningful object.
		  
		
	}

}
