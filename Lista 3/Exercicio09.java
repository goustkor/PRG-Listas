package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int operador;
		
		System.out.println("Digite o c�digo do produto:");
		operador = Integer.parseInt(in.nextLine());
		
		if(operador == 1) {
			System.out.println("Alimento n�o perec�vel");
		}else if (operador <= 4) {
			System.out.println("Alimento perec�vel");
		}else if(operador <= 6) {
			System.out.println("Vestu�rio");
		}else if(operador == 7) {
			System.out.println("Higiene pessoal");
		}else if(operador <= 15) {
			System.out.println("Limpeza e utens�lios dom�sticos");
		}else {
			System.out.println("C�digo do produto digita � inv�lido");
		}

		in.close();
	}

}
