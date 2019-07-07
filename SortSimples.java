import java.util.Scanner;

public class SortSimples {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numero1, numero2, numero3;
		int numeroOrdenados[] = new int[3];

		numero1 = input.nextInt();
		numero2 = input.nextInt();
		numero3 = input.nextInt();

		if (numero1 < numero2 && numero1 < numero3) {
			numeroOrdenados[0] = numero1;
			if (numero2 < numero3) {
				numeroOrdenados[1] = numero2;
				numeroOrdenados[2] = numero3;
			} else {
				numeroOrdenados[1] = numero3;
				numeroOrdenados[2] = numero2;
			}
		} else if (numero2 < numero1 && numero2 < numero3) {
			numeroOrdenados[0] = numero2;
			if (numero1 < numero3) {
				numeroOrdenados[1] = numero1;
				numeroOrdenados[2] = numero3;
			} else {
				numeroOrdenados[1] = numero3;
				numeroOrdenados[2] = numero1;
			}
		} else {
			numeroOrdenados[0] = numero3;
			if (numero2 < numero1) {
				numeroOrdenados[1] = numero2;
				numeroOrdenados[2] = numero1;
			} else {
				numeroOrdenados[1] = numero1;
				numeroOrdenados[2] = numero2;
			}
		}

		System.out.printf("%d\n%d\n%d\n\n", numeroOrdenados[0], numeroOrdenados[1], numeroOrdenados[2]);

		System.out.printf("%d\n%d\n%d\n", numero1, numero2, numero3);
		input.close();
	}
}
