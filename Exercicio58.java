package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber idade de homems e mulheres e calcular seus valores
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio58 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		double homem1, homem2, mulher1, mulher2;
		double somaH, somaM, somaHnovo, somaHvelho, somaMvelha, somaMnova;

		// recebendo dados do usuario e atribuindo nas variaveis
		homem1 = Double.parseDouble(
				JOptionPane.showInputDialog("Para fazer a soma de multiplicação de algumas idade, informe abaixo: "
						+ "\n" + "Digite a idade de um Homem:"));
		homem2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a idade de outro Homem: "));
		mulher1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a idade de uma Mulher: "));
		mulher2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a idade de outra Mulher: "));

		// encontrando homem velho
		if (homem1 > homem2) {
			somaHvelho = homem1;
		} else {
			somaHvelho = homem2;
		}
		// encontrando homem novo
		if (homem1 < homem2) {
			somaHnovo = homem1;
		} else {
			somaHnovo = homem2;
		}
		// encontrando a mulher velha
		if (mulher1 > mulher2) {
			somaMvelha = mulher1;
		} else {
			somaMvelha = mulher2;
		}
		// encontrando a mulher nova
		if (mulher1 < mulher2) {
			somaMnova = mulher1;
		} else {
			somaMnova = mulher2;
		}
		// somando as idades
		somaH = somaHvelho + somaMnova;
		somaM = somaMvelha * somaHnovo;

		// exibindo resultado na tela
		JOptionPane.showMessageDialog(null, "A idade do homem mais velho com a mulher mais nova é: " + somaH + "\n"
				+ "E produto da idade da mulher mais velha com homem mais novo é: " + somaM);
	}

}
