package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um valor e escrever a sua tabuado do 1 ao 10
 *
 * @author Diego Almeida da Silva
 * @since 10 de fev. de 2021
 */
public class Exercicio71 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		//declarando variavel
		int valor;
		String resultado;
		double calculo;
		
		//inicializando a vari�vel de tabuada para entrar no looping
		valor = -1;
		
		//recebendo o valor do usu�rio entre 1 e 10
		while ((valor <= 0) || (valor > 10)) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero para saber a tabuada dele: "));
		}
		
		//valorizando o cabe�alho do resultado
		resultado = "Tabuada do " + valor + "\n";
		
		//la�o de repeti��o para calcular a tabuada
		for (int i = 1; i < 11; i++) {
			calculo = valor * i;
			resultado += valor + " x " + i + " = " + calculo + "\n";
		}
		
		// exibindo o resultado para o usuario
		JOptionPane.showMessageDialog(null, resultado);
	}

}
