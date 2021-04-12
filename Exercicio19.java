package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa ler um salario e calcular o reajuste e exibir
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class Exercicio19 {

	/*
	 * Método principal para a execução do programa
	 */
	public static void main(String[] args) {

		//declarando as variaveis
		double salario, novoSalario, percentual;
		
		//recebendo dados do usuario e atribuindo nas variaveis
		salario = Double.parseDouble(JOptionPane.showInputDialog("Para calcula o seu nono salário com o reajuse informe: " + "\n" +
																 "Digite o valor do seu salario:"));
		percentual = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem que vai ser aplicada."));
		
		//realizando o calculo para o novo salario
		novoSalario = salario + ( salario * percentual / 100 );
		
		//exibindo o resultado na tela
		JOptionPane.showMessageDialog(null, "O seu novo salário é: " + novoSalario);
	}

}
