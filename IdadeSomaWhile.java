package Atividades;

import java.util.Scanner;

public class IdadeSomaWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double soma = 0, i = 0;

		while(i < 20) {
			i++;
			System.out.print("Informe a idade: ");
			soma += ler.nextDouble();
		}
		System.out.println("A soma das idades informadas é: " + soma);
		
		ler.close();
	}

}