package entities;

public class Usuario {

	private String nome;
	private int idade;
	private int objetivo;

	public Usuario() {
	}

	public Usuario(String nome, int idade, int objetivo) {
		this.nome = nome;
		this.idade = idade;
		this.objetivo = objetivo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getobjetivo() {
		return objetivo;
	}

	public void setobjetivo(int objetivo) {
		this.objetivo = objetivo;
	}

	public String objetivoCasaPropria() {
		return "Aaah o sonho da CASA PRÓPRIA!";
	}

	public String objetivoCarro() {
		return "Ter um CARRO NOVO facilita muito a vida!";
	}

	public String objetivoViagem() {
		return "Como é bom poder VIAJAR!!";
	}

	public String objetivoAposentadoria() {
		return "Hora de relaxar com os pés pra cima, essa é minha APOSENTADORIA";
	}

}
