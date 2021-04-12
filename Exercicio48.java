package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 3 valores e escrever o maior deles
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio48 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		double valo1, valo2, valo3, maior;

		// recebendo dados do usuario e atribuindo nas variaveis
		valo1 = Double.parseDouble(
				JOptionPane.showInputDialog("Vamos verificar o maior número dentre 3 valores, informe abiaxo: " + "\n"
						+ "Digite o primeiro número: "));
		valo2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
		valo3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número: "));

		// verificando qual e o maior deles
		if (valo1 > valo2) { // se valo1 for maior que o valo2
			maior = valo1; // entao maior recebe o valo1
		} else { // senao
			maior = valo2; // maior recebe o valo2
		}
		if (valo3 > maior) { // mas se valo3 for maior que o maior
			maior = valo3; // entao o maior recebe o valo3
		}

		// exibindo os dados na tela
		JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
	}

}
