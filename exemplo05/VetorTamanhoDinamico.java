package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar vetor com o usuario informando o seu tamanho
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class VetorTamanhoDinamico {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		//declarando o vetor
		int vetor[];
		
		//variavel auxiliar informada pelo usuario para definir o tamanho do vetor
		int tamanho;
		
		//usuario informando o tamanho do vetor
		tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor" ));
		
		//inicialiazando o vetor e definindo o seu tamanho
		vetor = new int[tamanho];
		
		//recebendo do usuario os valores a serem gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));
		}
		
		//exibir os dados gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
