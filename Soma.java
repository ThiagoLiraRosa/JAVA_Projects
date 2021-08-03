import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.nextLine();
				
		int soma = n1 + n2;
		
		System.out.printf("O Resultado da Soma é: " + soma);
		
		sc.close();
		

	}

}

//OUTRA MANEIRA :
//
//import java.util.Scanner;
//
//public class Soma {
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int A, B, soma; 
//		A = sc.nextInt();
//		B = sc.nextInt();
//		soma = A + B;
//		
//		System.out.printf("O Resultado é: " + soma);
//		
//		sc.close();
//		
//
//	}
//
//}