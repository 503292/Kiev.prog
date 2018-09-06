package Lesson1.Task1;

public class CatStart {

	public static void main(String[] args) {
		Cat one = new Cat("Сірий", "Барсік", 2);
		System.out.println(one);
		System.out.println(" - " + one.getName() + " скажи ГАВ ");
		System.out.println(" - ?!?   " + one.voice());
		System.out.println(" - в тебе майже получилось " + one.getName());

		System.out.println("");

		Cat two = new Cat("Чорний", "Карл", 5);
		System.out.println(two);
		System.out.println(" - " + two.getName() + " скажи ГАВ ");
		System.out.println(" - ?!?   " + two.voice());
		System.out.println(" - в тебе майже получилось " + two.getName());
	}

}
