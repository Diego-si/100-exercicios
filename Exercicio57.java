package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o número de litros e o tipo de combustivel, aplicar
 * desconto e exibir na tela
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio57 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		String tipoCombustivel;
		double litro, valor;

		// recebendo dados do usuario e atribuindo nas variaveis
		tipoCombustivel = JOptionPane.showInputDialog("Para saber o valor que vai pegar: informe os dados abaixo: "
				+ "\n" + "Digite o tipo de combustivel:" + "\n" + "A - para álcool" + "\n" + "G - para Gasolina ");

		litro = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de litros que você vai compra:"));

		// verificando o tipo de combustivel
		switch (tipoCombustivel) {
		case "A": { // se o tipo de combustivel for A alcool ele cai nesta função
			valor = litro * 2.9; // atribuindo o valor do alcool vezes o litro
			if (litro <= 20) { // verificando a porcentagem de desconto
				valor = valor - valor * 3 / 100;
				JOptionPane.showMessageDialog(null, "O valor a ser pago no álcool é: " + valor);
			} else {
				valor = valor - valor * 5 / 100;
				JOptionPane.showMessageDialog(null, "O valor a ser pago no álcool é: " + valor);
			}
			break;
		}
		case "G": { // se o combustivel for G gasolina ele cai nesta função
			valor = litro * 3.30; // atribuindo o valor da gasolina vezes os litros
			if (litro <= 20) { // verificando a porcentagem de desconto
				valor = valor - valor * 4 / 100;
				JOptionPane.showMessageDialog(null, "O valor a ser pago da Gasolina é: " + valor);
			} else {
				valor = valor - valor * 6 / 100;
				JOptionPane.showMessageDialog(null, "O valor a ser pago da Gasolina é: " + valor);
			}
			break;
		}
		default:
			JOptionPane.showMessageDialog(null,
					"Digite o tipo de combustivel:" + "\n" + "A - para álcool" + "\n" + "G - para Gasolina ");
		}

	}

}
