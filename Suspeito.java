/*Faça um programa em Java que faça cinco perguntas para
 * uma pessoa sobre um crime. No final o programa deve
 * emitir uma classificação sobre a participação da pessoa
 * no crime. Se a pessoa responder positivamente a 2 questões
 * ela deve ser classificada como "Suspeita", entre 3 e 4 como
 * "Cúmplice" e 5 como "Assassino". Caso contrário, ele será
 * classificado como "Inocente". As perguntas são:
 * 
Telefonou para a vítima?
Esteve no local do crime?
Mora perto da vítima?
Devia para a vítima?
Já trabalhou com a vítima?*/

import java.util.Scanner;

public class Suspeito {

	public static void main(String[] args) {
		int contagem = 0;
		Scanner leitor = new Scanner (System.in);
		
		System.out.print("Telefonou para a vítima? 1-sim/0-não: ");
		contagem += leitor.nextInt();
		
		System.out.print("Esteve no local do crime? 1-sim/0-não: ");
		contagem += leitor.nextInt();
		
		System.out.print("Mora perto da vítima? 1-sim/0-não: ");
		contagem += leitor.nextInt();
		
		System.out.print("Devia para a vítima? 1-sim/0-não: ");
		contagem += leitor.nextInt();
		
		System.out.print("Já trabalhou com a vítima? 1-sim/0-não: ");
		contagem += leitor.nextInt();
		
		if (contagem<=1){
			System.out.println("");
			System.out.println ("Inocente");
		}
		else if (contagem==2) {
			System.out.println("");
			System.out.println("Suspeito");
		}
		else if (contagem==3 || contagem==4) {
			System.out.println("");
			System.out.println("Cúmplice");
			
		}else {
			System.out.println("");
			System.out.println("Assassino");
		}
	}

}
