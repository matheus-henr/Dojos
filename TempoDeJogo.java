
import java.util.Scanner;

public class TempoDeJogo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int startHour, endHour, timeGame;
		
		startHour = input.nextInt();
		endHour = input.nextInt();
		
		timeGame =   (endHour -  startHour);
		
		if(timeGame < 0) {
			timeGame =   timeGame + 24;  
			
		}else if (startHour == endHour){
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		
		
		if(timeGame >=1 && timeGame <=24) {
			System.out.printf("O JOGO DUROU %d HORA(S)", timeGame);
		}
		
		
		input.close();

	}

}
