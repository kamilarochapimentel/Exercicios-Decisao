/*3. Faça um algoritmo que leia o número de um canal de televisão e
 * escreva o nome da emissora correspondente. Caso o usuário forneça um
 * canal sem emissora exibir a mensagem “Canal inválido”. Considere as
 * seguintes emissoras e seus respectivos canais: 2=SBT, 4=BAND,
 * 6=RedeTV!, 9=Record, 13=Globo. */

import java.util.Scanner;
public class CanalTelevisao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		System.out.print("Digite um canal: ");
		int canal = leitor.nextInt();

		switch (canal) { 
		case 2:
			System.out.println("SBT");
			break;
			
		case 4:
			System.out.println("BAND");
			break;
			
		case 6:
			System.out.println("RedeTV");
			break;
			
		case 9:
			System.out.println("Record");
			break;
			
		case 13:
			System.out.println("Globo");
			break;
			
		default:
			System.out.println("Canal inválido");
			break;
		}

	}

}
