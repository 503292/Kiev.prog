package lesson3.task1;

public class Human {

	private String name;
	private String lastName;
	private int age;
	private boolean sex;

	public Human(String name, String lastName, int age, boolean sex) {
		super();
		this.name = name;
		this.age = age;
		this.lastName = lastName;
		this.sex = sex;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return ", name = " + name + ", lastName = " + lastName + ", age = " + age + ", sex = " + sex + "]";
	}
	

}
