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
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {


		// declrando variáveis
		String nome;
		
		//atribuir valor para a variável nome informado pelo usuario
		nome = JOptionPane.showInputDialog("Digite seu nome");
		
		// exibindo dados no console
		System.out.println("Seu nome é: " + nome);
	}

}
