/*9 - Fa�a um algoritmo que leia um n� inteiro e mostre uma mensagem indicando 
se este n�mero � par ou �mpar. Ex: se (x%2=0) �x � par�, se (x%2=1) �x � impar�.*/
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
