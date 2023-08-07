/*Fa�a um programa em Java que recebe o sal�rio de um
 *colaborador e reajuste-o segundo o seguinte crit�rio:
sal�rios at� R$ 280,00 (incluindo) : aumento de 20%

sal�rios entre R$ 280,00 e R$ 700,00 : aumento de 15%

sal�rios entre R$ 700,00 e R$ 1500,00 : aumento de 10%

sal�rios de R$ 1500,00 em diante : aumento de 5%

Ap�s o aumento ser realizado, informe na tela:
o sal�rio antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo sal�rio, ap�s o aumento. */

import java.util.Scanner;
import java.text.DecimalFormat;

public class ReajusteSalario {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		System.out.print("Informe seu sal�rio atual: R$");
		double salario = leitor.nextFloat();
		
		if (salario<=280) {
			double valorAumento = salario * 0.20;
			double reajuste = salario + valorAumento;
			
			System.out.println("");
			System.out.println("Sal�rio atual: R$"+deci.format(salario));
			System.out.println("Percentual de aumento de 20% aplicado");
			System.out.println("O valor do aumento foi de R$"+deci.format(valorAumento));
			System.out.println("O Sal�rio ap�s o aumento ser� de R$"+ deci.format(reajuste));
		}
		else if (salario>280 && salario<700) {
			double valorAumento = salario *0.15;
			double reajuste = salario + valorAumento;
			
			System.out.println("");
			System.out.println("Sal�rio atual: R$"+deci.format(salario));
			System.out.println("Percentual de aumento de 15% aplicado");
			System.out.println("O valor do aumento foi de R$"+deci.format(valorAumento));
			System.out.println("O Sal�rio ap�s o aumento ser� de R$"+ deci.format(reajuste));
						
		}
		
		else if (salario>=700 && salario<1500) {
			double valorAumento = salario *0.10;
			double reajuste = salario + valorAumento;
			
			System.out.println("");
			System.out.println("Sal�rio atual: R$"+deci.format(salario));
			System.out.println("Percentual de aumento de 10% aplicado");
			System.out.println("O valor do aumento foi de R$"+deci.format(valorAumento));
			System.out.println("O Sal�rio ap�s o aumento ser� de R$"+ deci.format(reajuste));
		}
		
		else {
			double valorAumento = salario *0.05;
			double reajuste = salario + valorAumento;
			
			System.out.println("");
			System.out.println("Sal�rio atual: R$"+deci.format(salario));
			System.out.println("Percentual de aumento de 5% aplicado");
			System.out.println("O valor do aumento foi de R$"+deci.format(valorAumento));
			System.out.println("O Sal�rio ap�s o aumento ser� de R$"+ deci.format(reajuste));
			
		}

	}

}
