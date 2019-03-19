package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int operador;
		
		System.out.println("Digite o código do produto:");
		operador = Integer.parseInt(in.nextLine());
		
		if(operador == 1) {
			System.out.println("Alimento não perecível");
		}else if (operador <= 4) {
			System.out.println("Alimento perecível");
		}else if(operador <= 6) {
			System.out.println("Vestuário");
		}else if(operador == 7) {
			System.out.println("Higiene pessoal");
		}else if(operador <= 15) {
			System.out.println("Limpeza e utensílios domésticos");
		}else {
			System.out.println("Código do produto digita é inválido");
		}

		in.close();
	}

}
