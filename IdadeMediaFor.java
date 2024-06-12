package Atividades;

import java.util.Scanner;

public class IdadeMediaFor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, soma = 0, media;

		for (int i=0; i <= 19; i++) {
			System.out.print("Informe a idade: ");
			idade = ler.nextInt();
			soma += idade;
		}
		media = soma / 19;
		System.out.println("A média das idades informadas é: " + media);
		
		ler.close();

	}

}