package SpringExperience;

import java.util.Scanner;

public class DesafioDeCodigoS1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        String[] nomes = new String[10];
        
        for(int i=0 ; i<10 ; i++)
     
               nomes[i] = scan.nextLine();
       
        
        System.out.println(nomes[2]);
        System.out.println("\n"+ nomes[6]);
        System.out.println("\n"+ nomes[8]);
        
       
}
}
