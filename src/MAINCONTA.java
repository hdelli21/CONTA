public class MAINCONTA {
	public static void main(String[] args) {
		CONTA conta = new CONTA(1000.0);

		// Definindo taxas personalizadas se necessário
		conta.setTaxaSaque(0.02); // Definindo taxa de saque para 2%
		conta.setTaxaDeposito(0.01); // Definindo taxa de depósito para 1%

		// Realizando operações
		conta.calcularDeposito(500.0); // Chama o depósito padrão
		conta.calcularDeposito(300.0, 5.0); // Chama o depósito com taxa extra

		conta.calcularSaque(200.0); // Chama o saque padrão
		conta.calcularSaque(100.0, 2.0); // Chama o saque com taxa extra
	}
}