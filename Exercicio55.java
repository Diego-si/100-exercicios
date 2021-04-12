package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dois valores de time, escrever o vender.
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio55 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		String time1, time2;
		int gols1, gols2;

		// recebendo dados do usuario e atribuindo nas variaveis
		time1 = JOptionPane.showInputDialog("Para saber os times vencedores, informe os dados abaixo " + "\n"
				+ "Informe o nome do primeiro time: ");
		gols1 = Integer.parseInt(JOptionPane.showInputDialog("informe o primeiro número de gols"));
		time2 = JOptionPane.showInputDialog("Informe o nome do segundo time:");
		gols2 = Integer.parseInt(JOptionPane.showInputDialog("informe o segundo número de gols"));

		// calculando os dadod
		if (gols1 == gols2) {
			JOptionPane.showMessageDialog(null, "EMPATE");
		} else if (gols1 > gols2) {
			JOptionPane.showMessageDialog(null, "O vencedor é: " + time1);
		} else {
			JOptionPane.showMessageDialog(null, "O vencedor é: " + time2);
		}
	}
}
