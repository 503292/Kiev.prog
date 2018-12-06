package TestReflection;

public class MyClass {
	public int sum(int a, int b) {
		return (a + b);
	}

	@MyAnnotation(paramOne=10,paramTwo=10)
	public void printConsole(int a, int b) {
		System.out.println(sum(a,b));

		
	}
	@MyAnnotation
	public void printConsole2(int a, int b) {
		System.out.println(sum(a,b));
	}

}
