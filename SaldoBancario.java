/*4. A partir do saldo bancário inicial, um cliente teve débitos e créditos
 * ao longo do mês. Faça um programa em Java que leia o saldo inicial, o
 * total de débitos e o total de créditos e depois escreva o saldo final do
 * cliente através de uma dessas três mensagens: “Saldo positivo em R$ X”,
 * “Saldo negativo em R$ X” ou “Saldo Zero”.
 */

import java.util.Scanner;
import java.text.DecimalFormat;


public class SaldoBancario {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		System.out.print("Qual o valor do seu saldo? ");
		double saldo = leitor.nextDouble();
		
		System.out.print("Qual o valor total dos seus debitos? ");
		double debito = leitor.nextDouble();
		
		System.out.print("Qual o valor total dos seus creditos? ");
		double credito = leitor.nextDouble();
		
		double saldoFinal = (saldo - debito) + credito;
		

		if (saldoFinal>0) {
			System.out.println ("Saldo positivo R$" + deci.format(saldoFinal));
		}
		
		else if (saldoFinal<0) {
			System.out.println("Saldo negativo em R$" +deci.format(saldoFinal));
			
		} else {
			System.out.println ("Saldo Zero");
		}

	}

}
