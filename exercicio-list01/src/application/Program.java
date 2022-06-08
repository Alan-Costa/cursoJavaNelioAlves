package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		List<String> list = new ArrayList<>();
		
		System.out.print("How many employees will be registred? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Employee #" +i+":");
			System.out.print("Id: ");
			sc.nextLine();
			String id = sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			String salary = sc.nextLine();
			System.out.println();
			
			
			
		}
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
