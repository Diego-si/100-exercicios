package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular o gasto com chips para marca os frangos 
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class Exercicio31 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		//declarando variaveis
		int gasto, frango;
		
		//recebendo dados do usuario e atribuindo na variavel
		frango = Integer.parseInt(JOptionPane.showInputDialog("Para calcular o gasto para marcar todos os frangos com chips, informe os dados abaixo:" + "\n" +
															  "Digite o total de frangos: "));
		//realizando os calculos
		gasto = frango * 11;
		
		//exibindo dados na tela
		JOptionPane.showMessageDialog(null, "O total gasto com chips é: " + gasto);
	}

}
