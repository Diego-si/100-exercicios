package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler salário fixo , e calcular porcentagem se ultrapassar o
 * valor de vendas
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio45 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		double salFixo, vendas, resul;

		// recebendo dados do usuario e passa para as variaveis
		salFixo = Double.parseDouble(JOptionPane
				.showInputDialog("Para saber quanto você vai ganha com a comissão, informe os valores abaixo: " + "\n"
						+ "Digite o valor do seu salário fixo: "));

		vendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das vendas: "));

		// verificando os valor das vendas e atribuindo com o valor do salario , e
		// exibindo na tela o resultado
		if (vendas <= 1500) {
			resul = salFixo + (vendas * 3 / 100);
			JOptionPane.showMessageDialog(null, "O salário total com comissão é: " + resul);
		} else {
			resul = salFixo + (vendas * 5 / 100);
			JOptionPane.showMessageDialog(null, "O salário total com comissão é: " + resul);

		}
	}

}
