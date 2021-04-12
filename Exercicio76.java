package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 números e ao final escreve a soma total
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class Exercicio76 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variáveis
		int numero;
		int contador;

		// inicializando o contador
		contador = 0;

		// inciando o laço
		for (int i = 0; i < 10; i++) {
			// recebendo os dados do usuário
			numero = Integer.parseInt(JOptionPane.showInputDialog("Para saber a soma de 10 números digite abaixo: "
					+ "\n" + "Digite o " + (i + 1) + "ª" + " número"));
			contador += numero; // somando os números digitados
		} // fim do laço

		// exibindo o resultado na tela
		JOptionPane.showMessageDialog(null, "A soma dos números é: " + contador);
	}

}
