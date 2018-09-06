package Lesson1.Task2;

public class MainTriangle {

	public static void main(String[] args) {

		Triangle tri = new Triangle(7, 8, 9);

		System.out.println("Периметр трикутника = " + String.format("%.2f", tri.halfPyrimeterTriangle()) + " см");
		System.out.println("Площа трикутника = " + String.format("%.2f", tri.areaTriangle()) + " см");

	}

}
