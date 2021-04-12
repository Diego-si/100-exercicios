package exemplo07;

/**
 * Programa para testar o objeto Pessoa
 *
 * @author Diego Almeida da Silva
 * @since 17 de fev. de 2021
 */
public class TestaPessoa {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		//declarar e instanciar o objeto pessoa
		Pessoa joao = new Pessoa();
		
		//atribuindo os valores ao objeto joao
		joao.setNome("Joao da Silva");
		
		//criando e instanciando o objeto de data
		Data dataNascimento = new Data();
		
		//inicializando a data do objeto joao
		dataNascimento.setDia(10);
		dataNascimento.setMes(02);
		dataNascimento.setAno(1985);
		
		//atribuindo os valores de data para o objeto joao
		joao.setDataNascimento(dataNascimento);
		
		//atribuindo o salario
		joao.setSalario(1500.98);
		
		//exibindo os dado do objeto joao
		System.out.println("Nome: " + joao.getNome());
		System.out.println("Data de Nascimento: " + joao.getDataNascimento());
		System.out.println(joao.getDataNascimento().faixaEtaria());
		System.out.println(joao.salariAl());
	}

}
