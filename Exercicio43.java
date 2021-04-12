package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler hora de início e fim de um jogo e calcular a duração
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio43 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		int horaI, horaF, resul;

		// recebendo dados do usuario e atribuindo nas variaveis
		horaI = Integer.parseInt(JOptionPane.showInputDialog(
				"Para calcular quantas os ocorreu de jogo, informe abaixo: " + "\n" + "Digite a hora de início: "));
		horaF = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de fim: "));

		// verificando os horario e exibindo na tela
		if (horaI > horaF) {
			resul = horaF - horaI + 24;
			JOptionPane.showMessageDialog(null, "A duração do jogo foi: " + resul);
		} else {
			resul = horaF - horaI;
			JOptionPane.showMessageDialog(null, "A duração do jogo foi: " + resul);
		}
	}

}
