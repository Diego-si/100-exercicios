package exemplo10;

/**
 * Classe responsável por armazenar os métodos de validação de dados
 *
 * @author Diego Almeida da Silva
 * @since 23 de fev. de 2021
 */
public class Valida {

	// método para verificar String vazia
	public static boolean isStringVazio(String args) {
		// COMANDO TRIM = tira os espaços da variável String
		if (args.trim().equals("")) {
			return true;
		} else {
			return false;
		}
	}// fim do método

	// método para verificar String válida
	public static boolean isStringValida(String args) {
		if (!args.matches("[0-9]*")) {
			return true;
		} else {
			return false;
		}
	} // fim do método

	// método para verificar se é número
	public static boolean isNumber(String args) {
		try {
			@SuppressWarnings("unused") // para evitar o warnings
			int numero = Integer.parseInt(args);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
