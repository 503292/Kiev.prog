package TestReflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * аннотація яка приймає параметри для метода.
 * код для визову метода помічений цією анотацією і
 * передає параметри в визваний метод
 * 
 * */


public class Main {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		MyClass mc = new MyClass();
        Class<?> myClass = mc.getClass();
        Method[] methods = myClass.getDeclaredMethods();
        for (Method temp : methods) {
            if (temp.isAnnotationPresent(MyAnnotation.class)) {
            	MyAnnotation myAnnotation = temp.getAnnotation(MyAnnotation.class);
                temp.invoke(mc, myAnnotation.paramOne(), myAnnotation.paramTwo());
            }
        }
	}

}
