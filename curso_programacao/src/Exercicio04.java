import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		double salary;
		double workingHours;
		double valuePerHour;
		
		
		System.out.println("Digite o número do funcionário: ");
		number = sc.nextInt();
		System.out.println("Informe o valor da hora trabalhada :");
		valuePerHour = sc.nextDouble();
		System.out.println("Informa a quantidade de horas trabalhadas :");
		workingHours = sc.nextDouble();
		
		salary = valuePerHour * workingHours;
		
		System.out.println("NUMBER = "+number);
		System.out.printf("SALARY = U$ %.2f",salary);
		
		sc.close();
	}

}
