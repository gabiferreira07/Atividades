package Atividades;

import java.util.Scanner;

public class NomeRepeticaoWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		int n = 0;
		
		System.out.print("Informe o nome: ");
		nome = ler.next();
		
		while (n <= 9) {
			System.out.println("Nome: " + nome);
			
			n++; 
		}

	}

}
