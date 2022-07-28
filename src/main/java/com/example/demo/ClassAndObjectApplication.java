package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

    // Class like a Blueprint
class Calculator {

	// Instance variables
	int number1;
	int number2;
	int result;

	public void add()
	{
		result = number1 + number2;
	}

}
@SpringBootApplication
public class ClassAndObjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassAndObjectApplication.class, args);
		// classname var(object name)  = new classname()
		Calculator obj = new Calculator(); //knows something and does something
		obj.number1 = 1;
		obj.number2 = 1;
		obj.add();
		System.out.println("Total :"+ obj.result);
	}

}
