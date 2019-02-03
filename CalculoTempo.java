package beginner;

import java.util.Scanner;

public class CalculoTempo {

	public static void main(String[] args) {
		
		int tempo, hora = 0 , minutos = 0, segundos = 0;
		
		Scanner input = new Scanner(System.in);
		
		
		tempo = input.nextInt();
		input.close();
		
		if(tempo >= 3600) {
			hora = tempo / 3600;
			minutos = (tempo % 3600)/60;
		}else {
			minutos = tempo / 60;
		}
		
		segundos = tempo % 60;
		
		System.out.printf("%d:%d:%d\n",hora,minutos,segundos);
	}
}
