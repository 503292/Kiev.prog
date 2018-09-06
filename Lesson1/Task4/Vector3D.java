package Lesson1.Task4;

/*
 * Задача 3.
 * Описать класс «Vector3d» (т. е., он должен описывать 
 * вектор в трехмерной, декартовой системе координат). 
 * В качестве свойств этого класса возьмите координаты 
 * вектора. Для этого класса реализовать методы сложения, 
 * скалярного и векторного произведения векторов. Создайте 
 * несколько объектов этого класса и протестируйте их.
 */



public class Vector3D {

	private double x;
	private double y;
	private double z;

	public Vector3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector3D() {

	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}
	
	/**
	 * The method implements the operation of adding two vectors in a
	 * three-dimensional coordinate system;
	 * @param u - first vector (Vector3d class object);
	 * @param v - second vector (Vector3d class object);
	 * @return - object of the Vector3d class - result of the adding; 
	 */
	public Vector3D addVector(Vector3D u, Vector3D v) {
		return new Vector3D(this.x = u.x + v.x, this.y = u.y + v.y, 
				this.z = u.z + v.z);
	}
	
	/**
	 * The method implements the operation of scalar multiplication of a two 
	 * vectors in a three-dimensional coordinate system;
	 * @param u - first vector (Vector3d class object);
	 * @param v - second vector (Vector3d class object);
	 * @return double variable - result of the operation;
	 */
	public double multScalar(Vector3D u, Vector3D v) {
		return ((u.x * v.x) + (u.y * v.y) + (u.z * v.z));
	}
	
	/**
	 * The method implements the operation of vector multiplication of a two 
	 * vectors in a three-dimensional coordinate system;
	 * @param u - first vector (Vector3d class object);
	 * @param v - second vector (Vector3d class object);
	 * @return object of the Vector3d class - result of the multiplication;
	 */
	public Vector3D multVector(Vector3D u, Vector3D v) {
		return new Vector3D(
				this.x = (u.y * v.z) - (u.z * v.y), 
				this.y = (u.z * v.x) - (u.x * v.z),
				this.z = (u.x * v.y) - (u.y * v.x));
	}

}