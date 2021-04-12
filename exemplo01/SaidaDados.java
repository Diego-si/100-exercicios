package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar exibição de dados para o usuario
 * 
 * @author Diego Silva
 * @since 04/02/2021
 */
public class SaidaDados {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		//declarando variaveis
		double num1, num2, res;
		
		//atribuindo valores para as variaveis
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero"));
	
		//efetuando a operacao de multiplicacao
		res = num1 + num2;
		
		//exibindo o resultado para o usuario
		JOptionPane.showMessageDialog(null, "Primeiro valor digitado: " + num1 + "\n" +
											"O segundo valor digitado: " + num2 + "\n" +
											"O resultado da multiplicação é: " + res);
	}

}
