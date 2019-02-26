//6 – Faça um algoritmo para calcular o volume de uma esfera(4/3*pi*r^3)

package br.edu.ifcvidera.Lista1;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double raio;
		double area;
		
		System.out.println("Digite o raio:");
		raio = Double.parseDouble(in.nextLine());
		
		area = 4/3 * Math.PI * Math.pow(raio, 3);
		
		System.out.println("Valume da esfera: " + area);
		
		in.close();
	}

}
