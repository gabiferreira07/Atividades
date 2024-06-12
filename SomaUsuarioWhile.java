package Atividades;

import java.util.Scanner;

public class SomaUsuarioWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double soma = 0, i = 0;

		while(i < 10) {
			i++;
			System.out.print("Informe um número: ");
			soma += ler.nextDouble();
		}
		System.out.println("A soma dos números informados é: " + soma);
		
		ler.close();
	}

}