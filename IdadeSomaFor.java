package Atividades;

import java.util.Scanner;

public class IdadeSomaFor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, soma = 0;

		for (int i=0; i <= 19; i++) {
			System.out.print("Informe a idade: ");
			idade = ler.nextInt();
			soma += idade;
		}
		System.out.println("A soma das idades informadas é: " + soma);
		
		ler.close();

	}

}