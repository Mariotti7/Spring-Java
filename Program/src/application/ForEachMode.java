package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForEachMode {

	public static void main(String[] args) {

		// How many employees will be registered? 3
		// Employee #1:
		// Id: 333
		// Name: Maria Brown
		// Salary: 4000.00

		// Employee #2:
		// Id: 752
		// Name: John Blur
		// Salary: 2000.00
		
		// Employee #3:
		// Id: 536
		// Name: Corne Flake
		// Salary: 3000.00

		// Enter the employee id that will have salary increase: 536
		// if the id does not exist send the message
		// Enter the percentage: 10.0

		// List of employees:
		// 333, Maria Brown, 4000.00
		// 752, John Blur, 2000.00
		// 536, Corne Flake, 3000.00
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int register = sc.nextInt();
		
		System.out.print("\nID: ");
		int id = sc.nextInt();
		
		System.out.print("\nName: ");
		String name = sc.next();
		
		System.out.print("\nSalary: ");
		Double salary = sc.nextDouble();
		System.out.println();
		
		List<String> listName = new ArrayList<>();
		List<Integer> listOfEmployees = new ArrayList<>();
		List<Integer> listOfId = new ArrayList<>();
		List<Double> listOfSalary = new ArrayList<>();
		
		listOfEmployees.add(register);
		listOfId.add(id);
		listName.add(name);
		listOfSalary.add(salary);
		
		System.out.println(listOfId);
		System.out.println(listName);
		System.out.println(listOfEmployees);
		System.out.println(listOfSalary);
		
		
		sc.close();
	}

}
