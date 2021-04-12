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
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		//declarando vari�veis
		double valor1;
		double valor2;
		double resultado;
		
		// atribuindo valores para a vari�veis informado pelo usuario
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Inform o primeiro valor"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Inform o segundo valor"));
		
		//efetuando o calculo de divisao
		resultado = valor1 / valor2;
				
		//exibindo o resultado da divis�o no console
		System.out.println("O resultado da divis�o �: " + resultado);
	}

}
