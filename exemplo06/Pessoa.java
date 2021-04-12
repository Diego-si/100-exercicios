package exemplo06;

/**
 * Classe para demonstrar a utiliza��o de objetos
 * Renspons�vel por armazenar seus atributos e m�todos
 * 
 * @author Diego Almeida da Silva
 * @since 17 de fev. de 2021
 */
public class Pessoa {

	// atributos ou caracteristicas do objeto
	String nome;
	String dataNascimento;
	double altura;
	double peso;
	String sexo;
	
	//m�todo para exibir os dados do objetos
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Data de Nascimento: " + dataNascimento);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		System.out.println("Sexo: " + sexo);
		System.out.println("Idade: " + calcularIdade());
		System.out.println(maiorIdade());
	}
	
	// m�todo para retornar a idade da pessoa
	public int calcularIdade() {
		//declarando a vari�vel de retorno do m�todo
		int idade = 0;
		
		//variavel para armazenar o ano de nascimento
		int anoNascimento = 0;
		int anoAtual = 2021;
		
		//quebrando a data do tipo string
		//split quebra a string onde tem a /
		String dataQuebrada[] = dataNascimento.split("/");
		anoNascimento = Integer.parseInt(dataQuebrada[2]);
		
		//calculando a idade do objeto
		idade = anoAtual - anoNascimento;
		
		//retornando a idade calculada
		return idade;
	}
	
	public String maiorIdade() { 
		if ( calcularIdade() >= 18) {
			return "Maior de idade";
		} else {
			return "Menor de idade";
		}
	}
}
