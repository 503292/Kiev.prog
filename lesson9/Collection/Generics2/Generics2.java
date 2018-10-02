package lesson9.Collection.Generics2;

public class Generics2<E> {
	
	private E[] value;

	public E[] getValue() {
		return value;
	}

	public void setValue(E[] value) {
		this.value = value;
	}
	
	public E get(int index) {
		return value[index];
	}
	
	Generics2<Integer> m = new Generics2<>();
	

}
