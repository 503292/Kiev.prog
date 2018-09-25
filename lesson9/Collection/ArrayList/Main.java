package lesson9.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> myList = new ArrayList<>();
		
		//додавання
		myList.add("hello");
		myList.add("Java");
		myList.add("Go");
		
		//сортування
		Collections.sort(myList);
		
		System.out.println(myList);
		
		//вклинювання
		myList.add(1, "SHARP");
		System.out.println(myList);
		
		//виведення по індексу
		String text = myList.get(0);
		System.out.println(text);
		
		//видалення
		myList.remove(2);
		System.out.println(myList);
	
		//перезаписати даны по індексу
		myList.set(0, "One");
		System.out.println(myList);
		
		//вирізання (копіювання)
		List<String> listTwo = myList.subList(0, 2);
		System.out.println(listTwo);
	
		//вивести по кожному елементу через foreach
		for(String element : myList) {
			System.out.println(element);
		}
		
		//вивести по кожному елементу Iтератор
		
		Iterator<String> itr = myList.iterator();
		
		for(;itr.hasNext();) {
			String element = itr.next();
			if(element.equals("One")) {
				itr.remove();
			}
				
			System.out.println(element);
		}
		System.out.println();
		System.out.println(myList);
		
		
	}

}
