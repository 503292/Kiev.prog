package TestReflection;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(value=RetentionPolicy.RUNTIME)
@Target(value=ElementType.METHOD)

public @interface MyAnnotation {
	int paramOne() default 1;
    int paramTwo() default 3;
}
