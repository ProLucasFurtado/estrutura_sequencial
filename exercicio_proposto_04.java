import java.util.Locale;
import java.util.Scanner;

/* 04) Fazer um programa que leia o n�mero de um funcion�rio,
seu n�mero de horas trabalhadas, o valor que recebe por
hora e calcula o sal�rio desse funcion�rio. A seguir, mostre
o n�mero e o sal�rio do funcion�rio, com duas casas decimais.*/

public class exercicio_proposto_04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numfunc = sc.nextInt();
		int numHTrab = sc.nextInt();
		double valorHTrab = sc.nextDouble();
		double salario = numHTrab * valorHTrab;
		System.out.println("NUMBER = " + numfunc);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		sc.close();
				
	}

}
