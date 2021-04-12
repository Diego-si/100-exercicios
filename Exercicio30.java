package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler uma temperatura Celsius e imprimi-Ia em Fahrenheit
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class Exercicio30 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		//declarando as variaveis
		double grausF, grausC;
		
		//recebendo dados do usuario e atribuindo na variavel
		grausC = Double.parseDouble(JOptionPane.showInputDialog("Para transforma uma temperatura Celsius em Fahrenheit, passe os valores abaixo: " + "\n" +
																"Digite o valor em graus Celsius: "));
		// realizando a converção 
		grausF = ( grausC * 9 ) / 5 + 32;
		
		//exibindo dados na tela 
		JOptionPane.showMessageDialog(null, "O valor em graus Fahrenheit é: " + grausF);
	}

}
