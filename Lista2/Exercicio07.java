//7 - Ler 3 valores e escrever a soma dos 2 maiores (Considerando valores distintos). 
package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double v1;
		double v2;
		double v3;
		
		System.out.println("Digite o valor 1: ");
		v1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o valor 2: ");
		v2 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o valor 3: ");
		v3 = Double.parseDouble(in.nextLine());
		
		if(v1 == v2 && v1 == v3) {
			System.out.println("Todos os valores são iguais.");
		}
		
		if(v1 > v2) {
			if(v2 > v3) {
				System.out.println("Valor 1: " + v1 + "\n" + "Valor 2: " + v2);
			}else {
				System.out.println("Valor 1: " + v1 + "\n" + "Valor 3: " + v3);
			}
		}else if(v1 > v3) {
			System.out.println("Valor 1: " + v1 + "\n" + "Valor 2: " + v2);
		}else {
			System.out.println("Valor 2: " + v2 + "\n" + "Valor 3: " + v3);
		}
		
		in.close();

	}

}
