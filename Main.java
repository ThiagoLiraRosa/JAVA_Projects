import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Arrays;

public class Main extends Chamado {
	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		Chamado c = new Chamado();
		Date data = new Date();
		List<Chamado> listaChamado = new ArrayList<>();
		
		int opcao = 0;
		
		while (opcao != 5){
		
			System.out.print("\n##--Teste Estrutura de Menu--##\n\n");
			System.out.print("|--------------------------------------|\n");
			System.out.print("| Opção 1 - Abertura de chamado        |\n");
			System.out.print("| Opção 2 - Atendimento do chamado     |\n");
			System.out.print("| Opção 3 - Cancelar chamado           |\n");
			System.out.print("| Opção 4 - Consultas                  |\n");
			System.out.print("| Opção 5 - Sair                       |\n");
			System.out.print("|--------------------------------------|\n");
			System.out.print("Digite uma opção: ");
			
			opcao = scan.nextInt();
			
			switch (opcao) {
			case 1:
				
				if (c.numero == c.numero) {
					c.numero += 1; 
				}
				System.out.print("\nNúmero do chamado: " + 
        
        c.getNumero());
				
				System.out.print("\nNome do Cliente: ");
				c.setNome(scan.next());
				
				System.out.print("\nCPF do cliente: ");
				c.setCpf(scan.next());
				
				System.out.print("\nDescrição do problema: ");
				c.setDescricaoProblema(scan.next());
				
				c.setAbertura(data);
				System.out.print("Data de abertura é " + data);
				
				c.setSituacao("Aberto");
				System.out.print("\nSituação do chamado: " + c.getSituacao() + "\n");
				
				listaChamado.add(c);

				break;
			
			case 2:
				System.out.println("\nChamados abertos: ");
				System.out.println(Arrays.toString(listaChamado.toArray()));
				
		        System.out.print("\nNumero escolha: ");
						c.setNumeroEscolhe(scan.nextInt());

		        System.out.print("\nCPF do Técnico: ");
						c.setCpfTecnico(scan.next());
		        
		        System.out.print("\nSolução para o Problema: ");
						c.setSolucaoProblema(scan.next());
		        
		        System.out.print("\nSituação atual: ");
						c.setSituacao(scan.next());
						
				break;
			
			case 3:
				System.out.println(Arrays.toString(listaChamado.toArray()));
				
				c.setSituacao("Cancelado");

		        System.out.print("\nNumero escolha: ");
				c.setNumeroEscolhe(scan.nextInt());

				System.out.println("\nChamado Cancelado ");
				break;
								
			case 4:
				System.out.println("\nConsulta de chamados: ");
				System.out.println(Arrays.toString(listaChamado.toArray()));
				break;
				
			case 5:
				System.out.print("\nAté logo!");
				scan.close();
				break;
				
			default:
				System.out.print("\nOpção Inválida!");
				break;
				
			}	
		}
	}
}

