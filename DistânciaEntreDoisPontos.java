package beginner;

import java.util.Locale;
import java.util.Scanner;

//1015
public class DistânciaEntreDoisPontos {

	public static void main(String[] args) {
		
		double x1,x2,y1,y2, distancia;
		
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		
		
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		
		distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.printf("%.4f\n",distancia);
		
		input.close();
	}
	
}
