package exemplo08;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a utilização do componente JoptionPane acessando
 * atributos estáticos
 *
 * @author Diego Almeida da Silva
 * @since 23 de fev. de 2021
 */
public class TestaJoptionPane {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// utilizando o JoptionPane com o construtor para exibição de mensagem de erro
		JOptionPane.showMessageDialog(null, "Conteúdo", "Título", 0); // 0 - código do ícone de erro

		// utilizando o JoptionPane com o construtor para exibição de mensagem de info
		JOptionPane.showMessageDialog(null, Mensagem.sucessoIncluido, Titulo.cadastroUsuario, 1); // 1 - código do ícone de info

		// utilizando o JoptionPane com o construtor para exibição de mensagem de
		// advertência
		JOptionPane.showMessageDialog(null, "Conteúdo", "Título", 2); // 2 - código do ícone de advertência

		// utilizando o JoptionPane com o construtor para exibição de mensagem de
		// interrogação
		JOptionPane.showMessageDialog(null, "Conteúdo", "Título", 3); // 3 - código do ícone de interrogação

	}

}
