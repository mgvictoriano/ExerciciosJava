package CodeGirls;
import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/



public class Ex4_ParEImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int numeroPar = 0;
		int numeroImpar = 0;
		int quantNumeros;
		int count = 0;
		
		System.out.println("Quantidade de números");
		quantNumeros = scan.nextInt();
		
		do { 
			
			System.out.println("Numero: ");
			numero = scan.nextInt();
			
			if (numero % 2 == 0) numeroPar++;
			else numeroImpar++;
			
			count++;
			
		} while(count < quantNumeros);
		
		System.out.println("Quantidade de numeros Par: " + numeroPar);
		System.out.println("Quantidade de numeros Impar: " + numeroImpar);
		
			
		}
	}
