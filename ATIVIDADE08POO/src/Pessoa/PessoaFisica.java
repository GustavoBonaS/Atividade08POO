package Pessoa;

public class PessoaFisica extends pessoa {
	private String cpf;
	private String estadocivil;

	public PessoaFisica(String nome, String endereco, String cpf, String estadocivil) {
		super(nome, endereco);
		setCpf(cpf);
		setEstadoCivil(estadocivil);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf.length() > 0 && cpf.length() == 14)
			this.cpf = cpf;
	}

	public String getEstadoCivil() {
		return estadocivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		if (estadoCivil.length() > 0)
			this.estadocivil = estadoCivil;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaFisica [cpf=");
		builder.append(cpf);
		builder.append(", estadocivil=");
		builder.append(estadocivil);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
	}

