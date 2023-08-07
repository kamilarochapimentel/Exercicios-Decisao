/*Fa�a um programa em Java que fa�a cinco perguntas para
 * uma pessoa sobre um crime. No final o programa deve
 * emitir uma classifica��o sobre a participa��o da pessoa
 * no crime. Se a pessoa responder positivamente a 2 quest�es
 * ela deve ser classificada como "Suspeita", entre 3 e 4 como
 * "C�mplice" e 5 como "Assassino". Caso contr�rio, ele ser�
 * classificado como "Inocente". As perguntas s�o:
 * 
Telefonou para a v�tima?
Esteve no local do crime?
Mora perto da v�tima?
Devia para a v�tima?
J� trabalhou com a v�tima?*/

import java.util.Scanner;

public class Suspeito {

	public static void main(String[] args) {
		int contagem = 0;
		Scanner leitor = new Scanner (System.in);
		
		System.out.print("Telefonou para a v�tima? 1-sim/0-n�o: ");
		contagem += leitor.nextInt();
		
		System.out.print("Esteve no local do crime? 1-sim/0-n�o: ");
		contagem += leitor.nextInt();
		
		System.out.print("Mora perto da v�tima? 1-sim/0-n�o: ");
		contagem += leitor.nextInt();
		
		System.out.print("Devia para a v�tima? 1-sim/0-n�o: ");
		contagem += leitor.nextInt();
		
		System.out.print("J� trabalhou com a v�tima? 1-sim/0-n�o: ");
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
			System.out.println("C�mplice");
			
		}else {
			System.out.println("");
			System.out.println("Assassino");
		}
	}

}
