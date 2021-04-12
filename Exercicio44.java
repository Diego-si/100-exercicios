package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler numero de horas, salario por hora , e escrever salario
 * total com horas extras
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio44 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// delcarando as variaveis
		double horaTrabalhada, salarioHora, salarioTotal, salarioHoraTotal, horaExtra;

		// recebendo os dados do usuario e a tribuindo nas variaveis
		horaTrabalhada = Double.parseDouble(
				JOptionPane.showInputDialog("Para saber seu salario total com as horas extra, informe abaixo: " + "\n"
						+ "Digite o número de horas trabalhadas: "));
		salarioHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario por hora: "));

		// calculando o valor total do salario
		salarioHoraTotal = salarioHora * horaTrabalhada;

		// verificando se tem horas extras e exibindo resultado na tela
		if (horaTrabalhada > 160) {
			horaExtra = (horaTrabalhada - 160) * salarioHora;
			salarioTotal = salarioHoraTotal + (horaExtra * 50 / 100);
			JOptionPane.showMessageDialog(null, "O valor total do salario é: " + salarioTotal);
		} else {
			JOptionPane.showMessageDialog(null, "O valor total do salario é: " + salarioHoraTotal);
		}
	}

}
