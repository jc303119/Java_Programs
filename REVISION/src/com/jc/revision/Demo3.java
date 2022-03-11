package com.jc.revision;

strictfp public class Demo3 {

	public static void main(String[] args) {
		byte x = 100; //1 byte
		byte y = (byte)130;
		//byte z = (byte) (x+y);
		short s = 382; //2 bytes
		   
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
		
 int a = 12_000_99;        //4 bytes
 System.out.println(a);
 long t = 90l;         // 8 bytes
 System.out.println(t);
 //float f = 10.25f;
 float f = (float)10.25;     //4 bytes
 System.out.println(f);
 double d = 29.4544444444;      //8 bytes
 System.out.println(d);
 char l ='w';
 System.out.println(l); 
 //char[] k = { 'अ', 'आ','इ','ई'};
 //System.out.println(k);
 String c = "welcome";
 System.out.println(c);
 String w = "अआइई";
 System.out.println(w);
	
   /* char m;
	for(m=2309; m<2360; m++){
		System.out.println(" "+m);
	}
	*/
 }
}