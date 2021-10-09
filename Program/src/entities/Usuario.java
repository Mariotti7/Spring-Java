package entities;

public class Usuario {

	private String nome;
	private String idade;
	private Double renda;

	public Usuario() {
	}

	public Usuario(String nome, String idade, Double renda) {
		this.nome = nome;
		this.idade = idade;
		this.renda = renda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}


}
