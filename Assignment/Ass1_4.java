abstract class Shape{
	double dim1;
	String color;
	Shape(double d1, String c){
		dim1=d1;
		color=c;
	}
	void display(){
		System.out.println("color:"+color);
	}
	abstract void area();
}
class Triangle extends Shape{
	double dim2;
	Triangle(double d1,double d2,String c){
		super(d1,c);
		dim2=d2;
	}
	void area(){
		System.out.println("Area of Triangle: "+((dim1*dim2)/2));
	}
}
class Square extends Shape{
	Square(double d1,String c){
		super(d1,c);
	}
	void area(){
		System.out.println("Area of Square: "+(dim1*dim1));
	}
}
class Rectangle extends Shape{
	double dim2;
	Rectangle(double d1,double d2,String c){
		super(d1,c);
		dim2=d2;
	}
	void area(){
		System.out.println("Area of Rectangle: "+(dim1*dim2));
	}
}
class Circle extends Shape{
	Circle(double d1,String c){
		super(d1,c);
	}
	void area(){
		System.out.println("Area of Circle: "+(3.14*dim1*dim1));
	}
}
class Ass1_4{
	public static void main(String args[]){
		Triangle t=new Triangle(12,5,"Red");
		Square s=new Square(5,"White");
		Circle c=new Circle(7,"Black");
		Rectangle r=new Rectangle(12,5,"Yellow");
		System.out.println("Triangle:");
		t.display();
		t.area();
		System.out.println("Square:");
		s.display();
		s.area();
		System.out.println("Rectangle:");
		r.display();
		r.area();
		System.out.println("Circle:");
		c.display();
		c.area();
	}
}