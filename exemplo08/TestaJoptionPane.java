package exemplo08;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a utiliza��o do componente JoptionPane acessando
 * atributos est�ticos
 *
 * @author Diego Almeida da Silva
 * @since 23 de fev. de 2021
 */
public class TestaJoptionPane {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// utilizando o JoptionPane com o construtor para exibi��o de mensagem de erro
		JOptionPane.showMessageDialog(null, "Conte�do", "T�tulo", 0); // 0 - c�digo do �cone de erro

		// utilizando o JoptionPane com o construtor para exibi��o de mensagem de info
		JOptionPane.showMessageDialog(null, Mensagem.sucessoIncluido, Titulo.cadastroUsuario, 1); // 1 - c�digo do �cone de info

		// utilizando o JoptionPane com o construtor para exibi��o de mensagem de
		// advert�ncia
		JOptionPane.showMessageDialog(null, "Conte�do", "T�tulo", 2); // 2 - c�digo do �cone de advert�ncia

		// utilizando o JoptionPane com o construtor para exibi��o de mensagem de
		// interroga��o
		JOptionPane.showMessageDialog(null, "Conte�do", "T�tulo", 3); // 3 - c�digo do �cone de interroga��o

	}

}
