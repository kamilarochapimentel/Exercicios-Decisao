/*5.Os ingressos de um cinema custam X reais. Na terça-feira há
 * um desconto de 50% e em qualquer dia menores de 14 anos
 * também tem desconto de 50%. Os descontos são cumulativos.
 * Faça um programa em Java que leia do usuário o dia da semana,
 * a idade do espectador e o preço base do ingresso e escreva o
 * valor a pagar. Considere que 1 é domingo, 2 é segunda, etc. 
 */

import java.util.Scanner;
//import java.text.DecimalFormat;

public class PrecoCinema {

	public static void main(String[] args) {
		System.out.print("O VALOR DO INGRESSO NORMAL R$36,00");
		System.out.println ("");
		System.out.println("-----------------------");
		System.out.println("COD:       DIA:        ");
		System.out.println(" 1       domingo       ");
		System.out.println(" 2       segunda       ");
		System.out.println(" 3       terça         ");
		System.out.println(" 4       quarta        ");
		System.out.println(" 5       quinta        ");
		System.out.println(" 6       sexta         ");
		System.out.println(" 7       sábado        ");
		System.out.println("-----------------------");
		System.out.println ("");
		//double ingresso = 36;
		
		Scanner leitor = new Scanner (System.in);
		//DecimalFormat deci = new DecimalFormat("0.00");
		
		/*System.out.print("Qual o dia da semana: ");
		int dia = leitor.nextInt();
		
		System.out.print("Qual a idade: ");
		int idade = leitor.nextInt();
		
		if (dia == 2) {
			if (idade == 14) {
				System.out.println("Valor promocional. 100% de desconto: R$0,00");
				
			}else {
				System.out.println("Valor promocional. 50% de desconto: R$18,00");
			}
		}
		
		else {
			if (idade == 14) {
				System.out.println ("Valor promocional. 50% de desconto: R$18,00");
				
			} else {
				System.out.println ("Valor cheio R$36,00");
			}
			
		}*/
		
		int contador = 0;
		
		System.out.print("O dia da compra é terça [true/false]? ");
		boolean resposta1 = leitor.nextBoolean();
		
		if (resposta1==true) {
			contador++;
			
		}
		
		System.out.print("O cliente tem menos de 14 anos [true/false]? " );
		boolean resposta2 = leitor.nextBoolean();
		
		
		if(resposta2 == true) {
			contador++;
			
		}
		
		
		if (contador==0) {
			System.out.println("O valor do ingresso fica por R$36,00");
		}
		
		else if (contador==1) {
			System.out.println("O valor do ingresso fica por R$18,00");
		
		}
		
		else {
			System.out.println("100% de desconto");
		}
		

	}

}
