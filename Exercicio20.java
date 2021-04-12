package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para converter dolar em real
 * 
 * @author Diego Silva
 *
 */
public class Exercicio20 {

	/*
	 * Métod principal para executar o pragrama
	 */
	public static void main(String[] args) {

		//declarando variaveis
	    double dolar, valor;
	    
	    //recebendo informações do usuario e passando para a varivel
	    dolar = Double.parseDouble(JOptionPane.showInputDialog("Para saber o valor de dolar em real informe: " + "\n" + 
	    											"Digite o valor em dolar é:" ));
	    //passando o valor real para dolar
	    valor = dolar * 6.61;
	    
	    //exibindo os resultados na tela
	    JOptionPane.showMessageDialog(null, "O valor em reais é: " + valor);
	}

}
