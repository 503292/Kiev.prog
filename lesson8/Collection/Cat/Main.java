package lesson8.Collection.Cat;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {

		Cat cat1 = new Cat("Жора", "чорний", 5);
		Cat cat2 = new Cat("Жора", "чорний", 5);

		System.out.println(cat1);
		System.out.println(cat1.hashCode());
		System.out.println(cat2.hashCode());
		System.out.println();
		System.out.println(cat1 == cat2);
		System.out.println(cat1.equals(cat2));
		System.out.println();
		Cat cat3 = null;

		try {
			cat3 = cat1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(cat1 == cat3);
		System.out.println(cat1.equals(cat3));
		System.out.println();

		Class catClass = Cat.class;
		Class catClass1 = cat1.getClass();

		// опис полів в класах (модифікатор доступа, тип, адрес )
		Field[] catField = catClass.getDeclaredFields();
		for (int i = 0; i < catField.length; i++) {
			System.out.println(catField[i]);
		}
		System.out.println();
		// опис методів в класах (модифікатор доступа, тип, адрес )
		Method[] catMethod = catClass.getDeclaredMethods();
		for (int i = 0; i < catMethod.length; i++) {
			System.out.println(catMethod[i]);
		}
		System.out.println();
		// опис конструктора в класах
		Constructor<?>[] catConstractor = catClass.getDeclaredConstructors();
		for (int i = 0; i < catConstractor.length; i++) {
			System.out.println(catConstractor[i]);
		}
		System.out.println();

		try {
			Field catAge = catClass.getDeclaredField("age");
			catAge.setAccessible(true);
			catAge.setInt(cat1, 100500);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		System.out.println(cat1);

		// Серіалізація збереження інформації в файл
		
		File file = new File("cat.dat");

		try {
			SerialisableClassWork.saveObjectToField(cat1, file);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Серіалізація ВІДНОВЛЕННЯ інформації з файла
		
		Cat cat5 = null;

		try {
			cat5 = (Cat) SerialisableClassWork.loadObjectFromFile(file);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Cat 5 = " + cat5);

	}

}
