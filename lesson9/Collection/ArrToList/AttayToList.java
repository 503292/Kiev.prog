package lesson9.Collection.ArrToList;

import java.util.Arrays;
import java.util.List;

public class AttayToList {
	
	

	public static void main(String[] args) {

		//приведення масива в List
		
		String[] a = {"111", "222", "333"};
		
		List <String> list = Arrays.asList(a);
		for(String s : list) {
			System.out.println(s);
		}

	}

}
