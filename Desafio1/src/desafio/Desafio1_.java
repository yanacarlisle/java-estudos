package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Desafio1_ {

	public static void main(String[] args) {	
		try (Scanner scanner = new Scanner(System.in)) {
			List<String> nomes = new ArrayList<String>();
			List<Integer> idades = new ArrayList<Integer>(); 
			List<String> email = new ArrayList<String>();
			List<String> senha = new ArrayList<String>();
			List<String> usuario = new ArrayList<String>();
			
			boolean continuarCadastro = false;
			do {
				
				System.out.println("Digite seu nome completo: ");
				
				String nome = scanner.nextLine();
				nomes.add(nome);
				
				System.out.println("Digite sua idade: ");
				Integer idade = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Digite seu e-mail: ");
				String emails= scanner.nextLine();
				email.add(emails);
				
				System.out.println("Crie uma senha só com letras: ");
				String senhas= scanner.nextLine();
				senha.add(senhas);
				
				System.out.println("Digite um nome para seu usário: ");
				String usuarios= scanner.nextLine();
				usuario.add(usuarios);
				
				System.out.println("Deseja continuar seu cadastro? (s) ou (n)?");
				var resposta = scanner.nextLine();
				if(resposta.equals( "s")) {
					continuarCadastro = true;
				}
				else {
					continuarCadastro = false;

				}
			}while(continuarCadastro);
			
			for (int indice = 0; indice < nomes.size(); indice++) {
				System.out.println("nome" +nomes.get(indice)+ "idade"+idades.get(indice)+ "email"+ email.get(indice)+ "senha"+senha.get(indice)+ "usuario"+ usuario.get(indice));
			}
		}
	}
}
