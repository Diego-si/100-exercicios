package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 n�meros e ao final escreve a soma total
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class Exercicio76 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as vari�veis
		int numero;
		int contador;

		// inicializando o contador
		contador = 0;

		// inciando o la�o
		for (int i = 0; i < 10; i++) {
			// recebendo os dados do usu�rio
			numero = Integer.parseInt(JOptionPane.showInputDialog("Para saber a soma de 10 n�meros digite abaixo: "
					+ "\n" + "Digite o " + (i + 1) + "�" + " n�mero"));
			contador += numero; // somando os n�meros digitados
		} // fim do la�o

		// exibindo o resultado na tela
		JOptionPane.showMessageDialog(null, "A soma dos n�meros �: " + contador);
	}

}
