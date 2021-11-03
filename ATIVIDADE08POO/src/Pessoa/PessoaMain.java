package Pessoa;

public class PessoaMain {

	public static void main(String[] args) {
		
		pessoa p = new pessoa("Gustavo", "Laurentino");
		System.out.println(p);

		PessoaFisica pf = new PessoaFisica ("Gustavo", "Laurentino", "123.123.123-12","Solteiro");
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica ("Gustavo", "Laurentino", ": XX.XXX.XXX/0001-XX","TipoEmpresa");
		System.out.println(pj);
	}

}
