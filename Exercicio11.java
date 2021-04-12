package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para realizar a multiplicacao de dois numeros
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class Exercicio11 {

	/*
	 * Método principal para executar o programa 
	 */
	public static void main(String[] args) {

		//declarando variaveis
		int num1, num2, resultado;
		
		//recebedo dados do usuario e atrbuindo nas variaveis
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Para realizar a multiplicação digite:" + "\n" +
															"O primeiro numero:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:"));
		
		//realizando o calculo
		resultado = num1 * num2;
		
		//exibindo os resultado da tela
		JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + resultado);
	}

}
