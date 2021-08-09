import java.util.Locale;
import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, area, circulo, pi, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		pi = 3.14159;
		
		area = A * C / 2;
		circulo = pi * C * C;
		trapezio = (A + B) * C / 2; 
		quadrado = B * B;
		retangulo = A * B; 
		
		System.out.printf("TRIÂNGULO: %.3f%n", area);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("CIRCULO: %.3f%n", retangulo);
		
		
	}

}
