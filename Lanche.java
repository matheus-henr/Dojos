import java.util.Scanner;

public class Lanche {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double itens[] = new double[5];
		
		itens[0] = 4.00;
	    itens[1] = 4.50;
	    itens[2] = 5.00;
	    itens[3] = 2.00;
	    itens[4] = 1.50;
	    
	    int codigo = input.nextInt();
	    int quantidade = input.nextInt();
	    
	    
	    if(codigo >= 1 && codigo <= 5   ) {
	    	double preco = itens[codigo - 1] * quantidade;
	    	System.out.printf("Total: R$ %.2f\n", preco);
	    }else {
	    	System.out.println("Codigo invalido");
	    }
	    
	    input.close();
	    
	}
}
