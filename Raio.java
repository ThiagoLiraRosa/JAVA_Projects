import java.util.Locale;
import java.util.Scanner;

public class Raio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, R;
		double pi = 3.14159;
		
		R = sc.nextDouble();
		
		A = pi * R * R;
		
		System.out.printf("�rea: %.4f%n", A);
		
		

	}

}
