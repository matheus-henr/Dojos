import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a,b,c, x1, x2, delta, raiz, deno;
		
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		delta = (Math.pow(b, 2)  - (4 * a * c));
		deno = 2 * a;
		if(delta < 0  || deno == 0) {
			System.out.println("Impossivel calcular");
		}else {
			raiz = Math.sqrt(delta);
			x1 = (- b + raiz)/deno;
			x2 = (- b - raiz)/deno;
			
			System.out.printf("R1 = %.5f\nR2 = %.5f",x1, x2);
		}
		
		input.close();
	}
}
