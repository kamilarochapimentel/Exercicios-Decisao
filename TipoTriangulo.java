/*8.Fa�a um programa em Java que pe�a o tamanho dos tr�s lados de um
 * tri�ngulo. O programa dever� informar se os lados informados podem
 * formar um tri�ngulo. Caso os lados formem um tri�ngulo o programa
 * deve escrever se o mesmo �: equil�tero, is�sceles ou escaleno. Algumas dicas:
 * 
Tr�s lados formam um tri�ngulo quando a soma de quaisquer dois lados for
maior que o terceiro;

Tri�ngulo Equil�tero: tr�s lados iguais;
Tri�ngulo Is�sceles: quaisquer dois lados iguais;
Tri�ngulo Escaleno: tr�s lados diferentes;*/


import java.util.Scanner;

public class TipoTriangulo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("digite o primeiro lado: ");
		int lado1 = leitor.nextInt();
		
		System.out.print("digite o segundo lado: ");
		int lado2 = leitor.nextInt();
		
		System.out.print("digite o terceiro lado: ");
		int lado3 = leitor.nextInt();
		
		if (((lado1+lado2)>lado3 && (lado1+lado3)>lado2 && (lado2+lado3)>lado1 )) {
			if (lado1==lado2 && lado1==lado3) {
				System.out.println ("Tri�ngulo EQUILATERO");
			}
		
			else if (lado1==lado2 || lado1==lado3 || lado2==lado3) {
				System.out.println("Tri�ngulo IS�SCELES");
				
			}
			else {
				System.out.println("Tri�ngulo ESCALENO");
			}
			
		} else {
			System.out.println("n�o � triangulo");
		}

	}

}
