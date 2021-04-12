package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e escrever quantos são NEGATIVOS
 *
 * @author Diego Almeida da Silva
 * @since 10 de fev. de 2021
 */
public class Exercicio72 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		int valor;
		int contador;

		// inicializando a variavel de contagem de numeros negativos
		contador = 0;

		// recebendo os valores digitados pelo usuario
		for (int i = 0; i < 10; i++) {
			// valor digitado pelo usuario
			valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "ª" + " número"));

			// verificando se o valor e negativo
			if (valor < 0) { // inicio da verificação se o numero e negativo
				contador++;
			} // fim da verificação se o numero e negativo
		} // fim do laço de verificação
		JOptionPane.showMessageDialog(null, "O número de valores negativos é: " + contador);

	}

}
