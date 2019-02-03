package beginner;

import java.util.Scanner;

public class GastoDeCombustível {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int velocidade, tempo;
		float combustivel;
		
		
		tempo = input.nextInt();
		velocidade = input.nextInt();
		
		combustivel = (velocidade * tempo);
		combustivel = combustivel / 12;
		
		
		System.out.printf("%.3f\n", combustivel);
		
		input.close();
	}

}
