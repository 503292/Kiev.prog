package lesson9.Collection.LinkedList;

import java.util.LinkedList;

public class Example {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();

		names.add("Tom");
		names.add("George");
		names.add("Jon");
	
		names.add(1, "Alex");

		

		for (String s : names) {
			System.out.println(s);
		}

	}

}
