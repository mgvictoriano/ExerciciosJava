package CodeGirls;

import java.io.IOException;
import java.util.Scanner;

public class DesafioDeCodigo3 {

	public static void main(String[] args) throws IOException {
	 
	            Scanner scan = new Scanner(System.in);
	            String[] nomes = new String[5];
	            
	            for (int i = 0; i < nomes.length; i++)
	            {
		                nomes[i] = scan.nextLine();
	            }
	 
	            int pos = scan.nextInt();
	            System.out.println(nomes[pos]);
	           
	    }
}
