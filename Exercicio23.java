package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler uma temperatura em graus Fahrenheit e passar para graus Celsius
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class Exercicio23 {

	/*
	 * Método principal para executar o programa 
	 */
	public static void main(String[] args) {

		//declarando variaveis
		double grausF, grausC;
		
		//recebendo valor do usuario e atribuindo na variavel
		grausF = Double.parseDouble(JOptionPane.showInputDialog("Para tranforma um valor em Fahrenheit em graus Celsius informe: " + "\n" +
		                                   						"Digite o valor em graus Fahrenheit: "));
		//realizando os calculos
		grausC = ((grausF - 32) * 5) / 9;
		
		//exibindo resultado na tela
		JOptionPane.showMessageDialog(null, "O valor em graus Celsius é: " + grausC);
	}

}
