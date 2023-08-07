//1.Faça um programa em Java que peça dois números e imprima o maior deles.

import java.util.Scanner;

public class Comparacao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int num1 = leitor.nextInt();
		
		System.out.print("Digite um segundo valor: ");
		int num2 = leitor.nextInt();
		
		if (num1>num2) {
			System.out.println("");
			System.out.println("O maior valor: " +num1);
			
		} else if (num2>num1) {
			System.out.println("");
			System.out.println("O maior valor: " +num2);
			
		} else {
			System.out.println("");
			System.out.println("Os valores são iguais: " +num1);
		}
		
		


	}

}
