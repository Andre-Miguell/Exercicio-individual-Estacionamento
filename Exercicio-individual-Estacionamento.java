import java.util.Scanner;

public class ExercicioEstacionamento {

	public static void main(String[] args) {
		
		//Declarando a Variavel 
		Scanner sc = new Scanner(System.in); 

		int entrada; 
		
		//Print da tela de pergunta e resposta
		System.out.print("Comecando analise para o acesso a vaga especial, peco que use 1 para sim e 2 para nao! \n");
		System.out.print("Voce tem alguma deficiencia, e idoso ou gestante? \n (1) - sim \n (2) - Nao \n Resposta: "); 
		entrada = sc.nextInt();

		//Condicao if (se)
		if (entrada == 1) {
		    //Caso o usuario responda com 1, o programa tera uma resposta positiva e permitindo a parada
			System.out.println("\nVoce pode estacionar!");
		} else if (entrada == 2) {
		    //Caso o usuario responda com 2, o programa vai responder de forma negativa negando a parada
			System.out.println("\nVoce nao pode estacionar!");
		} else {
		    // Caso o usuario responda usando outro algarismo que nao seja os solicitados
			System.out.println("\nPor favor, responda apenas com 1 para sim e 2 para nao!");
		}

		sc.close();
	}

}
