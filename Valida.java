package exercicios;

/**
 * Classe respons�vel por validar os nomes informados pelo usuario
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

	// m�todo para verificar String v�lida e maior que 1
	public static boolean isStringValida(String args) {
		return (!args.matches("[a-z A-Z\u00C0-\u00FF]*") || args.matches("[-0-9]*") || args.length() == 1);
	} // fim do m�todo

	// m�todo para verificar se a letra e v�lida
	public static boolean isLetraValida(String args) {
		return (args.matches("[0-9]*") || args.matches("[-0-9]*") || args.length() != 1);
	} // fim do m�todo
	
	
	// USADO NA CLASSE CalculaArray.java
	// verificando se o valor informado � zero
	public static boolean isIntZero(int args) {
		return (args <= 0);
	}

	// m�todo para verificar se � n�mero
	public static boolean isMenor(int args) {
		return (args < 0);
	}

}
