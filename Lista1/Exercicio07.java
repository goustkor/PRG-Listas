//7 � Fa�a um algoritmo para calcular o volume de um cone (pi*r^2*h) / 3)

package br.edu.ifcvidera.Lista1;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double altura;
		double raio;
		double area;
		
		System.out.println("Digite a altura:");
		altura = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o raio:");
		raio = Double.parseDouble(in.nextLine());
		
		area = (Math.PI * Math.pow(raio, 2) * altura) / 3;
		
		System.out.println("Volume do cone: " + area);

		in.close();
	}

}
