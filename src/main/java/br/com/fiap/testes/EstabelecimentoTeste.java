package br.com.fiap.testes;

import javax.persistence.Persistence;

public class EstabelecimentoTeste {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("estabelecimento").createEntityManager();

	}

}
