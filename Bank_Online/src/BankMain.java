
public class BankMain {

	public static void main(String[] args) {
		Cliente denise = new Cliente();
		denise.setNome("Denise");
		
		Conta cc = new ContaCorrente(denise);
		cc.depositar(100);
		
		
		Conta pp = new ContaPoupanca (denise);
		
		cc.transferir(20, pp);
		
	    cc.imprimirExtrato();
	    pp.imprimirExtrato();
	    
	}

}
