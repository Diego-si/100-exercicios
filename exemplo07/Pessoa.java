package exemplo07;

/**
 * Classe para armazenar os atributos e métodos do objeto Pessoa
 *
 * @author Diego Almeida da Silva
 * @since 17 de fev. de 2021
 */
public class Pessoa {

	// declarando os atributos de pessoa
	private String nome;
	private Data dataNascimento;
	private Double salario;

	// métodos para acessar os atributos
	public String getNome() {
		return nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	// calculando a faixa salarial
	public String salariAl() {
		if (salario >= 1163.55) {
			return "Acima do salário mínimo";
		} else {
			return "Abaixo do salário mínimo";
		}
	}
}
