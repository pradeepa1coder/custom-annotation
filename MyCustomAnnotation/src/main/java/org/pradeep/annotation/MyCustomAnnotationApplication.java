package org.pradeep.annotation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyCustomAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCustomAnnotationApplication.class, args);
		System.err.println("IT'S WORKING FINE");
	}

}
