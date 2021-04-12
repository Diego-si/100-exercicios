package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar entrada de dados fornecidos pelo usuario
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class EntradaDados {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {


		// declrando vari�veis
		String nome;
		
		//atribuir valor para a vari�vel nome informado pelo usuario
		nome = JOptionPane.showInputDialog("Digite seu nome");
		
		// exibindo dados no console
		System.out.println("Seu nome �: " + nome);
	}

}
