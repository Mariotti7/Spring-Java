package entities;

public class Cavalo extends Animal{
	
	private String som;
	private String correr;

	public Cavalo() {
	}

	public Cavalo(String som, String correr) {
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
