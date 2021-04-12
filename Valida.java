package exercicios;

/**
 * Classe responsável por validar os nomes informados pelo usuario
 *
 * @author Diego Almeida da Silva
 * @since 26 de fev. de 2021
 */
public class Valida {

	/*
	 * usado para A CLASSE VerificaArrayList.java
	 */

	// varificando se o valor digitado e nulo ou vazio
	public static boolean isEmptyOrNull(String string) {
		return (string == null || string.trim().equals(""));
	}

	// método para verificar String válida e maior que 1
	public static boolean isStringValida(String args) {
		return (!args.matches("[a-z A-Z\u00C0-\u00FF]*") || args.matches("[-0-9]*") || args.length() == 1);
	} // fim do método

	// método para verificar se a letra e válida
	public static boolean isLetraValida(String args) {
		return (args.matches("[0-9]*") || args.matches("[-0-9]*") || args.length() != 1);
	} // fim do método
	
	
	// USADO NA CLASSE CalculaArray.java
	// verificando se o valor informado é zero
	public static boolean isIntZero(int args) {
		return (args <= 0);
	}

	// método para verificar se é número
	public static boolean isMenor(int args) {
		return (args < 0);
	}

}
