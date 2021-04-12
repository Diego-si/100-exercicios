package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular quantos litros de agua e suco sao necessario para fazer x litros de refresco
 * 
 * @author Diego Silva
 * @since 08/02/2021
 */
public class Exercicio34 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		//declarando variaveis
		double refri, agua, suco;
		
		//recebendo dados do usuario e atribuindo nas variaveis
		refri = Double.parseDouble(JOptionPane.showInputDialog("Para saber quanto vai gastar em litros para fazer refresco com agua e suco, infome abaixo: " + "\n" + 
															   "Digite a quantidade de litros de refresco: "));
		//realizando os calculos
		agua = 8 * refri / 10;
		suco = 2 * refri / 10;
		
		//exibindo os dados na tela
		JOptionPane.showMessageDialog(null, "A quantidade em litros de água é: " + agua + "\n" +
											"A quantidade em litros de suco é: " + suco);
	}

}
