/* 13 - Faça um algoritmo que receba do usuário uma quantidade de chuva dada em polegadas
e exiba o equivalente em milímetros (25,4 mm = 1 polegada). */


package br.edu.ifcvidera.Lista1;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double chuvaP;
		double chuvaM;
		
		System.out.println("Digite a quantidade de chuva em polegadas: ");
		chuvaP = Double.parseDouble(in.nextLine());
		
		chuvaM = chuvaP * 25.4;
		
		System.out.println("Quantidade de chuva em (mm): " + chuvaM);
		
		in.close();
	}

}
