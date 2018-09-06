package Lesson1.Task3;

public class Network {

	private long[] base = new long[10];
	private int count;

	public Network() {
		super();
	}

	public boolean addPhonNum(long num) {
		for (int i = 0; i < base.length; i++) {
			if (base[i] == num) {
				System.out.println(num + "  вже існує в мережі");
				return false;
			}

		}
		base[count++] = num;
		System.out.println("номер " + num + " зареєстрований в мережі " );
	
		return true;
		
	}

	public long[] getBase() {
		return base;
	}

	public void setBase(long[] base) {
		this.base = base;
	}
}
