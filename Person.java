package com.qa.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	private String jobTitle;

	public Person() {
	}

	public Person(String name, int age, String jobTitle) {

		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void findName() {
	Scanner scan = new Scanner(System.in); 
	
	System.out.println("Who are you looking for?");
	// user inputs answer here
	String choice = scan.nextLine();
	
	/*switch(choice) {
	
	case "Michael":
		System.out.println("name: Michael " + ", age: 33"  + ", job title: baller" + getJobTitle());
		break;
		
	case "Ronaldo":
		System.out.println("name: Ronaldo " + ", age: 35"  + ", job title: footballer" + jobTitle);
		break;
		
		default:
			System.out.println("Pick a name that exists: Michael, Ronaldo, Leonardo DiCaprio, Ibraheem");
			break;
	} */
	
	
	
	if(choice.equalsIgnoreCase(name)) {
		System.out.println("name: "+name + ", age: " + age + ", job title: " + jobTitle);
	}else {
		System.out.println("sorry mate idk");
	}
	
	}
	
	public void nameSearch(List<Person> x) {
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Who are you looking for?");
		// user inputs answer here
		String choice = scan.nextLine();
		
		for(Person p: x) {
			if(p.getName().equalsIgnoreCase(choice)) {
				System.out.println(p);
			}
		}
		
	}

	@Override
	public String toString() {
		return "Person \n[name= " + name + ", age= " + age + ", job title= " + jobTitle + "]";
	}
	
	
	

}
