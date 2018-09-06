package Lesson1.Task3;

public class MainNetwork {

	public static void main(String[] args) {

		Network life = new Network();

		Phone myPhone = new Phone(38063000000L, life);
		System.out.println("Мій номер " + myPhone.getNumberP());
		myPhone.registration();
		

		Phone samsung = new Phone(38093333333L, life);
		samsung.registration();

		Phone alcatel = new Phone(38093444444L, life);
		alcatel.registration();
		
		Phone hts = new Phone(38093444444L, life);
		hts.registration();

		
	
        myPhone.call(samsung.getNumberP());
        myPhone.call(alcatel.getNumberP());

	}
}
