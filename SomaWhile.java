package Atividades;

public class SomaWhile {

	public static void main(String[] args) {
		int n = 0, soma = 0;
		
		while (n <= 15) {
			soma += n;
			n++;
		}
			System.out.println("A soma dos números de 1 a 15 é: " + soma); 
	}

}