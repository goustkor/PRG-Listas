package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double valorProduto;
		int operador;
		
		double valorTotal;
		double mensalidade;
		
		System.out.println("Digite o valor avista do produto:");
		valorProduto = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o operador para parcelamento:");
		System.out.println("1 - 3x (10%) , 2 - 5x (20%)");
		operador = Integer.parseInt(in.nextLine());
		
		if(operador == 1) {
			valorTotal = valorProduto + ((valorProduto * 10)/100);
			mensalidade = valorTotal / 3;
		}else {
			valorTotal = valorProduto + ((valorProduto * 20)/100);
			mensalidade = valorTotal / 5;
		}
		
		System.out.println("O valor total ficou de R$" + valorTotal + " em parcelas de R$" + mensalidade);
		
		in.close();
	}

}
