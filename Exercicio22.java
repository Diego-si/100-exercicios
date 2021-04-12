package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular salario do vendedor apos comi��o
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class Exercicio22 {

	/*
	 * M�todo principal para executa o programa
	 */
	public static void main(String[] args) {

		//declarando variaveis
		int nCarros;
		double valorTvendas, salarioFixo, valorPorcarro, salarioFinal;
		
		//recebendo informaco��es do usuario e passando para as variaveis
		nCarros = Integer.parseInt(JOptionPane.showInputDialog("Para calcular o seu salario final com acrecimeo informe: " + "\n" +
															   "Digite o numero de carros: "));
		valorTvendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total de suas vendas:"));
		salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario fixo :"));
		valorPorcarro = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por carro vendido:"));
		
		//execultado o valor final
		salarioFinal = nCarros * valorPorcarro + salarioFixo + (valorTvendas *5 ) / 100;
		
		//exibindo resultado na tela
		JOptionPane.showMessageDialog(null, "O sal�rio final do vendedor �: " + salarioFinal);

	}
}
