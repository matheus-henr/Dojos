import java.util.Scanner;

public class Intervalo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double valor = input.nextDouble();
		
		if(valor >= 0 && valor <= 25.00) {
			System.out.println("Intervalo [0,25]");
		} else if(valor >= 25.001 && valor <= 50.00) {
			System.out.println("Intervalo (25,50]");
		} else if(valor >= 50.001 && valor <= 75.00) {
			System.out.println("Intervalo (50,75]");
		} else if(valor >= 75.001 && valor <= 100.00) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}
		
		input.close();
		
	}
}
