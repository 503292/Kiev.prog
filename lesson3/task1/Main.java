package lesson3.task1;

public class Main {
	public static void main(String[] args) {
		Group gogo = new Group();
		
		Student st1 = new Student("Petro", 23);
		Student st2 = new Student("Inna", 20);
		Student st3 = new Student("Maxym", 21);
		Student st4 = new Student("Sergiy", 29);
		Student st5 = new Student("Pavel", 23);
		Student st6 = new Student("Taras", 28);
		Student st7 = new Student("Scot", 21);
		Student st8 = new Student("Bilbo", 24);
		Student st9 = new Student("Garik", 24);
		Student st10 = new Student("Eva", 25);
		Student st11 = new Student("Sheldon", 30);
	
		gogo.addStudent(st1);
		gogo.addStudent(st2);
		gogo.addStudent(st3);
		gogo.addStudent(st4);
		gogo.addStudent(st5);
		gogo.addStudent(st6);
		gogo.addStudent(st7);
		gogo.addStudent(st8);
		gogo.addStudent(st9);
		gogo.addStudent(st10);
		gogo.delStudent(0);
		gogo.addStudent(st11);
	
		
		System.out.println(gogo);
	}
}
