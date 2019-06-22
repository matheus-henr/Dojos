/** Read 4 integer values A, B, C and D. Then if B is greater than
 *  C and D is greater than A and if the sum of C and D is greater than
 *  the sum of A and B and if C and D were positives values and if A is even,
 *  write the message “Valores aceitos” (Accepted values). Otherwise, write the message
 *  “Valores nao aceitos” (Values not accepted).*/


import java.util.Scanner;

public class SelectionTest1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numberA, numberB, numberC, numberD;
		
		numberA = input.nextInt();
		numberB = input.nextInt();
		numberC = input.nextInt();
		numberD = input.nextInt();
		
		if(numberB > numberC && numberD > numberA) {
			if((numberC + numberD) >  (numberA + numberB)) {
				if(numberC >= 0 && numberD >= 0 && (numberA%2) == 0) {
					System.out.println("Valores aceitos");
				}
			}else {
				System.out.println("Valores nao aceitos");
			}
			
		}else {
			System.out.println("Valores nao aceitos");
		}
		
		input.close();
	}
}
