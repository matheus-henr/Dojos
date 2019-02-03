package beginner;

import java.util.Scanner;

public class IdadeEmDias {

	public static void main(String[] args) {
		
		int idade, ano = 0, mes = 0, dia = 0;
		
		Scanner input = new Scanner(System.in);
		
		
		idade = input.nextInt();
		input.close();
		
		
		if(idade >= 365) {
			ano = idade / 365;
		}
		
		mes = (idade % 365) / 30;
		
		dia =  ((idade % 365) % 30) / 1;
		
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", ano, mes, dia);
		
		
	}
}
