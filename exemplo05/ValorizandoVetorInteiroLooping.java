package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para valorizar um vetor do tipo inteiro informado pelo usuario usando o for
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class ValorizandoVetorInteiroLooping {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		//declarando o vetor
		int vetor[];
		
		//inicializando o vetor e definindo o seu tamanho
		vetor = new int[5];
		
		//recebendo os valores do usuario com o auxilio do comando for
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
		}
		
		//exibindo o vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
