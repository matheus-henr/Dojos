import java.util.Scanner;

public class TempoDeJogoComMinutos {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int startHour, startMinute, endHour, endMinute, hour, minute;

		startHour = input.nextInt();
        startMinute = input.nextInt();
        endHour = input.nextInt();
        endMinute = input.nextInt();


        hour =  (endHour - startHour);
        minute = (endMinute - startMinute);

        if(hour < 0)
        {
            hour += 24;
        } else if(startHour == endHour)
        {
        	 System.out.printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");
        }

        if(minute < 0)
        {
            minute += 60;
            hour--;
        }

        if((minute >= 1 && hour <=24) || (minute >= 0 && hour <= 24))
        {
           System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", hour, minute);
        }

        input.close();
        
	}
}
