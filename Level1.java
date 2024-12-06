package edu.esprit.game.levels;

import edu.esprit.game.models.Employee;
import edu.esprit.game.utils.Data;

import java.util.Comparator;
import java.util.List;

public class Level1 {
	public static void main(String[] args) {
		// Fetch the list of employees
		List<Employee> employees = Data.employees();

		// TO DO 1: Display all employees
		System.out.println("All employees:");
		employees.stream().forEach(System.out::println);

		// TO DO 2: Display employees whose names start with the letter 'n'
		System.out.println("\nEmployees whose names start with 'n':");
		employees.stream()
				.filter(e -> e.getName().toLowerCase().startsWith("n"))
				.forEach(System.out::println);

		// TO DO 3: Display employees whose names start with the letter 'n' and salary > 1000
		System.out.println("\nEmployees whose names start with 'n' and salary > 1000:");
		employees.stream()
				.filter(e -> e.getName().toLowerCase().startsWith("n"))
				.filter(e -> e.getSalary() > 1000)
				.forEach(System.out::println);

		// TO DO 4: Display employees whose names start with the letter 's' sorted by salary
		System.out.println("\nEmployees whose names start with 's', sorted by salary:");
		employees.stream()
				.filter(e -> e.getName().toLowerCase().startsWith("s"))
				.sorted(Comparator.comparing(Employee::getSalary))
				.forEach(System.out::println);

		// TO DO 5: Display names of employees whose salary > 600 in two different ways

		// First Way
		System.out.println("\nEmployee names with salary > 600 (First Way):");
		employees.stream()
				.filter(e -> e.getSalary() > 600)
				.forEach(e -> System.out.println(e.getName()));

		// Second Way
		System.out.println("\nEmployee names with salary > 600 (Second Way):");
		employees.stream()
				.filter(e -> e.getSalary() > 600)
				.map(Employee::getName)
				.forEach(System.out::println);

		// TO DO 6: Add 200 to the salary of employees whose names start with 'm' and display them
		System.out.println("\nEmployees whose names start with 'm', with updated salaries:");
		employees.stream()
				.filter(e -> e.getName().toLowerCase().startsWith("m"))
				.peek(e -> e.setSalary(e.getSalary() + 200)) // Update salary
				.forEach(System.out::println);
	}
}
