package entities;

public class Blueprint extends Usuario {

	private Integer perfil;
	private Double saldo;
	

	public Blueprint() {
	}

	public Blueprint(Integer perfil, Double saldo) {
		this.perfil = perfil;
		this.saldo = saldo;
	}

	public Integer getPerfil() {
		return perfil;
	}

	public void setPerfil(Integer perfil) {
		this.perfil = perfil;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	// poupar
	
	public Double poupar() {
		// renda(20%) * mes (quantidade de tempo pra alcançar o objetivo)
		double poupanca = (super.getRenda() * 0.20) * 30;
		return poupanca;
	}

	// investir
	public Double investir() {
		// renda%(10) * mes 
		double investimento = (super.getRenda() * 0.10) * 30;
		return investimento;
	}

	public double plano(int objetivo) {
		
		return objetivo;
	}

}
