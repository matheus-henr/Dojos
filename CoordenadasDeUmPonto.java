import java.util.Scanner;

public class CoordenadasDeUmPonto {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double pontoX, pontoY;
		
		pontoX = input.nextDouble();
		pontoY = input.nextDouble();
		
		
		if(pontoX == 0.0 && pontoY == 0.0) {
			System.out.println("Origem");
		} 
		else if(pontoX > 0.0 && pontoY > 0.0) {
			System.out.println("Q1");
		}
		else if(pontoX < 0.0 && pontoY > 0.0) {
			System.out.println("Q2");
		}
		else if(pontoX < 0.0 && pontoY < 0.0) {
			System.out.println("Q3");
		}
		else if(pontoX > 0.0 && pontoY < 0.0) {
			System.out.println("Q4");
		}
		else if(pontoX == 0.0) {
			System.out.println("Eixo Y");
		}
		else {
			System.out.println("Eixo X");
		}
		
		
				
		input.close();
		
	}
}
