package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para dividir a conta de 3 amigos sendo que um deles paga mais
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class Exercicio28 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		//declarando variaveis
		int carlos, andre;
		double felipe, valor,resul;
		
		//recebendo informacoes do usuario e atribuindo nas variaveis
		valor = Double.parseDouble(JOptionPane.showInputDialog("Para dividir a conta de um bar e fazer com que uma colega paque a mais, passe os dados abaixo: " + "\n" +
															 "Digite o valor da conta"));
		
		//dividindo o valor em 3
		resul = valor / 3;
		
		//passando o valor dividido para cada um deles
		carlos = (int) resul;
		andre = (int) resul;
		//o ultimo recebe um valor a mais 
		felipe = valor - (carlos + andre);
		
		//exibindo os dados na tela
		JOptionPane.showMessageDialog(null, "Carlos vai pagar: " + carlos + "\n" + 
											"Andre vai pagar: " + andre + "\n" +
											"Felipe vai pagar: " + felipe);
}

}
