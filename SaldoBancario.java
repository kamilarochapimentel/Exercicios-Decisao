/*4. A partir do saldo banc�rio inicial, um cliente teve d�bitos e cr�ditos
 * ao longo do m�s. Fa�a um programa em Java que leia o saldo inicial, o
 * total de d�bitos e o total de cr�ditos e depois escreva o saldo final do
 * cliente atrav�s de uma dessas tr�s mensagens: �Saldo positivo em R$ X�,
 * �Saldo negativo em R$ X� ou �Saldo Zero�.
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
