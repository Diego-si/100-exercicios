package exemplo03;

/**
 * Programa para demonstrar o decremento de valores
 * 
 * @author Diego Silva
 * @since 10/02/2021
 */
public class ExemploDecremento {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		int numero;

		// inicializando a variável
		numero = 1;

		System.out.println(numero); // exibindo o valor 1

		numero = numero - 1; // decrementando

		System.out.println(numero); // exibindo o valor 0

		// inicializando a variável
		numero = 10;

		numero--; // decrementando
		System.out.println(numero); // exibindo o valor 9

		numero--; // decrementando
		numero--; // decrementando

		System.out.println(numero); // exibindo o valor 7
	}

}
