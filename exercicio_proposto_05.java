import java.util.Locale;
import java.util.Scanner;

/* 05) Fazer um programa para ler o c�digo de uma pe�a 1,
o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio
de cada pe�a 2. Calcule e mostre o valor a ser pago.*/
public class exercicio_proposto_05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		int codpeca1 = sc.nextInt();
		int numpeca1 = sc.nextInt();
		double valorUndPeca1 = sc.nextDouble();
		
		double vlrTotal1 = numpeca1 * valorUndPeca1;
		
		@SuppressWarnings("unused")
		int codpeca2 = sc.nextInt();
		int numpeca2 = sc.nextInt();
		double valorUndPeca2 = sc.nextDouble();
		
		double vlrTotal2 = numpeca2 * valorUndPeca2;
		
		double valorapagar = vlrTotal1 + vlrTotal2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorapagar); 
		sc.close();
	}

}
