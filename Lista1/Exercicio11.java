/*11 - Faça um algoritmo para calcular e exibir o valor de uma prestação em atraso.
prestacao_atrasada <- prestacao + (prestacao*(taxa/100)*num_dias_atraso), taxa
é o percentual de juros por dia, num_dias_atraso é o número de dias em atraso e
prestação é o valor da prestação normal. O valor da prestação, a taxa e o número
de dias em atraso devem ser fornecidos pelo usuário. */

package br.edu.ifcvidera.Lista1;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double prestacao;
		double taxa;
		double num_dias_atraso;
		double prestacao_atrasada;
		
		System.out.println("Digite o valor da prestação:");
		prestacao = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite quantidade de dias atrasados: ");
		num_dias_atraso = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a taxa por dia de atraso: ");
		taxa = Double.parseDouble(in.nextLine());
		
		prestacao_atrasada = prestacao + ((prestacao * (taxa/100)) * num_dias_atraso);
		
		System.out.println("Valor da prestação com atraso é: " + prestacao_atrasada);
		
		in.close();
	}

}
