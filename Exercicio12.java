package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valore e mostrar a sua divis�o
 * 
 * @author Diego Silva
 *
 */
public class Exercicio12 {

	/*
	 * M�todo principal para executar o programa 
	 */
	public static void main(String[] args) {

		//declarando as variaveis
		int num1, num2;
		double resultado;
		
		//recebendo dados do usuario e atribuindo as variaveis
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Para fazer a divis�o informe os numero:" + "\n" + 
															"Digite o primeiro numero:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:"));
		
		//calculando o resultado
		resultado = num1 / num2;
		
		//exibindo o resultado na tela
		JOptionPane.showMessageDialog(null, "O resultado da divis�o �: " + resultado);
	}

}
