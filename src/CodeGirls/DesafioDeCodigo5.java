package CodeGirls;

import java.util.Scanner;

public class DesafioDeCodigo5 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
			
		System.out.println("Insira o valor o desconto: ");
		int desconto = scan.nextInt();
           
		System.out.println("\nInsira o valor original: ");
		int precoAntigo = scan.nextInt();
           

        int precoNovo = precoAntigo - (precoAntigo * desconto/100);
         
        System.out.println("Valor promocional: " + precoNovo);
        
	}
}