package desafioDioBanco;

public class main {
	public static void main(String[] args) {
		
		Cliente Maikon = new Cliente();
		Maikon.setNome("Maikon");
		Maikon.setSobreNome("AllSmit");
		Maikon.setCPF("0013221198");
		Maikon.setEndereço(null);
		
		
		Conta cc = new ContaCorrente(Maikon);
		cc.depositar(100.00);
		
		
		Conta poupanca = new ContaPoupanca(Maikon);
		cc.transferir(50.00, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}
}
