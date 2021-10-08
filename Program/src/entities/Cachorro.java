package entities;

public class Cachorro extends Animal{

	private String som;
	private String correr;

	public Cachorro() {
	}

	public Cachorro(String som, String correr) {
		super();
		this.som = som;
		this.correr = correr;
	}

	public String getsom() {
		return som;
	}

	public void setsom(String som) {
		this.som = som;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	@Override
	public String fazBarulho(String som) {
	this.som = som;
	return super.fazBarulho(som);
	}
	
	@Override
	public String habilidade(String acao) {
		this.correr = acao;
		return super.habilidade(acao);
	}

}
