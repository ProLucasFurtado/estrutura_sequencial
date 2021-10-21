import java.util.Locale;
import java.util.Scanner;

public class exercicio_youtube {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double valormt2 = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = valormt2 * area; 
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f", preco);
		sc.close();
	}

}
