package Lesson2.Task1;

public class Square extends Shape {

	private Point a;
	private Point b;

	public Square(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Square() {
		super();
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	@Override
	public double getPerimetr() {

		return Math.abs((a.getX() - b.getX() + a.getY() - b.getY()) * 2);
	}

	@Override
	public double getArea() {

		return Math.abs((a.getX() - b.getX()) * ( a.getY() - b.getY()));
	}

	@Override
	public String toString() {
		return "Square [a=" + a + ", b=" + b + "]";
	}

}
// ok
