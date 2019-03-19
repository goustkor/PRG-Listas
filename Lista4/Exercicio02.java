//2 – Fazer um programa que calcule a tabuada de qualquer número, e o limite de cálculo deve ser definido pelo usuário:
package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int tabuada;
		int vezes;
		int contador = 0;
		
		System.out.println("Qual tabuada deseja calcular:");
		tabuada = Integer.parseInt(in.nextLine());
		
		System.out.println("Quantas vezes deseja calcular:");
		vezes = Integer.parseInt(in.nextLine());
		
		while(contador <= vezes) {
			System.out.println(tabuada + " x " + contador + ": " + (tabuada * contador));
			
			contador++;
		}
		
		in.close();
	}
}
