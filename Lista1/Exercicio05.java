//5 – Faça um algoritmo para calcular o volume de um cilindro(pi*r^2*h)

package br.edu.ifcvidera.Lista1;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double altura;
		double raio;
		double area;
		
		System.out.println("Digite a altura");
		altura = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o raio");
		raio = Double.parseDouble(in.nextLine());
		
		area = Math.PI * Math.pow(raio, 2) * altura;
		
		System.out.println("Volume do cilindro: " + area);
		
		in.close();
	}

}
