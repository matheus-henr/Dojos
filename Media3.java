import java.util.Scanner;

public class Media3 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		float nota1 = input.nextFloat();
		float nota2 = input.nextFloat();
		float nota3 = input.nextFloat();
		float nota4 = input.nextFloat();
		
		float media = (nota1 * 2 + nota2 * 3 + nota3 * 4 + nota4 * 1) / (2 + 3 + 4 + 1);
		
		if(media >= 7) {
			System.out.printf("Media: %.1f\n", media);
			System.out.println("Aluno aprovado.");
		} else if(media < 5) {
			System.out.printf("Media: %.1f\n", media);
			System.out.println("Aluno reprovado.");
		}else if(media >= 5.0f && media <= 6.9) {
			System.out.printf("Media: %.1f\n", media);
			System.out.print("Aluno em exame.");
			
			float exame = input.nextFloat();
			
			System.out.printf("Nota do exame: %.1f\n", exame);
			
			media = (media + exame) / 2;
			
			if(media >= 5) {
				System.out.println("Aluno aprovado.");
			}else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f\n", media);
		}
		
		
		input.close();
	}
}
