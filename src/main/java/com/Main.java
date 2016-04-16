package com;

public class Main {

	public static void main(String[] args) {
		double valorImc = 0;
		double peso = 40;
		double altura = 2;

		ImcBO imcBo = new ImcBO();
		valorImc = imcBo.calculaImc(peso, altura);
		System.out.println("Seu IMC é: " + valorImc);
	}

}
