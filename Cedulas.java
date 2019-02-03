package beginner;

import java.util.Scanner;

public class Cedulas {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int resto, qtdNotas;
		int notas[] = {100, 50, 20, 10, 5, 2, 1};
		
		resto = input.nextInt();
		input.close();
		
		
		System.out.printf("%d\n", resto);
		
		for(int i = 0; i < notas.length; i++) {
			qtdNotas = resto / notas[i];
			resto = resto % notas[i];
			
			
			System.out.printf("%d nota(s) de R$ %d,00\n", qtdNotas, notas[i]);
			
		}
		
	}
	
	
}
