package lesson9.Collection.ListTask4;

import java.util.ArrayList;
import java.util.List;

public class QueueForGlass {

	public final static int NUMBER_OF_GLASSES = 2;

	public static  List<String> queue = new ArrayList<String>();
	
	public static void main(String[] args ) {
		init();
		System.out.println(queue);
		System.out.println();
		for(int i = 0; i < NUMBER_OF_GLASSES; i++) {
			takeGlass();
			
		}
		System.out.println(queue);
		
	}
	
	public static void init() {
		queue.add("Sheldon");
		queue.add("Leonard");
		queue.add("Volovitc");
		queue.add("Kutrapalli");
		queue.add("Penny");

	}

	public static void takeGlass() {
		String drinker = queue.get(0);
		queue.add(drinker);
		queue.add(drinker);
		queue.remove(0);
	}
	
	
	
}
