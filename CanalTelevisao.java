/*3. Fa�a um algoritmo que leia o n�mero de um canal de televis�o e
 * escreva o nome da emissora correspondente. Caso o usu�rio forne�a um
 * canal sem emissora exibir a mensagem �Canal inv�lido�. Considere as
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
			System.out.println("Canal inv�lido");
			break;
		}

	}

}
