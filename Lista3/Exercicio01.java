package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String cpf;
		int dependentes;
		int tempDependentes;
		double renda;
		int sMinimo = 954;
		
		double totalAPagar;

		System.out.println("Digite seu CPF:");
		cpf = in.nextLine();
		
		System.out.println("Quantidade de dependentes:");
		dependentes = Integer.parseInt(in.nextLine());
		
		System.out.println("Digite sua renda mensal");
		renda = Double.parseDouble(in.nextLine());
		
		if(dependentes > 3) {
			tempDependentes = 3;
		}else { 
			tempDependentes = dependentes;
		}
		
		if(renda <= (sMinimo * 2)) {
			totalAPagar = 0;
		}else if(renda <= (sMinimo * 3)) {
			if(tempDependentes > 0) {
				totalAPagar = 0;
			}else {
				totalAPagar = (renda * 5)/100;
			}
		}else if(renda <= (sMinimo * 5)) {
			if(tempDependentes > 1) {
				totalAPagar = 0;
			}else {
				totalAPagar = (renda * (10 - (tempDependentes * 5)))/100;
			}
		}else if(renda <= (sMinimo * 7)) {
			if(tempDependentes > 2) {
				totalAPagar = 0;
			}else {
				totalAPagar = (renda * (15 - (tempDependentes * 5)))/100;
			}
		}else {
			totalAPagar = (renda * (20 - (tempDependentes * 5)))/100;
		}
				
		System.out.println("O contribuinte portador do CPF " + cpf + " com " + dependentes + " dependetes, e uma renda de R$" + renda +" devera pagar um total de R$" + totalAPagar + " em impostos.");
		
		in.close();
	}

}
