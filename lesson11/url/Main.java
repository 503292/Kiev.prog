package lesson11.url;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		String addres = "https://prog.kiev.ua/forum/";
		String text = "";

		try {
			text = NetWork.loadStringFromURL(addres, "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(text);
	}
}
