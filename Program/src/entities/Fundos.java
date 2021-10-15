package entities;

public class Fundos extends SeuDinheiro {

	public String fundoArrojado = "Fundo EconoGen Small Caps"; // 20%
	public String fundoConservador = "Fundo EconoLow Renda Fixa"; // 5%
	public String fundoSofisticado = "Fundo EconoMissionaria FlagShip 11"; // 10%

	SeuDinheiro dinheiro = new SeuDinheiro();

	public String CasaPropria() {
		return "\nNossa sugestão de investimento para o seu objetivo: \n" + fundoConservador
				+ " | com redimentos de até 5% fixo ao ano | Um investimento CONSERVADOR";
	}

	public String Carro() {
		return "\nNossa sugestão de investimento para o seu objetivo: \n" + fundoSofisticado
				+ " | com redimentos de até 10% com baixa volatilidade ao ano | Um investimento SOFISTICADO ";
	}

	public String Viagem() {
		return "\nNossa sugestão de investimento para o seu objetivo: \n" + fundoArrojado
				+ " | com redimentos de até 20% com alta volatilidade ao ano | Um investimento ARROJADO";
	}

	public String Aposentadoria() {
		return "\nNossa sugestão de investimento para o seu objetivo: \n" + fundoConservador
				+ " | com redimentos de até 5% fixo ao ano | Um investimento CONSERVADOR";
	}

	// MÉTODOS DA CASA PRÓPRIA

	public double calculoFundoConservador(Double receita) {
		double fc = (dinheiro.calculoInvestimento(receita) * 0.05) * 12;
		double total = fc + (dinheiro.calculoInvestimento(receita) * 12);
		return total;
	}

	public double fundoInvestimentoCasaPropria(Double receita) {
		double anual = (dinheiro.calculoPoupanca(receita) + calculoFundoConservador(receita));
		return anual;
	}

	public double somaRendimentosCasaPropria(Double receita) {
		double investimento = fundoInvestimentoCasaPropria(receita);
		double poupanca = dinheiro.calculoPoupanca(receita) * 12;
		return investimento + poupanca;
	}

	public double calculoAnualCasaPropria(Double receita) {
		double valorCasaPropriaBase = 299000;
		return valorCasaPropriaBase / somaRendimentosCarro(receita);
	}

	// MÉTODOS DO CARRO
	public double calculoFundoSofisticado(Double receita) {
		double fs = (dinheiro.calculoInvestimento(receita) * 0.10) * 12;
		double total = fs + (dinheiro.calculoInvestimento(receita) * 12);
		return total;
	}

	public double fundoInvestimentoCarro(Double receita) {
		double anual = (dinheiro.calculoPoupanca(receita) + calculoFundoSofisticado(receita));
		return anual;
	}

	public double somaRendimentosCarro(Double receita) {
		double investimento = fundoInvestimentoCarro(receita);
		double poupanca = dinheiro.calculoPoupanca(receita) * 12;
		return investimento + poupanca;
	}

	public double calculoAnualCarro(Double receita) {
		double valorCarroBase = 59000;
		return valorCarroBase / somaRendimentosCarro(receita);
	}

	// MÉTODOS DA VIAGEM
	public double calculoFundoArrojado(Double receita) {
		double fa = (dinheiro.calculoInvestimento(receita) * 0.20) * 12;
		double total = fa + (dinheiro.calculoInvestimento(receita) * 12);
		return total;
	}

	public double fundoInvestimentoViagem(Double receita) {
		double anual = (dinheiro.calculoPoupanca(receita) + calculoFundoArrojado(receita));
		return anual;
	}

	public double somaRendimentosViagem(Double receita) {
		double investimento = fundoInvestimentoViagem(receita);
		double poupanca = dinheiro.calculoPoupanca(receita) * 12;
		return investimento + poupanca;
	}

	public double calculoAnualViagem(Double receita) {
		double valorViagemBase = 20000;
		return valorViagemBase / somaRendimentosViagem(receita);
	}

	// MÉTODOS DA APOSENTADORIA

	public double calculoFundoConservadorAposentadoria(Double receita) {
		double fca = (dinheiro.calculoInvestimento(receita) * 0.05) * 12;
		double total = fca + (dinheiro.calculoInvestimento(receita) * 12);
		return total;
	}

	public double fundoInvestimentoAposentadoria(Double receita) {
		double anual = (dinheiro.calculoPoupanca(receita) + calculoFundoConservador(receita));
		return anual;
	}

	public double somaRendimentosAposentadoria(Double receita) {
		double investimento = fundoInvestimentoAposentadoria(receita);
		double poupanca = dinheiro.calculoPoupanca(receita) * 12;
		return investimento + poupanca;
	}

	public double calculoAnualAposentadoria(Double receita) {
		double valorAposentadoriaBase = 1000000;
		return valorAposentadoriaBase / somaRendimentosAposentadoria(receita);
	}

}
