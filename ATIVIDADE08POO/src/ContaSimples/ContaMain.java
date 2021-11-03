package ContaSimples;

public class ContaMain {

	public static void main(String[] args) {
		/*
		Conta c = new Conta("Banco do Brasil",123,321,0);
		if (c.deposito(1000));
		System.out.println("Deposito Ok");
		System.out.println(c.deposito(-100));
		c.saque(100);
		c.saque(901);
		*/
		ContaSimples cs = new ContaSimples ("Caixa",456,654,100);
		System.out.println(cs.depositopoupanca(40000));
		System.out.println(cs.saquepoupanca(30000));
		System.out.println(cs.saquepoupanca(30000));
		
		System.out.println(cs);
		
	}

}
