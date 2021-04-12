package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 3 valores e escrever a soma dos dois maiores
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio50 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		double valor1, valor2, valor3, menor, maior, maior2, soma;

		// recebendo os dados do usuario e atribuindo nas variaveis
		valor1 = Double.parseDouble(
				JOptionPane.showInputDialog("Vamos verificar a soma dentre 2 maiores valores, informe abiaxo: " + "\n"
						+ "Digite o primeiro número: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
		valor3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número: "));

		// verificando qual e o maior
		if (valor1 > valor2) {
			maior = valor1;
		} else {
			maior = valor2;
		}
		if (valor3 > maior) {
			maior = valor3;
		}

		// achando o menor
		if (valor1 < valor2) {
			menor = valor1;
		} else {
			menor = valor2;
		}
		if (valor3 < menor) {
			menor = valor3;
		}

		// achando o segundo maior
		if (valor1 != menor) {
			maior2 = valor1;
		} else if (valor2 != maior) {
			maior2 = valor2;
		} else {
			maior2 = valor3;
		}

		// realizando a soma dos maiores
		soma = maior + maior2;
		// exibindo resultado na tela
		JOptionPane.showMessageDialog(null, "A soma do dois maiores é: " + soma);
	}

}
