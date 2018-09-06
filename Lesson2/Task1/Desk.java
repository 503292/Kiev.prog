package Lesson2.Task1;

import java.util.Arrays;

public class Desk {
	private Shape[] shapes = new Shape[4];

	public Desk(Shape[] shapes) {
		super();
		this.shapes = shapes;
	}

	public Desk() {
		super();
	}

	public void addShape(Shape shape) {
		for (int i = 0; i < 4; i++) {
			if (shapes[i] == null) {
				this.shapes[i] = shape;
				return;
			}
			
		}
		System.out.println("please delete any shape - array is full");
	}

	public void deleteShape(int d) {
		if ((d >= 0) && (d < 4) && (this.shapes[d] != null)) {
			this.shapes[d] = null;
		} else {
			System.out.println("Incorrect input or element is null");
		}

	}

	// But this not work - we need to redefine Object methods(equals, hashCode)
	public void deleteShape(Shape shape) {
		for (int i = 0; i < 4; i++) {
			if (shape.equals(this.shapes[i])) {
				this.shapes[i] = null;
				return;
			}
		}
		System.out.println("Nothing find");
	}

	public double allArea() {

		double area = 0.0;
		for (int i = 0; i < 4; i++) {
			if (this.shapes[i] != null) {
				area += this.shapes[i].getArea();

			}

		}
		return area;

	}

	@Override
	public String toString() {
		String result = "";

		for (int i = 0; i < 4; i++) {
			if (this.shapes[i] != null) {
				result += this.shapes[i] + "\n \r";

			}

		}

		return "Desk [shapes=\n \r" + result + "]";

	}

}
