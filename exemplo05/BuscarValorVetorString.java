package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para buscar um valor especifico no vetor String
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class BuscarValorVetorString {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		//declarando o vetor
		String vetor[];
		
		//inicializando o vetor e definindo o seu tamanho
		vetor = new String[3];
		
		//variavel auxiliar para buscar um registro
		String nome = JOptionPane.showInputDialog("Informe o que quer procurar");
		
		//valorizando o vetor com dados informados pelo usuario
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = JOptionPane.showInputDialog("Informe um nome");
		}
		
		//varrendo o vetor para verificar os registros armazenados
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].equals(nome)) {
				System.out.println("Achei o que você procurava na posição : " + i);
			}
		}
	}

}
