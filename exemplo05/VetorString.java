package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar a utilização do vetor do tipo String
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class VetorString {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		//declarando o vetorg
		String vetor[];
		
		//inicializando e definindo o tamanho do vetor
		vetor = new String[5];
		
		//valorizando o vetor recebendo os dados do usuario
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = JOptionPane.showInputDialog("Informe um nome");
		}
		
		//exibindo os dados gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
