package Lesson1.Task2;

public class Triangle {

	private double x;
	private double y;
	private double z;
	private double p; // пів пириметр


	public Triangle() {
	}

	public Triangle(int x, int y, int z) {

		this.x = x;
		this.y = y;
		this.z = z;
	}

	// розрахунок Площі трикутника
	public double areaTriangle() {

	

		return Math.sqrt(p * (p - x) * (p - y) * (p - z));
	}

	// розрахунок Півпериметра трикутника
	public double halfPyrimeterTriangle() {

		p = (x + y + z) / 2;

		return p;

	}

}
