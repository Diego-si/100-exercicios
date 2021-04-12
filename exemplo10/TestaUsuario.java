package exemplo10;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a utilização de exceções em java
 *
 * @author Diego Almeida da Silva
 * @since 23 de fev. de 2021
 */
public class TestaUsuario {

	/*
	 * Método principal para executar a classe
	 */
	public void receberDados() {
		if (Valida.isStringVazio(JOptionPane.showInputDialog(Mensagem.informeNome))) {
			JOptionPane.showMessageDialog(null, Mensagem.nomeVazio, "Cadastro de Usuário", 0);
		} else {
			JOptionPane.showMessageDialog(null, "Nome válido", "Cadastro de Usuário", 1);
		}

		if (Valida.isStringValida(JOptionPane.showInputDialog(Mensagem.informeNome))) {
			JOptionPane.showMessageDialog(null, "Nome válido", "Cadastro de Usuário", 1);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.nomeInvalido, "Cadastro de Usuário", 0);
		}
		
		if (Valida.isNumber(JOptionPane.showInputDialog(Mensagem.informeIdade))) {
			JOptionPane.showMessageDialog(null, "Idade Válida", "Cadastro de Usuário", 1);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.idadeInvalido, "Cadastro de Usuário", 0);
		}
		
	} // fim do método

	public static void main(String[] args) {
		new TestaUsuario().receberDados();
	}

}
