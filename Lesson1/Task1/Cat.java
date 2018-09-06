package Lesson1.Task1;

public class Cat {

	private String color;
	private String name;
	private int age;

	public Cat(String color, String name, int age) {
		super();
		this.color = color;
		this.name = name;
		this.age = age;
	}

	public Cat() {
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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

	public String voice() {
		return "\"Mао-Мао\"";
	}

	@Override
	public String toString() {
		return "Cat [ колір кота - " + color + ", ім`я - " + name + ", повних років - " + age + ", І він говорить "
				+ voice() + "]";
	}

}
