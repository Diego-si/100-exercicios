package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 n�meros e todos abaixo de 40 devem ser somados
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class Exercicio77 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarado as vari�veis
		int numero;
		int contador;

		// inicializando a vari�vel contador
		contador = 0;

		// iniciando o la�o
		for (int i = 0; i < 10; i++) {
			// recebendo dados do usu�rio
			numero = Integer
					.parseInt(JOptionPane.showInputDialog("Para realizar a soma de alguns n�mero, informe abaixo: "
							+ "\n" + "Digite o " + (i + 1) + "�" + " n�mero"));
			// verificando se o n�mero e menor que 40
			if (numero < 40) {
				contador += numero; // somando o valor dos n�meros inferior a 40
			}
		} // fim do la�o
			// exibindo o resultado na tela
		JOptionPane.showMessageDialog(null, "A soma dos n�meros inferiores a 40 �: " + contador);
	}

}
