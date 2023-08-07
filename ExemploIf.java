import java.util.Scanner;

public class ExemploIf{ 
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
        System.out.print("Digite um valor: ");
        int valor = leitor.nextInt();

        if (valor > 10) {
        	System.out.println("O valor é MAIOR que 10.");
        }
        
        else if (valor==0) {
        	System.out.println("O valor é IGUAL a ZERO");
        }
        else {
        	System.out.println("O valor é MENOR que 10.");
        }
        
    }
}
