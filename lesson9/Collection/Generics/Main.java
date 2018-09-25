package lesson9.Collection.Generics;

public class Main {

	public static void main(String[] args) {

		GenericsWorks<Integer> a = new GenericsWorks<>(10);

		int number = (Integer) a.getField() + 5;
		System.out.println(number);

		GenericsWorks<String> b = new GenericsWorks<>("Helow world!!!");
		b.setField("10");
		String str = b.getField();
		System.out.println(str);

		Integer[] array = new Integer[] { 0, 4, -4, 5 };
		Integer min = getMin(array);
		System.out.println(min);

		String[] arrayTwo = new String[] { "a", "A", "G" };
		String minTwo = getMin(arrayTwo);
		System.out.println(minTwo);
	}

	//метод визначення мінімального значення
	public static <T extends Comparable<T>> T getMin(T[] array) {
		T min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i].compareTo(min) < 0) {
				min = array[i];
			}
		}
		return min;

	}

}
