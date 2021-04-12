package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 3 valores e escrever o menor deles
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio49 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		double valo1, valo2, valo3, menor;

		// recebendo dados do usuario e atribuindo nas variaveis
		valo1 = Double.parseDouble(
				JOptionPane.showInputDialog("Vamos verificar o menor número dentre 3 valores, informe abiaxo: " + "\n"
						+ "Digite o primeiro número: "));
		valo2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
		valo3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número: "));

		// verificando qual e o menor deles
		if (valo1 < valo2) { // se valo1 for menor que o valo2
			menor = valo1; // entao menor recebe o valo1
		} else { // senao
			menor = valo2; // menor recebe o valo2
		}
		if (valo3 < menor) { // mas se valo3 for menor que o menor
			menor = valo3; // entao o menor recebe o valo3
		}

		// exibindo os dados na tela
		JOptionPane.showMessageDialog(null, "O menor número é: " + menor);
	}

}
