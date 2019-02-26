/*10 - Faça um algoritmo para calcular e exibir do salário líquido de um professor,
onde o número de horas, o valor da hora e o percentual do INSS devem ser
fornecidos pelo usuário:
salario_bruto <- num_hora_aula * valor_hora_aula
salario_liquido <- salario_bruto – (salario_bruto * percentual_INSS). */

package br.edu.ifcvidera.Lista1;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double num_hora_aula;
		double valor_hora_aula;
		double perce_inss;
		double salario_bruto;
		double salario_liquido;
		
		System.out.println("Digite a quantidade de aulas horas: ");
		num_hora_aula = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o valor da hora: ");
		valor_hora_aula = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a porcentagem do INSS: ");
		perce_inss = Double.parseDouble(in.nextLine());
		
		salario_bruto = num_hora_aula * valor_hora_aula;
		
		salario_liquido = salario_bruto - (salario_bruto * (perce_inss/100));
		
		System.out.println("Salario liquido: " + salario_liquido);
		
		in.close();
	}

}
