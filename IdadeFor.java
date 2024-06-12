package Atividades;

import java.util.Scanner;

public class IdadeFor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        int idade, maior = 0; 

        for (int i = 0; i < 20; i++) { 
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