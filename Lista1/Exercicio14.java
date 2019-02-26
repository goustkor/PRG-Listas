/* 14 - Fa�a um algoritmo que l� o nome de um vendedor, l� o sal�rio fixo do
vendedor, l� o total (em reais) de vendas por ele efetuadas e l� o percentual que 
ganha sobre o total de vendas. O algoritmo deve calcular o sal�rio total do vendedor e exibir, ao final, a seguinte frase:
O vendedor <nome do vendedor> recebeu <salario total> reais */

package br.edu.ifcvidera.Lista1;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String nome_vendedor;
		double salario;
		double vendas;
		double comissao;
		double salarioTotal;
		
		System.out.println("Digite o nome do vendedor: ");
		nome_vendedor = in.nextLine();
		
		System.out.println("Digite o salario do vendedor: ");
		salario = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o total de vendas: ");
		vendas = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a porcentagem de comiss�o das vendas:");
		comissao = Double.parseDouble(in.nextLine());
		
		salarioTotal = salario + (vendas * (comissao / 100));
		
		System.out.println("O vendedor "+ nome_vendedor +" recebeu R$"+ salarioTotal);

		in.close();
	}

}
