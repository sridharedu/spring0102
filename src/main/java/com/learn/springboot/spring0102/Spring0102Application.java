package com.learn.springboot.spring0102;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class Spring0102Application {


    public static void main(String[] args) {
		SpringApplication.run(Spring0102Application.class, args);

		//will code here

        Person person1 = new Person(32, "Sridhar", new Department("1", "ece"));
		Person person2 = new Person(32, "Sowjanya", new Department("2", "AGBSC"));
		Person person3 = new Person(32, "Nanda", new Department("3", "LKG"));
		Person person4 = new Person(32, "Hansvi", new Department("4", "Play"));


		System.out.println(person1.age);

		List<Person> personList = new ArrayList<>();

		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);

		//Arrays.stream(personList).map...so on..

		// Use streams for various operations
		personList.stream()
				.map(person -> person.getName() + " works in " + person.getDept().getDeptName())
				.forEach(System.out::println);

		Set<Person> synchronizedPersonSet = Collections.synchronizedSet(new HashSet<>());

		Department department1 = new Department("1", "ece");
		Department department2 = new Department("2", "AGBSC");

		synchronizedPersonSet.add(person1);
		synchronizedPersonSet.add(person2);
		synchronizedPersonSet.add(person3);
		synchronizedPersonSet.add(person4);

		// Iterate and print the synchronized set
		synchronizedPersonSet.forEach(person -> System.out.println(person.name + " works in " + person.getDept().getDeptName()));




	}


}
