package beginner;

import java.util.Scanner;

public class Distância {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int km, tempo;
		
		km = input.nextInt();
		
		tempo = (60 * km) / 30;
		
		System.out.printf("%d minutos\n", tempo);
		
		input.close();
	}
	
}
