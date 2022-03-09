
class Overloading{

	void show(byte x){

		System.out.println("byte");
	}
	void show(short x){
		System.out.println("short");
	}
	void show(Integer x){
		System.out.println("INTEGER");
	}
	void show(Long x){
		System.out.println("LONG");
	}
	void show(int x){
	System.out.println("int");
    }
	
	 void show(long x){
	System.out.println("long");
    }
    
    void show(float x){
	System.out.println("float");
    }
    void show(double x){
	System.out.println("double");
    }
	void show(int ...x){
		int sum=0;
		System.out.println("many variables can be displayed");
		for(int i:x){
			sum+=i;
		  }
			System.out.println("Sum is :"+sum);
	}
	void show(String n, double y, int ...x){
		int sum=0;
		System.out.println("Name is"+n+"marks scored :"+y);
		for(int i:x){
			sum+=i;
		}
		System.out.println("Total Marks scored :"+sum);
	}
 }

public class TypePromotion {

	public static void main(String[] args) {	
		Overloading o=new Overloading();
		o.show((byte)10);   
		o.show((short)288);               //implicit type casting 
		o.show(45.6);
		 
		o.show(36);
		o.show(1,2,3,4,5,6,7,8,9,10);
		o.show("Jikmat",45.4,34);
		
//		Integer i=130; //assign VALUE to the integer but value provided 130 is out of range so not same reference
//		Integer j=130;     //because pool size for integer is of 1byte.
		Integer i=27;
		 Integer j=27;
//		 
//		Integer i=new Integer(37);                //assign address outside the pool
//		Integer j=new Integer(37);
		if(i==j){
			System.out.println("same ref");
		}
		else{
			System.out.println("not same ref");
		}
		
		i++;
		j++;
		System.out.println(i+"\n" +j+"\n");
		
//		int a=i++;
//		int b=++j;
//		System.out.println(a+"\n"+b+"\n");
//		
	
		Integer t=new Integer(100);                        //boxing
		int e=t.intValue();                          //UNboxing
		//e++;
		System.out.println(e);
		
		t=new Integer(e);
		t++;                                               //Auto boxing      ....?
		
		float f=t.floatValue();
		long l=t.longValue();
		double d=t.doubleValue();
		System.out.println(f+"\n"+l+"\n"+d+"\n");
		
		String hexa=Integer.toHexString(100);
		String binaryNo=Integer.toBinaryString(100);
		String octalNo=Integer.toOctalString(100);
		System.out.println(hexa+"\n"+binaryNo+"\n"+octalNo+"\n");
	}

}
