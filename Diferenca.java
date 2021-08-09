import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int contaA = A * B;
		int contaB = C * D;
		
		int Dif = contaA - contaB;
		
		System.out.printf("A diferença do produto A e B e do produto C e D é: " + Dif);
		
		
		
		
		
		
		
		
		sc.close();
		
		

	}

}
