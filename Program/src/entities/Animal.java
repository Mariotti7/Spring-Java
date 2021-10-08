package entities;

public class Animal {

	private String nome;
	private String emitirSom;
	private String acao;

	public Animal() {
	}

	public Animal(String nome, String emitirSom, String acao) {
		this.nome = nome;
		this.emitirSom = emitirSom;
		this.acao = acao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmitirSom() {
		return emitirSom;
	}

	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
	
	public String fazBarulho(String som) {
		this.emitirSom = som;
		return "Eu faço " + som;
	}
	
	public String habilidade(String correr) {
		this.acao = correr;
		return "Minha habilidade é " + correr;
	}

}
