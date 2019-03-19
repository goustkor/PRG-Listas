package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int operador;
		double valorCompra;
		
		double valorFinal;
		
		System.out.println("Digite o tipo de cliente:");
		System.out.println("1 - Funcionário , 2 - Cliente Especial , 3 - Cliente normal");
		operador = Integer.parseInt(in.nextLine());
		
		System.out.println("Digite o valor da compra:");
		valorCompra = Double.parseDouble(in.nextLine());
		
		if(operador == 1) {
			valorFinal = valorCompra - ((valorCompra * 5)/100);
		}else if(operador == 2) {
			valorFinal = valorCompra - ((valorCompra * 10)/100);
		}else {
			valorFinal = valorCompra;
		}
		
		System.out.println("O valor da compra ficou R$" + valorFinal);
		
		in.close();
	}

}
