package fr.eni.ecole.gradletest2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Gradletest2Application {

	public static void main(String[] args) {
		SpringApplication.run(Gradletest2Application.class, args);
		System.out.println("Hello Gradle");
	}

}
