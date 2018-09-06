package Lesson2.Task1;

public class Main {

	public static void main(String[] args) {
		Desk desk = new Desk();

		Circle ci = new Circle(new Point(2, 2), new Point(5, 5));
		Circle c2 = new Circle(new Point(5, 8), 5);
		Square s1 = new Square(new Point(1, 5), new Point(3, 3));
		Triangel t1 = new Triangel(new Point(3, 8), new Point(1, 5), new Point(8, 2));

		System.out.println(ci);
		System.out.println(ci.getArea());

		desk.addShape(ci);
		System.out.println(desk);
		System.out.println(desk.allArea());

		desk.addShape(c2);
		desk.addShape(s1);
		desk.addShape(t1);
		desk.addShape(new Triangel());

		System.out.println(desk);

		desk.deleteShape(ci);

		System.out.println(desk);

		System.out.println(desk.allArea());

		System.out.println(ci);

	}
	

}
