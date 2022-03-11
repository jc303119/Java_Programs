package com.jc.Set;

import java.util.HashSet;

import java.util.TreeSet;

class Customer{
	int id;
	String name;
	double balance;
	
    Customer(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
    
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

	@Override
	public int hashCode(){
		return name.length();
	}
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Customer){
			Customer c = (Customer) o;
			if(this == c){
				return true;
			}
			if(this.id == c.id 
					&& this.name == c.name
					&& this.balance == c.balance){
				return true;
			}
		} 
		return false;
	}
	
}
class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Customer> customerset = new HashSet<>(); 
		
		Customer c= new Customer(1001, "Ram", 9999); 
		customerset.add(c);
		customerset.add(c);
		System.out.println(c.hashCode());
		c = new Customer(1001, "tim", 9999);
		customerset.add(c);
		System.out.println(c.hashCode());
		c = new Customer(1002, "Shyam", 1999);
		System.out.println(c.hashCode());
		customerset.add(c);
		c = new Customer(1002, "Shyam", 1999);
		System.out.println(c.hashCode());
		customerset.add(c);
		System.out.println(customerset);
		
		

	}

}
