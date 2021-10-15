package entities;

public class SeuDinheiro extends Usuario {

	private Double receita;
	private Double rendimento;

	public SeuDinheiro() {
	}

	public SeuDinheiro(Double receita, Double rendimento) {
		this.receita = receita;
		this.rendimento = rendimento;
	}

	public Double getreceita() {
		return receita;
	}

	public void setreceita(Double receita) {
		this.receita = receita;
	}

	public Double getrendimento() {
		return rendimento;
	}

	public void setrendimento(Double rendimento) {
		this.rendimento = rendimento;
	}

	public double calculoPoupanca(Double receita) {
		this.receita = receita;
		return this.receita * 0.20;
	}

	public double calculoInvestimento(Double receita) {
		this.receita = receita;
		return this.receita * 0.10;
	}

	public String poupar() {
		return "Poupe por mês R$" + calculoPoupanca(receita);
	}

	public String investir() {
		return "Invista por mês R$" + calculoInvestimento(receita);
	}

	public Double total() {
		return calculoPoupanca(receita) + calculoInvestimento(receita);
	}

}
