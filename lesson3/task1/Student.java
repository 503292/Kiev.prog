package lesson3.task1;

public class Student extends Human {

	private int zachotka;
	private String group;

	public Student(String name, String lastName, int age, boolean sex, int zachotka, String group) {
		super(name, lastName, age, sex);
		this.zachotka = zachotka;
		this.group = group;
	}

	public Student() {
		super();
	}

	public int getZachotka() {
		return zachotka;
	}

	public void setZachotka(int zachotka) {
		this.zachotka = zachotka;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Student [zach = " + zachotka + ", group = " + group + super.toString();
	}
	

}
