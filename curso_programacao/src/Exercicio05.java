import java.util.Scanner;

//Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o 
//c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, nump1, nump2;
		double valor1, valor2, totalPay;
		
		
		cod1 = sc.nextInt();
		nump1 = sc.nextInt();
		valor1 = sc.nextDouble();
		cod2 = sc.nextInt();
		nump2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		totalPay = (nump1 * valor1) + (nump2 * valor2);
		
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalPay);
		
		sc.close();
	}

}
