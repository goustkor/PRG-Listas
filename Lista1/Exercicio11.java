/*11 - Fa�a um algoritmo para calcular e exibir o valor de uma presta��o em atraso.
prestacao_atrasada <- prestacao + (prestacao*(taxa/100)*num_dias_atraso), taxa
� o percentual de juros por dia, num_dias_atraso � o n�mero de dias em atraso e
presta��o � o valor da presta��o normal. O valor da presta��o, a taxa e o n�mero
de dias em atraso devem ser fornecidos pelo usu�rio. */

package br.edu.ifcvidera.Lista1;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double prestacao;
		double taxa;
		double num_dias_atraso;
		double prestacao_atrasada;
		
		System.out.println("Digite o valor da presta��o:");
		prestacao = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite quantidade de dias atrasados: ");
		num_dias_atraso = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a taxa por dia de atraso: ");
		taxa = Double.parseDouble(in.nextLine());
		
		prestacao_atrasada = prestacao + ((prestacao * (taxa/100)) * num_dias_atraso);
		
		System.out.println("Valor da presta��o com atraso �: " + prestacao_atrasada);
		
		in.close();
	}

}
