package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 números e todos abaixo de 40 devem ser somados
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class Exercicio77 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarado as variáveis
		int numero;
		int contador;

		// inicializando a variável contador
		contador = 0;

		// iniciando o laço
		for (int i = 0; i < 10; i++) {
			// recebendo dados do usuário
			numero = Integer
					.parseInt(JOptionPane.showInputDialog("Para realizar a soma de alguns número, informe abaixo: "
							+ "\n" + "Digite o " + (i + 1) + "ª" + " número"));
			// verificando se o número e menor que 40
			if (numero < 40) {
				contador += numero; // somando o valor dos números inferior a 40
			}
		} // fim do laço
			// exibindo o resultado na tela
		JOptionPane.showMessageDialog(null, "A soma dos números inferiores a 40 é: " + contador);
	}

}
