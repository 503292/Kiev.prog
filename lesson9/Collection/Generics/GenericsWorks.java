package lesson9.Collection.Generics;

public class GenericsWorks <T extends Comparable<T>>{
	
	private T field;

	public GenericsWorks(T field) {
		super();
		this.field = field;
	}

	public GenericsWorks() {
		super();
	}

	public T getField() {
		return field;
	}

	public void setField(T field) {
		this.field = field;
	}

	@Override
	public String toString() {
		return "SomeClass [field=" + field + "]";
	}
	
	

}
