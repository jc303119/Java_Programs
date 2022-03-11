package com.jc.apps;

import java.io.IOException;
import java.io.PrintWriter;

interface HttpServletRes{
	PrintWriter getWriter() throws IOException;
}

class Tom implements HttpServletRes{

	public PrintWriter getWriter() throws IOException {
		PrintWriter pw = new PrintWriter("C:/Users/Tomcat/test.txt");
		return pw;
	} 
	
}
class Myservlet{
	public void doGet(HttpServletRes res) throws IOException{
		PrintWriter out = res.getWriter();
		out.println("Hello Tomcat");
		out.close();
	}
}
public class InterfaceDemo1 {
	
  public static void main(String[] args) {
	 Myservlet myServlet = new Myservlet();
	 Tom tom = new Tom();
	 try {
		myServlet.doGet(tom);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
