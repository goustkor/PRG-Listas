//1 � Fazer um programa que imprima os n�meros m�ltiplos de 10 at� 1000
package br.edu.ifcvideira.Lista4;

public class Exercicio01 {
	public static void main(String[] args) {
		int contador = 0;
		
		while(contador <= 1000) {
			if((contador % 10) == 0) {
				System.out.println(contador);
			}
			
			contador++;
		}
	}
}
