package lesson3.task1;


public class Main {
	public static void main(String[] args) {
		Group go = new Group("FBI - 17");

		
		// Добавляєм 10 студентів
		try {
			go.addStudent(new Student("Petro", "Ivanov", 20, true, 3030, "FBI - 18"));
			go.addStudent(new Student("Inna", "Popova", 20, false, 1111, "FBI - 18"));
			go.addStudent(new Student("Maxym", "Iv", 21, true, 2222, "FBI - 18"));
			go.addStudent(new Student("Sergiy", "Cho", 29, true, 3333, "FBI - 18"));
			go.addStudent(new Student("Pavel", "Sho", 23, true, 4444, "FBI - 18"));
			go.addStudent(new Student("Taras", "Div", 28, true, 5555, "FBI - 18"));
			go.addStudent(new Student("Scot", "Moon", 21, true, 6666, "FBI - 18"));
			go.addStudent(new Student("Bilbo", "Boo", 24, true, 7777, "FBI - 18"));
			go.addStudent(new Student("Garik", "Shmel", 24, true, 8888, "FBI - 18"));
			go.addStudent(new Student("Eva", "Braun", 25, false, 2121, "FBI - 18"));	
		} catch (fullGroupException e) {
			System.out.println(e.getMessage());
		}
		
		// Виводим список групи
		System.out.println(go);
		
		// удаляєм студента по номеру заліковки 7777
		go.delStudent(7777);
	
		// Добавляєм 1-го студента на пусте місце
		try {
		go.addStudent(new Student("Sheldon", "Cupper", 30, true, 1010, "FBI - 18"));
		}catch(fullGroupException e) {
			System.out.println(e.getMessage());
		}
		// Виводим список групи
		System.out.println(go);
		
		
		//Шукаєм студента в списку по прізвищу
		Student st = go.findStudent("Boo");  // цей студент був видалений 7777
		Student st1  = go.findStudent("Shmel");
		
		//Виводим на екран результат пошуку
		System.out.println(st);
		System.out.println(st1);
		
	}
}
