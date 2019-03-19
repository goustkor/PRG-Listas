package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String nome;
		double renda;
		
		double rendaCorrigida = 0;
		
		System.out.println("Digite seu nome:");
		nome = in.nextLine();
		
		System.out.println("Digite sua renda:");
		renda = Double.parseDouble(in.nextLine());
		
		if(renda <= 300f) {
			rendaCorrigida = renda + ((renda * 10) / 100);
		}else if(renda <= 600) {
			rendaCorrigida = renda + ((renda * 11) / 100);
		}else if(renda <= 900) {
			rendaCorrigida = renda + ((renda * 12) / 100);
		}else if(renda <= 1500) {
			rendaCorrigida = renda + ((renda * 6) / 100);
		}else if(renda <= 2000) {
			rendaCorrigida = renda + ((renda * 3) / 100);
		}else {
			rendaCorrigida = renda;
		}
		
		System.out.println("A renda de " + nome + " com correção no aumento é de R$" + rendaCorrigida);

		in.close();
	}

}
