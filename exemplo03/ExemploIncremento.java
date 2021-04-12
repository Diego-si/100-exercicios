package exemplo03;

/**
 * Programa para demonstrar a utiliza��o de Incremento
 * 
 * @author Diego Silva
 * @since 10/02/2021
 */
public class ExemploIncremento {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		//declarando as variaveis
		int numero;
		//atribuindo valor a vari�vel
		numero = 1;
		
		System.out.println(numero); // exibindo o valor 1
		
		numero = numero + 1; //incremento
		
		System.out.println(numero); // exibindo o valor 2
		
		numero++; //incremento
		
		System.out.println(numero); // exibindo o valor3

		System.out.println(numero++); // exibindo o valor3
		
		System.out.println(numero); // exibindo o valor4
		
		System.out.println(++numero); // exibindo o valor5
	}

}
