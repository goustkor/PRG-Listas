//12 - Fa�a um algoritmo que calcule a m�dia de quatro n�meros inteiros. Os n�meros devem ser dados pelo usu�rio

package br.edu.ifcvidera.Lista1;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double numero = 0;
		double media;
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Digite o " + (i + 1) + "� numero: ");
			numero += Double.parseDouble(in.nextLine());
		}
		
		media = numero / 4;
		
		System.out.println("A m�dia dos numeros deu: " + media);

		in.close();
	}

}
