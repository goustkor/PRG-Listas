//1 – Faça um algoritmo para calcular a área superficial de um cilindro (2*pi*r*h)

package br.edu.ifcvidera.Lista1;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double area;
		double raio;
		double altura;
		
		System.out.println("Digite o raio: ");
		raio = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a altura: ");
		altura = Double.parseDouble(in.nextLine());
		
		area = 2 * Math.PI * raio * altura;
		
		System.out.println("Área superficial do cilindro: " + area);
		
		in.close();

	}

}
