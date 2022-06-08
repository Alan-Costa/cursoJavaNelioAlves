import java.util.Scanner;

//

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double raio;
		double pi = 3.14159;
		double area;
		
		
		System.out.println("Digite o raio: ");
		raio = sc.nextDouble();
		
		area = pi * (raio*raio);
		
		System.out.printf("A área é de: %.4f%n ",area);
		
		
		
		sc.close();
		
	}

}
