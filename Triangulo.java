import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double a, b, c;
		
		a  = input.nextDouble();
		b  = input.nextDouble();
		c  = input.nextDouble();
		
		
		if(a + b  > c && b + c > a && a + c > b) {
			System.out.printf("Perimetro = %.1f\n", a + b + c );
		}else {
			System.out.printf("Area = %.1f\n", ((a + b) * c) / 2 );
		}
		
		input.close();
		
	}
}
