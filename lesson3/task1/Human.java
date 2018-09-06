package lesson3.task1;

public class Human {

	private String name;
	private int age;

	public void getInfoHuman() {
		System.out.println(this.name + " " + this.age);
	}

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Human() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
