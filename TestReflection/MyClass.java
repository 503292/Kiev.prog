package TestReflection;

public class MyClass {


	@MyAnnotation(paramOne=5,paramTwo=10)
	public void printConsole(int a, int b) {
		System.out.println(a + b);

	}
}
