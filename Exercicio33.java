package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para para fazer uma contagem de moedas
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class Exercicio33 {

	/*
	 * Método principal para executar o programada
	 */
	public static void main(String[] args) {

		//declarando as variaveis
		double moeda1, moeda5, moeda10, moeda25, moeda50, moeda1Real, resultado;
		
		//recebendo os dados do usuario e atribuindo nas variaveis 
		moeda1 = Double.parseDouble(JOptionPane.showInputDialog("Para saber quanto em dinheiro você possue , informe a quantidade de moedas abaixo: " + "\n" +
																"Digite  a quantidade de moedas de 1 centavo: "));
		moeda5 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de moedas de 5 centavos: "));
		moeda10 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de moedas de 10 centavos: "));
		moeda25 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de moedas de 25 centavos: "));
		moeda50 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de moedas de 50 centavos: "));
		moeda1Real = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de moedas de 1 real: "));
		
		//realizando os calculos
		resultado = ( moeda1 / 100 ) + (( moeda5 * 5 ) / 100 ) + (( moeda10 * 10 ) / 100 ) + (( moeda25 * 25 ) / 100 ) + (( moeda50 * 50 ) / 100 ) + moeda1Real;
		
		//exibindo os dados na tela
		JOptionPane.showMessageDialog(null, "O valo total em reais é: " + resultado);
	}

}
