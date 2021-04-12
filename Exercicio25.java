package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para saber quantos litros de combustivel o usuario conseguio por no tanque
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class Exercicio25 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		//declarando as variaveis
		double litro, preco, valor;
		
		//reebendo informacoes do usuario e atribuindo nas variaveis
		preco = Double.parseDouble(JOptionPane.showInputDialog("Para saber a quantidade de litros que vai obter, abaixo: " + "\n" + 
															   "Digite o preço do litro da gasolina: "));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que vai querer pagar: "));
		
		//realizando os calculos
		litro = valor / preco;
		
		//exibindo resultados na tela
		JOptionPane.showMessageDialog(null, "A quantidade de litro de gasolina é: " + litro);
	}

}
