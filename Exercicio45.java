package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler sal�rio fixo , e calcular porcentagem se ultrapassar o
 * valor de vendas
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio45 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		double salFixo, vendas, resul;

		// recebendo dados do usuario e passa para as variaveis
		salFixo = Double.parseDouble(JOptionPane
				.showInputDialog("Para saber quanto voc� vai ganha com a comiss�o, informe os valores abaixo: " + "\n"
						+ "Digite o valor do seu sal�rio fixo: "));

		vendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das vendas: "));

		// verificando os valor das vendas e atribuindo com o valor do salario , e
		// exibindo na tela o resultado
		if (vendas <= 1500) {
			resul = salFixo + (vendas * 3 / 100);
			JOptionPane.showMessageDialog(null, "O sal�rio total com comiss�o �: " + resul);
		} else {
			resul = salFixo + (vendas * 5 / 100);
			JOptionPane.showMessageDialog(null, "O sal�rio total com comiss�o �: " + resul);

		}
	}

}
