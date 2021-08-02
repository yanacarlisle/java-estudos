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
				// Implementar funcionalidade para cadastrar um usuário
				// e mostrar o resultado no console
				
				// Passo 3
				// Incluir a lógica de que se o usuário já existir,
				// ele não poderá ser cadastrado novamente com o mesmo e-mail
				
			} else if (opcao == 2) {
				
				email = pegarEmail(scanner);
				
				// Passo 2
				// Implementar funcionalidade para buscar um usuário
				// e mostrar o resultado no console
				
			} else if (opcao == 3) {
				
				email = pegarEmail(scanner);
				senha = pegarSenha(scanner);
				
				// Passo 4
				// Implementar funcionalidade para logar um usuário
				// e mostrar o resultado no console
			}
			
		} while (deveContinuar(scanner, opcao));
		
		scanner.close();
	}

	public static int menu(Scanner scanner) {
		
		System.out.println("O que deseja fazer?");
		System.out.println("1 - Cadastrar novo usuário");
		System.out.println("2 - Buscar usuário");
		System.out.println("3 - Logar usuário");
		System.out.println("4 - Sair");
		System.out.println("Digite o número da opção desejada: ");
		
		try {
			var opcao = scanner.nextInt();
			scanner.nextLine();
			return opcao;
		} catch (InputMismatchException e) {
			scanner.nextLine();
			System.out.println("Digite um número: 1, 2 ou 3");
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
		System.out.println("Deseja continuar? (s) sim (n) não");
		return scanner.nextLine().equals("s");
	}
	
	public static boolean deveContinuar(Scanner scanner, Integer opcao) {
		return opcao != 4 ? perguntarSeDesejaContinuar(scanner) : false;
	}
}
