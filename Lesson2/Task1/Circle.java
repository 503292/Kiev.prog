package Lesson2.Task1;

public class Circle extends Shape {

	final static double PI = 3.1415;

	private Point a;
	private double radius;

	public Circle(Point a, double radius) {
		super();
		this.a = a;
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	
	//point a  - circle center, point b on circle line
	public Circle(Point a, Point b) {
		super();
		this.a = a;
		
		this.radius =  Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
		
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getPerimetr() {

		return 2 * radius * this.PI;
	}

	@Override
	public double getArea() {

		return this.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [a=" + a + ", radius=" + radius + "]";
	}


}
// ok
