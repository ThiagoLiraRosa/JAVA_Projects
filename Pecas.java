import java.util.Locale;
import java.util.Scanner;

public class Pecas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Peças 1: ");
		int codigo1 = sc.nextInt();
		int qtd1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		double total1;
		
		System.out.println("Peças 2: ");
		int codigo2 = sc.nextInt();
		int qtd2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		double total2;
		double totalgeral;
		
		total1 = qtd1 * valor1;
		total2 = qtd2 * valor2;
		
		totalgeral = total1 + total2;
		System.out.printf("Valor a Pagar: " + totalgeral);
		
		sc.close();

	}

}
