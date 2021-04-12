package exemplo01;

/**
 * Programa para demonstrar operações aritméticas
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class OperadoresAritmeticos {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {


		// declarando variaveis
		int adicao;
		int subtracao;
		int multiplicacao;
		double divisao;
		int modulo;
		
		//exemplo de adição
		adicao = 10 + 5;
		
		//exemplo de subtração
		subtracao = 10 - 5;
		
		//exemplo de multiplicação 
		multiplicacao = 24 * 3;
		
		//exemplo de divisão 
		divisao = 25 / 6;
		
		//exemplo de modulo
		modulo = 10 % 3;
		
		//exibindo o resultado no console
		System.out.println("10 + 5 = " + adicao);
		System.out.println("10 - 5 = " + subtracao);
		System.out.println("24 * 3 = " + multiplicacao);
		System.out.println("25 / 6 = " + divisao);
		System.out.println("10 % 3 = " + modulo);

	}

}
