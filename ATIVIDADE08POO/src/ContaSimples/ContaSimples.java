package ContaSimples;

public class ContaSimples extends Conta {
	
	private double saldopoupanca;

	public ContaSimples(String banco, int agencia, int numeroconta, double saldo) {
		super(banco,agencia,numeroconta,saldo);
	}
	
	public ContaSimples () {
		
	}

	public double getSaldopoupanca() {
		return saldopoupanca;
	}

	public void setSaldopoupanca(double saldopoupanca) {
		this.saldopoupanca = saldopoupanca;
	}
	public boolean depositopoupanca(double valor) {
		if (valor > 0) {
			setSaldopoupanca(getSaldopoupanca() + valor);
			return true;
		}
		return false;
	}

	public boolean saquepoupanca(double valor) {
		if (valor <= getSaldo()) {
			setSaldopoupanca(getSaldopoupanca() - valor);
			return true;
		}
		return false;
	}
	
	public double total() {
		return getSaldo()+ getSaldopoupanca();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldopoupanca=");
		builder.append(saldopoupanca);
		builder.append(", total()= ");
		builder.append(total());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
}
