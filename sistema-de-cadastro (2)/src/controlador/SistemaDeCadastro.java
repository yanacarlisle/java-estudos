package controlador;

import java.util.InputMismatchException;
import java.util.Scanner;

import repositorio.RepositorioDeUsuario;
import repositorio.RepositorioEmMemoria;

public class SistemaDeCadastro {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		RepositorioDeUsuario repositorio = new RepositorioEmMemoria();
		
		var desejaContinuar = false;
		var opcao = 0;
		do {
			
			opcao = menu(scanner);
			var email = "";
			var senha = "";
			if (opcao == 1) {
				
				email = pegarEmail(scanner);
				senha = pegarSenha(scanner);
				
				// Passo 1
				// Implementar funcionalidade para cadastrar um usu�rio
				// e mostrar o resultado no console
				
				// Passo 3
				// Incluir a l�gica de que se o usu�rio j� existir,
				// ele n�o poder� ser cadastrado novamente com o mesmo e-mail
				
			} else if (opcao == 2) {
				
				email = pegarEmail(scanner);
				
				// Passo 2
				// Implementar funcionalidade para buscar um usu�rio
				// e mostrar o resultado no console
				
			} else if (opcao == 3) {
				
				email = pegarEmail(scanner);
				senha = pegarSenha(scanner);
				
				// Passo 4
				// Implementar funcionalidade para logar um usu�rio
				// e mostrar o resultado no console
			}
			
		} while (deveContinuar(scanner, opcao));
		
		scanner.close();
	}

	public static int menu(Scanner scanner) {
		
		System.out.println("O que deseja fazer?");
		System.out.println("1 - Cadastrar novo usu�rio");
		System.out.println("2 - Buscar usu�rio");
		System.out.println("3 - Logar usu�rio");
		System.out.println("4 - Sair");
		System.out.println("Digite o n�mero da op��o desejada: ");
		
		try {
			var opcao = scanner.nextInt();
			scanner.nextLine();
			return opcao;
		} catch (InputMismatchException e) {
			scanner.nextLine();
			System.out.println("Digite um n�mero: 1, 2 ou 3");
			return 0;
		}
		
	}
	
	public static String pegarEmail(Scanner scanner) {
		System.out.println("Digite o email: ");
		return scanner.nextLine();
	}

	public static String pegarSenha(Scanner scanner) {
		System.out.println("Digite a senha: ");
		return scanner.nextLine();
	}
	
	public static boolean perguntarSeDesejaContinuar(Scanner scanner) {
		System.out.println("Deseja continuar? (s) sim (n) n�o");
		return scanner.nextLine().equals("s");
	}
	
	public static boolean deveContinuar(Scanner scanner, Integer opcao) {
		return opcao != 4 ? perguntarSeDesejaContinuar(scanner) : false;
	}
}
