import java.util.Scanner;

//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto 
//de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D)

public class Exercicio_diferenca {

	public static void main(String[] args) {
		
		int a,b,c,d;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1� n�mero :");
		a = sc.nextInt();
		System.out.println("Digite o 2� n�mero :");
		b = sc.nextInt();
		System.out.println("Digite o 3� n�mero :");
		c = sc.nextInt();
		System.out.println("Digite o 4� n�mero :");
		d = sc.nextInt();
		double diferenca = ((a*b) - (c*d));
		System.out.println("A diferen�a do produto de A e B pelo produto de C e D � "+diferenca);
		
		
		sc.close();
	}

}
