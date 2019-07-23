import java.util.Scanner;

public class AumentoSalario {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double salary, newSalary;

		salary = input.nextDouble();

		if (salary >= 0 && salary <= 400) {
			newSalary = (salary * 0.15) + salary;
			printResult(newSalary, salary, 15);
			
		} else if (salary >= 400.01 && salary <= 800.0) {
			newSalary = (salary * 0.12) + salary;
			printResult(newSalary, salary, 12);
			
		} else if (salary >= 800.01 && salary <= 1200.00) {
			newSalary = (salary * 0.10) + salary;
			printResult(newSalary, salary, 10);
			
		} else if (salary >= 1200.01 && salary <= 2000.00) {
			newSalary = (salary * 0.07) + salary;
			printResult(newSalary, salary, 7);
			
		} else if (salary >= 2000.0) {
			newSalary = (salary * 0.04) + salary;
			printResult(newSalary, salary, 4);
		}

		input.close();
	}

	public static void printResult(double newSalary, double salaryOld, int percentage) {
		System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n",
				newSalary, (newSalary - salaryOld), percentage);
	}
}
