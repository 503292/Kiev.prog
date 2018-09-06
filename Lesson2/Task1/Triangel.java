package Lesson2.Task1;

public class Triangel extends Shape {

	private Point a;
	private Point b;
	private Point c;

	public Triangel(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangel() {
		super();
	}

	public double getALine() {
		return Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
	}

	public double getBLine() {
		return Math.sqrt((b.getX() - c.getX()) * (b.getX() - c.getX()) + (b.getY() - c.getY()) * (b.getY() - c.getY()));
	}

	public double getCLine() {
		return Math.sqrt((c.getX() - a.getX()) * (c.getX() - a.getX()) + (c.getY() - a.getY()) * (c.getY() - a.getY()));
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

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	public double getPerimetr() {

		return getALine() + getBLine() + getCLine();
	}

	@Override
	public double getArea() {
		double p = getPerimetr() / 2;
		return Math.sqrt(p * (p - getALine()) * (p - getBLine()) * (p - getCLine()));
	}

	@Override
	public String toString() {
		return "Triangel [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
// ok
