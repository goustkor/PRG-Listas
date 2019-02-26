// 1 – Ler um valor e escrever se é positivo, negativo ou zero.
package br.edu.ifcvidera.Lista2;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double valor;
		
		System.out.println("Digite um valor:");
		valor = Double.parseDouble(in.nextLine());
		
		if(valor == 0) {
			System.out.println("Zero");
		}else if (valor > 0) {
			System.out.println("Positivo");
		}else if (valor < 0) {
			System.out.println("Negativo");
		}
		
		in.close();

	}

}
