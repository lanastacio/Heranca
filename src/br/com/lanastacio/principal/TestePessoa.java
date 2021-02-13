package br.com.lanastacio.principal;

import java.util.Date;

import br.com.lanastacio.model.Pessoa;

public class TestePessoa {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Gilson");
		pessoa.setDataInclusao(new Date());
		
		
		System.out.println(pessoa);
		
	}

}
