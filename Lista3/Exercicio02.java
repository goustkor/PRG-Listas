package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String nome;
		int sexo;
		
		System.out.println("Digite seu nome:");
		nome = in.nextLine();
		
		System.out.println("Digite seu sexo.");
		System.out.println("1 para Masculino, 2 para feminino");
		sexo = Integer.parseInt(in.nextLine());
		
		if(sexo < 0 || sexo > 2) {
			System.out.println("Sexo digitado est� incorreto");
			return;
		}
		
		if(sexo == 1) {
			System.out.println("Excelent�ssimo Sr. " + nome);
		}else {
			System.out.println("Excelent�ssima Sra. " + nome);
		}
		
		
		in.close();

	}

}
