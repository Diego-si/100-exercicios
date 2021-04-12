package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar conversao de tipos de dados
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class ConverterDadosInt {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando variaveis
		int valor1;
		int valor2;
		int resultado;
		
		//recebendo valores do usuario
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));
		
		//calculando o resultado da soma
		resultado = valor1 + valor2;
		
		//exibindo o resultado da soma
		System.out.println("O resultado é: " + resultado);
	}

}
