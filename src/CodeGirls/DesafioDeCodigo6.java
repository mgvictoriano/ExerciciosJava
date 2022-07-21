package CodeGirls;

import java.util.Scanner;

public class DesafioDeCodigo6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

             int habitantes = scan.nextInt();
             int brancos = scan.nextInt();
            int nulos = scan.nextInt();
            int validos = scan.nextInt();     


        int pBrancos = ((brancos * 100) / habitantes);
        int pNulos = ((nulos * 100)/habitantes);
        int pValidos = ((validos * 100)/habitantes);


        System.out.println("Brancos: " + pBrancos + "%");

        System.out.println("Nulos: " + pNulos + "%");

        System.out.println("Validos: " + pValidos + "%");
	}
}
