package lesson9.Collection.ArrayList1;

import java.util.ArrayList;

public class Examples {

	public static void main(String[] args) {
		
		ArrayList<Integer> someDyn = new ArrayList<>();
		
		someDyn.add(56);
		someDyn.add(6);
		someDyn.add(5);
		someDyn.add(7);
		someDyn.add(435);
		someDyn.add(8);
		
		someDyn.remove(5);


		for(Integer x : someDyn) {
			System.out.println(x);
		}
		

	}

}
