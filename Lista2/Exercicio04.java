// 4 - Ler 2 valores e escrever o maior deles. 
package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double v1;
		double v2;
		
		System.out.println("Digite o valor 1: ");
		v1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o valor 2: ");
		v2 = Double.parseDouble(in.nextLine());
		
		if(v1 == v2)
			System.out.println("Valores iguais: " + v1);
		else if(v1 > v2)
			System.out.println("Valor 1 é maior: " + v1);
		else if(v1 < v2)
			System.out.println("Valor 2 é maior: " + v2);
		
		in.close();

	}

}
