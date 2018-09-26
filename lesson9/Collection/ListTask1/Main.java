package lesson9.Collection.ListTask1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Main {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		fillList(myList);
		System.out.println(myList);

		changeList(myList);
		System.out.println(myList);
		
		//Cортування через  Collections
		Collections.sort(myList);
		System.out.println(myList);
		

	}
	
	public static void fillList(List<Integer> myList) {
		for(int i = 0; i < 10; i++) {
			myList.add((int)(Math.random() * 100));
			
		}
	}
	public static void changeList(List<Integer> myList) {
		myList.remove(0);
		myList.remove(0);
		myList.remove(myList.size() - 1);
	}

}
