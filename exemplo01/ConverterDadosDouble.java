package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar conversao de dados do tipo string para double
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class ConverterDadosDouble {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		//declarando variáveis
		double valor1;
		double valor2;
		double resultado;
		
		// atribuindo valores para a variáveis informado pelo usuario
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Inform o primeiro valor"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Inform o segundo valor"));
		
		//efetuando o calculo de divisao
		resultado = valor1 / valor2;
				
		//exibindo o resultado da divisão no console
		System.out.println("O resultado da divisão é: " + resultado);
	}

}
