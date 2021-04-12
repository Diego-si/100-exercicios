package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores escrever quantos estao no intervalo de 10 e 20
 *
 * @author Diego Almeida da Silva
 * @since 10 de fev. de 2021
 */
public class Exercicio73 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		int valor;
		int cont;
		int fora;

		// inicializando contador
		cont = 0;
		fora = 0;

		// recebendo os valores digitados pelo usuario
		for (int i = 0; i < 10; i++) {
			// valor digitado pelo usuario
			valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "ª" + " número"));

			// verificando os valores no intervalo de 10 e 20
			if ((valor >= 10) && (valor <= 20)) { // inicio da verificação se o numero esta entre os valores de 10 e 20
				cont++;
			} // fim da verificação dos numeros entre 10 e 20
			else { // pegando os valores fora do intervalo de 10 e 20
				fora++;
			}
		} // fim do laço
		JOptionPane.showMessageDialog(null, "O número de valores entre 10 e 20 são: " + cont + "\n"
				+ "O número de valores fora de 10 e 20 são: " + fora);
	}

}
