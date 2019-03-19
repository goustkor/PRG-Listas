package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int estoque;
		int pedido;
		
		int total;
		
		System.out.println("Digite a quantidade em estoque:");
		estoque = Integer.parseInt(in.nextLine());
		
		System.out.println("Digite a quantidade do pedido:");
		pedido = Integer.parseInt(in.nextLine());
		
		total = estoque - pedido;
		
		if(total < 0) {
			System.out.println("Não a produtos suficientes em estoque.");
		}else {
			System.out.println("Sobrou um total de " + total + " em estoque.");
		}
		
		in.close();
	}

}
