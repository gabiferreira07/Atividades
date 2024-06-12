package Atividades;

import java.util.Scanner;

public class NomeRepeticao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		
		System.out.print("Informe o nome: ");
		nome = ler.next();
		
		for (int i=0; i <= 9; i++) {
			System.out.println("Nome: " + nome);
		}
		ler.close();

	}

}
