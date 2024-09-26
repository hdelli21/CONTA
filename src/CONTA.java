public class CONTA {
	
	//Atributos
	public double saldo;
	public double taxaSaque; // Taxa de saque (1%)
	public double taxaDeposito; // Taxa de depósito (0.5%)

	// Construtor padrão
	public CONTA() {
		this.saldo = 0;
		this.taxaSaque = 0.01; // 1%
		this.taxaDeposito = 0.005; // 0.5%
	}

	// Construtor com saldo inicial
	public CONTA(double saldoInicial) {
		this.saldo = saldoInicial;
		this.taxaSaque = 0.01; // 1%
		this.taxaDeposito = 0.005; // 0.5%
	}

	// Método para realizar um saque com um único parâmetro
	public double calcularSaque(double saque) {
		return calcularSaque(saque, 0); // Chama o método sobrecarregado com taxa padrão 0
	}

	// Método para realizar um saque com um parâmetro e taxa extra
	public double calcularSaque(double saque, double taxaExtra) {
		if (saque <= 0) {
			throw new IllegalArgumentException("O valor de saque deve ser maior que 0.");
		}
		double taxaTotal = saque * taxaSaque + taxaExtra; // Taxa total
		if (saque + taxaTotal > saldo) {
			throw new IllegalArgumentException("Saldo insuficiente para o saque.");
		}
		saldo -= (saque + taxaTotal);
		System.out.println("Saque de R$ " + saque + " realizado. Taxa de R$ " + taxaTotal + " aplicada.");
		return saldo;
	}

	// Método para realizar um depósito com um único parâmetro
	public double calcularDeposito(double valor) {
		return calcularDeposito(valor, 0); // Chama o método sobrecarregado com taxa padrão 0
	}

	// Método para realizar um depósito com um parâmetro e taxa extra
	public double calcularDeposito(double valor, double taxaExtra) {
		if (valor <= 0) {
			throw new IllegalArgumentException("O depósito não pode ser 0.");
		}
		double taxaTotal = valor * taxaDeposito + taxaExtra; // Taxa total
		saldo += (valor - taxaTotal);
		System.out.println("Depósito de R$ " + valor + " efetuado. Taxa de R$ " + taxaTotal + " aplicada.");
		return saldo;
	}

	// Método para consultar saldo
	public double consultarSaldo() {
		return saldo;
	}

	// Método para aplicar uma taxa a cada 5 consultas
	public void aplicarTaxaPorConsultas(int numeroDeConsultas) {
		if (numeroDeConsultas % 5 == 0) {
			saldo -= 0.10; // Taxa de R$ 0,10 a cada 5 consultas
			System.out.println("Taxa de R$ 0,10 aplicada após 5 consultas.");
		}
	}

	// Métodos setters e getters
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTaxaSaque() {
		return taxaSaque;
	}

	public void setTaxaSaque(double taxaSaque) {
		this.taxaSaque = taxaSaque;
	}

	public double getTaxaDeposito() {
		return taxaDeposito;
	}

	public void setTaxaDeposito(double taxaDeposito) {
		this.taxaDeposito = taxaDeposito;
	}
}
