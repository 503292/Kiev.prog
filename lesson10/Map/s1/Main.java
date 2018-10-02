package lesson10.Map.s1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Map<Integer, String> myMap = new HashMap<>();

		// додавання обэктів в Мар трьох пар.
		myMap.put(2, "two");
		myMap.put(5, "five");
		myMap.put(1, "one");

		System.out.println(myMap);
		
		Set<Map.Entry<Integer, String>> set = myMap.entrySet();
		for(Map.Entry<Integer, String>entry : set)
			System.out.println(entry.getKey() + "  = " + entry.getValue());

		// виведення значення по ключу
		String text = myMap.get(5);
		System.out.println(text);

		// метод для отримання набора ключів
		Set<Integer> keys = myMap.keySet();
		for (Integer key : keys) {
			System.out.println(key + " -> " + myMap.get(key));
		}
		//виводить скільки разів значення повторялось по ключю;
		System.out.println(Collections.frequency(keys, 5));
		
		
		// виведення набора ключів
		System.out.println(keys);

		
		//Затерання значення	
		myMap.put(1, "Tree");
		System.out.println(myMap);
		
		//видалення данних по ключю
		myMap.remove(1);
		System.out.println(myMap);
	}

}
