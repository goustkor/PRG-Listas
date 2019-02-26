//5 - Ler 2 valores e escrevê-los em ordem crescente. 
package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double v1;
		double v2;
		
		System.out.println("Digite o valor 1: ");
		v1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o valor 2: ");
		v2 = Double.parseDouble(in.nextLine());
		
		if(v1 > v2)
			System.out.println(v1 + "\n" + v2);
		else
			System.out.println(v2 + "\n" + v1);
			
		
		in.close();

	}

}
