package lesson9.Collection.GroupTask2;

public class Main {
	public static void main(String[] args) {

		Group gr = new Group("PN-121");
		try {
			gr.addStudent(new Student("Alex", "Ts", 19, true, 1234, "PN-121"));
			gr.addStudent(new Student("Ekaterina", "Rez", 18, false, 1253, "PN-121"));
			gr.addStudent(new Student("Alexey", "St", 20, true, 14523, "PN-121"));
			gr.addStudent(new Student("Irina", "Iv", 23, false, 12213, "PN-121"));
			gr.addStudent(new Student("Olga", "Cher", 17, false, 1243, "PN-121"));
			gr.addStudent(new Student("Andrey", "Pop", 18, true, 12123, "PN-121"));

		} catch (fullGroupException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(gr);
		gr.sortByParametr(0, false);
		System.out.println(gr);

//		 System.out.println();
//		 Student[] recruterArray = gr.getRecruter();
//		 for (Student student : recruterArray) {
//		 System.out.println("You are in army now " + student);
//		
//		 }
//		 try {
//		 gr.addStudentInteractive();
//		 } catch (fullGroupException e) {
//		 System.out.println(e.getMessage());
//		 }
//		 System.out.println(gr);
	}
}
