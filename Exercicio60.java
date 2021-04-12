package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um codigo de usuario
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio60 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		int codigo, senha;

		// recebendo dados do usuario
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Para ter acesso ao sistema, informe os dados abaixo: "
				+ "\n" + "Digite seu código de acesso de 4 digitos: "));
		// validando informações do usuario
		if (codigo != 1234) {
			JOptionPane.showMessageDialog(null, "Usuário inválido!");
		} else {
			// se o usuario passar com o codigo pedir a senha
			senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha: "));
			if (senha != 9999) {
				JOptionPane.showMessageDialog(null, "Senha incorreta!");
			} else {
				JOptionPane.showMessageDialog(null, "Acesso permitido!");
			}
		}
	}

}
