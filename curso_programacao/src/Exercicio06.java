import java.util.Scanner;

/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre: 
a) a área do triângulo retângulo que tem A por base e C por altura. 
b) a área do círculo de raio C. (pi = 3.14159) 
c) a área do trapézio que tem A e B por bases e C por altura. 
d) a área do quadrado que tem lado B. 
e) a área do retângulo que tem lados A e B. */

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*double a, b, c;
		double triangulo, circulo, trapezio, quadrado, retangulo;
		double pi = 3.14159;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		triangulo = a * c / 2.0;
		circulo =  c * c * pi ;
		trapezio = (a + b) /2.0 * c;
		quadrado = b * b;
		retangulo = a * b;
		
		System.out.printf("TRIANGULO %.3f%n", triangulo);
		System.out.printf("CÍRCULO %.3f%n", circulo);
		System.out.printf("TRAPÉZIO %.3f%n", trapezio);
		System.out.printf("QUADRADO %.3f%n", quadrado);
		System.out.printf("RETANGULO %.3f%n", retangulo);
		*/
		
		
		int n = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for(int i=0; i<n; i++) {
			int soma = sc.nextInt();
			if (soma >=10 && soma <=20) {
				in = in + 1;
			} else {
				out = out + 1;
			}
		}
		System.out.println(in + "in");
		System.out.println(out + "out");
		sc.close();
		

	}

}
