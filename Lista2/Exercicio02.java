/*2 - Ler as notas da 1� e 2� avalia��o de um aluno. Calcular a m�dia aritm�tica 
simples e escrever uma mensagem que diga se o aluno foi ou n�o aprovado 
(considerar que se a nota for igual ou maior que 7 o aluno � aprovado). Escrever 
tamb�m a m�dia calculada. */

package br.edu.ifcvidera.Lista2;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double av1;
		double av2;
		double media;
		
		System.out.println("Digite a nota da primeira avalia��o: ");
		av1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a nota da segunda avalia��o: ");
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
