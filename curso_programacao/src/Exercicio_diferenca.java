import java.util.Scanner;

//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)

public class Exercicio_diferenca {

	public static void main(String[] args) {
		
		int a,b,c,d;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1° número :");
		a = sc.nextInt();
		System.out.println("Digite o 2° número :");
		b = sc.nextInt();
		System.out.println("Digite o 3° número :");
		c = sc.nextInt();
		System.out.println("Digite o 4° número :");
		d = sc.nextInt();
		double diferenca = ((a*b) - (c*d));
		System.out.println("A diferença do produto de A e B pelo produto de C e D é "+diferenca);
		
		
		sc.close();
	}

}
