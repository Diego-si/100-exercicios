package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para saber se o funcionario se aposentar
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio63 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		int codigo, anoNascimento, anoEmpresa, idade, idadeEmpresa;

		codigo = Integer.parseInt(JOptionPane.showInputDialog(
				"Para saber se o funcionario esta pronto para a aponsentadoria, informe os dados abaixo: " + "\n"
						+ "Digite o código do empregado: "));
		anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do nascimento: "));
		anoEmpresa = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de ingresso na empresa: "));

		// realizando o calculo dos anos
		idade = 2021 - anoNascimento;
		idadeEmpresa = 2021 - anoEmpresa;

		// verificando a idade se tem no minimo 65 anos
		if (idade >= 65) {
			JOptionPane.showMessageDialog(null, "Código: " + codigo + "\n" + "A idade do funcionario é: " + idade + " anos" + "\n"
					+ "O tempo de empresa é: " + idadeEmpresa + " anos" + "\n" + "Requerer aposentadoria");
		} else // verificar se tem no minimo 30 anos de empresa
		if (idadeEmpresa >= 30) {
			JOptionPane.showMessageDialog(null, "Código: " + codigo + "\n" +  "A idade do funcionario é: " + idade + " anos" + "\n"
					+ "O tempo de empresa é: " + idadeEmpresa + " anos" + "\n" + "Requerer aposentadoria");
		} else // verificar se tem no minimo 60 anos e idade de empresa 25
		if ((idade >= 60) && (idadeEmpresa >= 25)) {
			JOptionPane.showMessageDialog(null, "Código: " + codigo + "\n" +  "A idade do funcionario é: " + idade + " anos" + "\n"
					+ "O tempo de empresa é: " + idadeEmpresa + " anos" + "\n" + "Requerer aposentadoria");
		} else {
			JOptionPane.showMessageDialog(null, "Código: " + codigo + "\n" +  "A idade do funcionario é: " + idade + " anos" + "\n"
					+ "O tempo de empresa é: " + idadeEmpresa + " anos" + "\n" + "Não requerer");
		}
	}

}
