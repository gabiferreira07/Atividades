package Atividades;

import java.util.Scanner;

public class SomaUsuarioFor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, soma = 0;

		for (int i=0; i <= 9; i++) {
			System.out.print("Informe um número: ");
			n = ler.nextInt();
			soma += n;
		}
		System.out.println("A soma dos números informados é: " + soma);
		
		ler.close();

	}

}