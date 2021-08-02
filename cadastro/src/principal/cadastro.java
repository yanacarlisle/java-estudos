package principal;

import java.util.ArrayList;
import java.util.List; 
import java.util.Scanner;

public class cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		List<Pessoas> pessoas = new ArrayList<Pessoas>();
		List<String> nomes = new ArrayList<String>();
		var idades = new ArrayList<Integer>();
		
		
		boolean desejaContinuar = false;
		do {
			Pessoas pessoa = new Pessoas();
			
			System.out.println("Digite um nome: ");
			String nome = scanner.nextLine();
			pessoa.nome = nome;
			
			System.out.println("Digite sua idade: ");
			Integer idade = scanner.nextInt();
			pessoa.idade = idade;
			
			pessoas.add(pessoa);
			
			scanner.nextLine();
			
			System.out.println("Deseja continuar? (s) ou (n)?");
			var resposta = scanner.nextLine();
			if(resposta.equals( "s")) {
				desejaContinuar = true;
			}
			else {
				desejaContinuar = false;

			}
			
		} while(desejaContinuar);
		
		for (var pessoa : pessoas) {
			 System.out.println(pessoa);
		}
		
		
		}
	}

