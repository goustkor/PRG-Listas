package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio05 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int operador;
		double raio;
		
		System.out.println("Digite o operador:");
		System.out.println("1 - (3,14*raio²)");
		System.out.println("2 - (2*3,14*raio)");
		operador = Integer.parseInt(in.nextLine());
		
		System.out.println("Digite o raio:");
		raio = Double.parseDouble(in.nextLine());
		
		if(operador < 1 || operador > 2) {
			System.out.println("Operador mal informado.");
			return;
		}
		
		if(operador == 1) {
			System.out.println(Math.PI * Math.pow(raio, 2));
		}else {
			System.out.println(2 * Math.PI * raio);
		}
		
		in.close();

	}

}
