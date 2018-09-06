package Lesson1.Task4;

public class VectorMain {

	public static void main(String[] args) {

		Vector3D firstV = new Vector3D(4.3, 5, 2.8);
		Vector3D secondV = new Vector3D(5, 7.5, 4);
		Vector3D thirdV = new Vector3D();
		Vector3D fourthV = new Vector3D();
		firstV.setX(4.3);
		fourthV.addVector(firstV, secondV);
		System.out.println(fourthV.getX());
		System.out.println(fourthV.getY());
		System.out.println(fourthV.getZ());
		double scalar = firstV.multScalar(firstV, secondV);
		System.out.println(scalar);
		thirdV.multVector(firstV, secondV);
		System.out.println(thirdV.getX());
		System.out.println(thirdV.getY());
		System.out.println(thirdV.getZ());
	}

}
