//4 � Fa�a um algoritmo para calcular a �rea de um cone(pi*r*h)

package br.edu.ifcvidera.Lista1;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double altura;
		double raio;
		double area;
		
		System.out.println("Digite a altura: ");
		altura = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o raio: ");
		raio = Double.parseDouble(in.nextLine());
		
		area = Math.PI * raio * altura;
		
		System.out.println("�rea do cone: " + area);
		
		in.close();
	}
}
