package lesson9.Collection.ArrToList;

import java.util.ArrayList;
import java.util.List;

public class ArrToList2 {

	// приведення масива в List

	static <T> List<T> arrayToList(T[] a) {
		List<T> res = new ArrayList<T>(a.length);

		for (T t : a)
			res.add(t);
		return res;

	}

	public static void main(String[] args) {

		String[] a = { "111", "222", "333" };

		List<String> list = arrayToList(a);
		for (String s : list) {
			System.out.println(s);
		}

	}

}
