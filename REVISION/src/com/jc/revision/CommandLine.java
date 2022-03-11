package com.jc.revision;

public class CommandLine {

	public static void main(String[] args) {
		String string;
		int count;
	    int i = 0;
		count = args.length;
		System.out.println("Number of arguments = " +count);
		
		while(i<count){
			string = args[i];
			i++;
			System.out.println(i+ ":" + "Java is "+string+ "!");
		}
	}

}
