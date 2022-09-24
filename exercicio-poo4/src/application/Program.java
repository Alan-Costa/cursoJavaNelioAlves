package application;

import java.util.Scanner;

import utilities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter conv = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		conv.dolarCotation = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		conv.dolarQuantity = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = R$ %.2f",conv.dolarConverter());

	}

}
