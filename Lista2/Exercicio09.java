/*9 - Faça um algoritmo que leia um nº inteiro e mostre uma mensagem indicando 
se este número é par ou ímpar. Ex: se (x%2=0) “x é par”, se (x%2=1) “x é impar”.*/
package br.edu.ifcvidera.Lista2;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double valor;

		System.out.println("Digite um valor: ");
		valor = Double.parseDouble(in.nextLine());
		
		if((valor % 2) == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
		
		in.close();

	}

}
