import java.util.Locale;
import java.util.Scanner;

public class HoraSalario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("N�mero Funcion�rio: ");			
		int numero = sc.nextInt();
		System.out.println("Horas Trabalhadas: ");	
		double horas = sc.nextDouble();
		System.out.println("Valor da Hora Trabalhada: ");
		System.out.println();
	
		double valor = sc.nextDouble();
		double salario;
		
		salario = valor * horas;
				
		System.out.println("Funcion�rio N�: " + numero);
		System.out.println("Horas trabalhadas : " + horas);
		System.out.printf("O valor a receber ser�: %.2f%n", salario);
		
		sc.close();
		

	}

}
