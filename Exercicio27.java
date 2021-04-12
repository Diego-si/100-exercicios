package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular o arrecadamento com vendas de camisas
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class Exercicio27 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		//declarando as variaveis
		int pequena, medio, grande, valor;
		
		//recebendo dados do usuario e passando para as variaveis
		pequena = Integer.parseInt(JOptionPane.showInputDialog("Para saber qual sera o valor arrecadado com as camisas me informe abaixo os valores: " + "\n" +
															"Digite quantas camisas pequenas voc� comprou: "));
		medio = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas camisas medias voc� comprou: "));
		grande = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas camisas grandes voc� comprou: "));
		
		//realizando os calculos
		valor = ( pequena * 10 ) + ( medio * 12 ) + ( grande * 15 );
		
		//exibindo resultado na tela
		JOptionPane.showMessageDialog(null, "O valor arrecadado �: " + valor);
	}

}
