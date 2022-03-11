package oppbasics;

class Shape{
      void side(){
		System.out.println("No of sides for the shape");
	}      
}

class Circle extends Shape{
	   @Override
       void side(){
    	   System.out.println("No of sides for Circle is Zero");
    	   super.side();
       }
}


class Triangle extends Shape{
	@Override
	void side(){
		System.out.println("No of sides for Triangle is Three");
		super.side();
	}
	 void triSide() {
		System.out.println("Triangle has Three sides");
	}
}

class Square extends Shape{
	@Override
	void side(){
		System.out.println("No of sides for Square is Four");
	}
	void fourside() {
		System.out.println("Square has Four sides");
	}
}

class Polygon extends Shape{
	@Override
	void side(){
		System.out.println("No of sides for Polygon is many");
	}
    void manySides() {
		System.out.println("Polygon has many sides");
	}
}

 class drawing{
   void callme(Shape shape){
	   System.out.println("************************");
	   shape.side();
	  
	   if(shape instanceof Triangle){
		   Triangle t= (Triangle)shape;           //DOWNCASTING
		   t.triSide();
	   }
		   else if(shape instanceof Square){
			   Square square=(Square)shape;
			   square.fourside();
		   }
		   else if(shape instanceof Polygon){
			   Polygon polygon=(Polygon)shape;
			   polygon.manySides();
		   }
	   }
   }


public class Inheritance {

	public static void main(String[] args) {
		drawing d=new drawing();
//		Circle circle=new Circle();                 
//		d.callme(circle);                             //UPCASTING
		d.callme(new Circle());
		d.callme(new Triangle());                   //UPCASTING
		d.callme(new Square());
		d.callme(new Polygon());
		
//		Shape s=new Circle();
//		s.side();
//		Triangle t=new Triangle();
//		t.side();
//		t.triSide();
//		
	}

}
