package lesson3.task1;

public class Student extends Human {
	
	private String name;
	private int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Student() {
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

	@Override
	public void getInfoHuman() {
		System.out.println("Student " + this.name + " " + this.age);

	}

	@Override
	public String toString() {
		return "\n \r [name=" + name + ", age=" + age + "]";
	}

}
