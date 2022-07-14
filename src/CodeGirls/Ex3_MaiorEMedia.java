package CodeGirls;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3_MaiorEMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double soma = 0;
		double media = 0;
		double maior = 0;

		int count = 0;

		do {
			System.out.print("Digite o numero: ");
			double numero = scan.nextDouble();

			soma = soma + numero;
			media = soma / 5;
			count = count + 1;
			
			if (numero > maior) {
				maior = numero;
			}

					
		} while (count < 5);

		System.out.println(" Maior numero: " + maior);
		System.out.println(" Media dos numeros: " + media);

	}
}