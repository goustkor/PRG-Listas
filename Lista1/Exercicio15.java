/*15 - Faça um algoritmo que leia o nome de um piloto, leia a distância percorrida
em km e o tempo que o piloto levou para percorrê-la (em horas). O algoritmo deve
calcular a velocidade média (velocidade = distancia / tempo) - em km/h, e exibir a
seguinte frase:
A velocidade média do <nome do piloto> foi <velocidade media calculada> km/h. */

package br.edu.ifcvidera.Lista1;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String nome_piloto;
		double distancia;
		double tempo;
		double velocidade_media;
		
		System.out.println("Digite o nome do piloto:");
		nome_piloto = in.nextLine();
		
		System.out.println("Digite a distancia percorrido em Km: ");
		distancia = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o tempo percorrido em horas: ");
		tempo = Double.parseDouble(in.nextLine());

		velocidade_media = distancia / tempo;
		
		System.out.println("A velocidade média de "+ nome_piloto +" foi de "+ velocidade_media +" km/h.");
		
		in.close();
	}

}
