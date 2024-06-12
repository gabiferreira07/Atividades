package Atividades;

import java.util.Scanner;

public class IdadeWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double idade, maior = 0, i = 0;

		while(i < 20) {
			i++;
			System.out.print("Informe a idade: ");
			idade = ler.nextInt();
			
			if (idade >= 18) { 
            	maior++; 
            }
        }
        System.out.println("Número de pessoas maiores de idade: " + maior);
        ler.close();
    }
}