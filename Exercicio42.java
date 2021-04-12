package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dois numero e escrever em ordem crescente
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio42 {

	/*
	 * Método principal para executar a classe 
	 */
	public static void main(String[] args) {

		//declarando as variaveis
		double valor1, valor2;
		
		//recebendo dados do usuario e passando para as variaveis
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Para ver os números em ordem crescente, informe abaixo: " + "\n" + 
				"Digite um número: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));

		//fazendo a verificação dos número e escrever em ordem crescente e exibir na tela
		if (valor1 < valor2) {
			JOptionPane.showMessageDialog(null, "Os números em ordem crescente é: " + valor1 + " - " + valor2);
		} else {
			JOptionPane.showMessageDialog(null, "Os números em ordem crescente é: " + valor2 + " - " + valor1);
		}
	}

}
