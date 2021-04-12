package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler quantidade em kg e escrever o valor a ser pago peo produto
 * 
 * @author Diego Silva 
 * @since 09/02/2021
 */
public class Exercicio59 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		//declarando as variaveis
		int morangoKilo, macaKilo, quantidadeKg;
		double valorTotal, valorMorango, valorMaca, valorTotalDesconto;
		
		//recebendo dados do usuario e atribuindo nas variaveis
		morangoKilo = Integer.parseInt(JOptionPane.showInputDialog("Para calcular o valor a ser pago nas maças e morango, infome dados abaixo: " + "\n" + 
																   "Digite a quantidade em Kg de morango: "));

		macaKilo = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade em Kg de maças: "));
		
		//efetuando os calculos de acordo com a quantidade em kilos
		if (morangoKilo <= 5) {
			valorMorango = morangoKilo * 2.50;
		} else {
			valorMorango = morangoKilo * 2.20;
		}
		
		if (macaKilo <= 5) {
			valorMaca = macaKilo * 1.80;
		} else {
			valorMaca = macaKilo * 1.50;
		}
		
		//pegando o valor total de macas e morango
		valorTotal = valorMorango + valorMaca;
		// o peso total 
		quantidadeKg = morangoKilo + macaKilo;
		
		//verificando se tem algum desconto e exibindo o resultado na tela
		if ((quantidadeKg > 8 ) || (valorTotal > 25)) {
			valorTotalDesconto = valorTotal - (valorTotal * 10 / 100);
			JOptionPane.showMessageDialog(null, "O valor a ser pago com desconto é: " + valorTotalDesconto);
		} else {
			JOptionPane.showMessageDialog(null, "O valor a ser pago é: " + valorTotal);
		}
	}

}
