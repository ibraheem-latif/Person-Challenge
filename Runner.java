package com.qa.challenge;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		
		Person random = new Person();
		Person michael = new Person("Michael", 33, "basketballer");
		Person ronaldo = new Person("Ronaldo", 35, "footballer");
		Person leo = new Person("Leonardo DiCaprio", 42, "actor");
		Person ibby = new Person("Ibraheem", 21, "baller");

		List<Person> people = new ArrayList<>();

		people.add(michael);
		people.add(ronaldo);
		people.add(leo);
		people.add(ibby);

		for(Person p:people)
		{
			System.out.println(p);
		}
		
		
		System.out.println("===========================");
		
		random.nameSearch(people);
	
		
		
	
	
		
		
		

		
		
	}


}
