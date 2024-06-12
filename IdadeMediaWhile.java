package Atividades;

import java.util.Scanner;

public class IdadeMediaWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double soma = 0, i = 0, media;

		while(i < 20) {
			i++;
			System.out.print("Informe a idade: ");
			soma += ler.nextDouble();
		}
		media = soma / 20;
		System.out.println("A média das idades informadas é: " + media);
		
		ler.close();
	}

}
