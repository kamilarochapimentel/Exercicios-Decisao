//2.Fa�a um programa em Java que leia tr�s n�meros e mostre o maior deles.

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		int num1 = leitor.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		int num2 = leitor.nextInt();
		
		System.out.print("Digite um terceiro n�mero: ");
		int num3 = leitor.nextInt();
		
				
        if (num1>num2 && num1>num3){
			System.out.println("O maior n�mero: "+num1);
		}
		
		else if (num2>num1 && num2>num3) {
			System.out.println("O maior valor: "+num2);
			
		} else if (num3>num1 && num3>num2){
			System.out.println("O maior valor: "+num3);
			
		} else if (num1>num2 && num1==num3) {
			System.out.println("O maior valor: "+num1);
			
		}else if (num2>num3 && num1==num2) {
			System.out.println("O maior valor: "+num1);
			
		}else if (num3>num1 && num2==num3) {
			System.out.println("O maior valor: "+num3);
			
		}else {
			System.out.println("Os n�meros s�o iguais: "+num1);
		}



	}

}
