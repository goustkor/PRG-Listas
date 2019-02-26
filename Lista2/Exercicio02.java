/*2 - Ler as notas da 1ª e 2ª avaliação de um aluno. Calcular a média aritmética 
simples e escrever uma mensagem que diga se o aluno foi ou não aprovado 
(considerar que se a nota for igual ou maior que 7 o aluno é aprovado). Escrever 
também a média calculada. */

package br.edu.ifcvidera.Lista2;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double av1;
		double av2;
		double media;
		
		System.out.println("Digite a nota da primeira avaliação: ");
		av1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a nota da segunda avaliação: ");
		av2 = Double.parseDouble(in.nextLine());
		
		media = (av1 + av2) / 2; 
		
		if(media >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
		in.close();

	}

}
