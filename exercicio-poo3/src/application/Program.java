package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student stud = new Student();
		stud.name = sc.nextLine();
		stud.note1 = sc.nextDouble();
		stud.note2 = sc.nextDouble();
		stud.note3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f",stud.finalNote());
		System.out.println();
		
		if (stud.finalNote()<60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS",stud.missingPoints());
		} else {
			System.out.println("PASS");
		}
			
			
		sc.close();
	}

}
