package com.jc.revision;

import java.util.Scanner;;

public class Demo2 {
	private int x,y;
	private float z;
	
	Demo2(int a, int b, float c){
		this.x = a;
		this.y = b;
		this.z = c;
	}
	@Override
	public String toString() {
		int result = x+y;
		float result1 = x+z; // or int result = x + (int)z; typecast float to int
		return +x+" " +y+ " " +z+" Sum of X and Y is  " +result+ " Sum of X and Z is " +result1+ "";
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of X");
	int x=sc.nextInt();
	System.out.println("Enter the value of Y");
	int y =sc.nextInt();
	System.out.println("Enter the value of Z");
	int z = sc.nextInt();
/*	try{
	int z = sc.nextInt();
	}
	finally {
		System.out.println("You entered an invalid number");
	}*/
	Demo2 demo = new Demo2(x, y, z);
    System.out.println(demo);
    sc.close();
}

}
