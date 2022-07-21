package CodeGirls;

import java.util.Scanner;

public class DesafioDeCodigo4 {

	public static void main(String[] args) {
  		Scanner scan = new Scanner(System.in);
 
  		double pi = 3.14159;
  		double R = scan.nextDouble();
  		double volume = (4/3.0) * pi * (Math.pow(R, 3.0));
  		
  		System.out.printf("VOLUME = %.3f%n", volume);
    }
	
}