package exemplo05;

/**
 * Programa para demonstrar a utiliza��o do vetor do tipo inteiro
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class VetorInteiro {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		//declarando o vetor
		int vetor[];
		
		//iniciando o vetor e informando a quantidade de posi��es(tamanho)
		vetor = new int[10];
		
		//adicionando o valor 10 na 1� posi��o do vetor no seu �ndice 0
		vetor[0] = 10;
		
		//adicionando o valor 5 na 2� posi��o do vetor no seu �ndice 1
		vetor[1] = 5;
		//adicionando o valor 25 na 3� posi��o do vetor no seu �ndice 2
		vetor[2] = 25;
		
		//exibindo o valor 
		System.out.println(vetor);
	}

}
