package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 3 notas e calcular a média de aproveitamento
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio62 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		double nota1, nota2, nota3, mediaExercicios, mediaAproveitamento;

		// recebendo dados do usuario e atribuindo nas variaveis
		nota1 = Double.parseDouble(JOptionPane.showInputDialog(
				"Para calcular a média de aproveitamento, informe abiaxo: " + "\n" + "Digite a primeiro nota: "));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segundo nota: "));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceiro nota: "));

		// verificando a media dos exercicios
		mediaExercicios = (nota1 + nota2 + nota3) / 3;
		// verificando o aproveitamento
		mediaAproveitamento = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaExercicios) / 7;

		// verificando o conceito do aluno
		if (mediaAproveitamento >= 9) {
			JOptionPane.showMessageDialog(null, "O conceito é: A");
		} else if ((mediaAproveitamento >= 7.5) && (mediaAproveitamento < 9)) {
			JOptionPane.showMessageDialog(null, "O conceito é: B");
		} else if ((mediaAproveitamento >= 6) && (mediaAproveitamento < 7.5)) {
			JOptionPane.showMessageDialog(null, "O conceito é: C");
		} else if (mediaAproveitamento < 6) {
			JOptionPane.showMessageDialog(null, "O conceito é: D");
		}
	}

}
