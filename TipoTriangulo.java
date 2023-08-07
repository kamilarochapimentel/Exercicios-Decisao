/*8.Faça um programa em Java que peça o tamanho dos três lados de um
 * triângulo. O programa deverá informar se os lados informados podem
 * formar um triângulo. Caso os lados formem um triângulo o programa
 * deve escrever se o mesmo é: equilátero, isósceles ou escaleno. Algumas dicas:
 * 
Três lados formam um triângulo quando a soma de quaisquer dois lados for
maior que o terceiro;

Triângulo Equilátero: três lados iguais;
Triângulo Isósceles: quaisquer dois lados iguais;
Triângulo Escaleno: três lados diferentes;*/


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
				System.out.println ("Triângulo EQUILATERO");
			}
		
			else if (lado1==lado2 || lado1==lado3 || lado2==lado3) {
				System.out.println("Triângulo ISÓSCELES");
				
			}
			else {
				System.out.println("Triângulo ESCALENO");
			}
			
		} else {
			System.out.println("não é triangulo");
		}

	}

}
