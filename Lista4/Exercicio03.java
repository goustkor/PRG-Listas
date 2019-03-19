//3 – Fazer um programa que retorne quantos valores digitados pelo usuário são negativos:

package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int contadorNegative = 0;
		
		Boolean isLoop = true;
		
		System.out.println("Digite os números separados pelo ENTER. Digite 0 para termianr");
		while(isLoop) {
			int input = Integer.parseInt(in.nextLine());
			
			if(input == 0) {
				isLoop = false;
			}else if(input < 0) {
				contadorNegative ++;
			}
		}
		
		System.out.println("Foram digitado " + contadorNegative + " vezes um número negativo");
		
		in.close();
		
	}
}
