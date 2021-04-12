package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar a utilização de vetor double em java
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class VetorDouble {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		//declarando o vetor
		double vetor[];
		
		//inicializando o vetor e seu tamanho
		vetor = new double[5];
		
		//recebendo os dados do usuario
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor: "));
		}
		
		//exibindo os dados gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
