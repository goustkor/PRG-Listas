//Calcular a press�o de um objeto sobre o outro, usando Gravidade, Massa, Area. P = (m * g) / a
package br.edu.ifcvidera.Lista1;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double a;
		double g;
		double m;
		double p;
		
		System.out.println("Digite a area (m�): ");
		a = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a gravidade (m/s�)");
		g = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o peso (g)");
		m = Double.parseDouble(in.nextLine());
		
		p = (m * g) / a;
		
		System.out.println("A press�o � de: " + p + "Pa");
		
		in.close();

	}

}
