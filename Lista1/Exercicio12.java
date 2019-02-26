//12 - Faça um algoritmo que calcule a média de quatro números inteiros. Os números devem ser dados pelo usuário

package br.edu.ifcvidera.Lista1;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double numero = 0;
		double media;
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Digite o " + (i + 1) + "º numero: ");
			numero += Double.parseDouble(in.nextLine());
		}
		
		media = numero / 4;
		
		System.out.println("A média dos numeros deu: " + media);

		in.close();
	}

}
