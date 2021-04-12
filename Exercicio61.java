package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler descrição de um produto , quantidade preço , e escrever o
 * total adquirido
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio61 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		String nomeProduto;
		double quantidadeAdquirida, precoUnitario, total, valorTotal;

		// recebendo dados do usuario e atribuindo nas variaveis
		nomeProduto = JOptionPane.showInputDialog("Para calcular o valor qua vai custar os produtos, informe abaixo: "
				+ "\n" + "Qual o nome do produto ? ");
		quantidadeAdquirida = Double.parseDouble(
				JOptionPane.showInputDialog("Digite a quantidade de " + nomeProduto + " que vai comprar: "));
		precoUnitario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por unidade: "));

		// calculando o valor total
		total = quantidadeAdquirida * precoUnitario;

		// verificando a possibilidade de desconto menos de 5 quantidade
		if (quantidadeAdquirida <= 5) {
			valorTotal = total - (total * 2 / 100);
			JOptionPane.showMessageDialog(null, "O valor total de " + nomeProduto + " é: " + total + " reais" + "\n"
					+ "O valor total de " + nomeProduto + " com desconto de 2% é: " + valorTotal);
		} else // desconto acima de 5 e abaixo de 10
		if ((quantidadeAdquirida > 5) && (quantidadeAdquirida <= 10)) {
			valorTotal = total - (total * 3 / 100);
			JOptionPane.showMessageDialog(null, "O valor total de " + nomeProduto + " é: " + total + " reais" + "\n"
					+ "O valor total de " + nomeProduto + " com desconto de 3% é: " + valorTotal);
		} else // desconto acima de 10
		if (quantidadeAdquirida > 10) {
			valorTotal = total - (total * 5 / 100);
			JOptionPane.showMessageDialog(null, "O valor total de " + nomeProduto + " é: " + total + " reais" + "\n"
					+ "O valor total de " + nomeProduto + " com desconto de 5% é: " + valorTotal);
		}
	}

}
