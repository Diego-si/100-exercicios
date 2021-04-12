package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar a soma de um vetor do tipo inteiro
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class SomaVetor {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		//declarando o vetor
		int vetor[];
		
		//declarando a variavel auxiliar para somar o vetor
		int soma;
		
		//inicializando a variavel soma
		soma = 0;
		
		//inicializando o vetor
		vetor = new int[5];
		
		//valorizando as posições do vetor com os dados informados pelo usuario
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		}
		
		//somando o vetor com auxilio do comando for
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		//exibindo o resultado da soma do vetor
		System.out.println("O valor da soma é: " + soma);
	}

}
